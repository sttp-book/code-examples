package tudelft.invoice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IssuedInvoices {
    private static Connection connection = null;

    public IssuedInvoices() {
        if(connection !=null) return;

        withSql(() -> {
            connection = DriverManager.getConnection("jdbc:hsqldb:mem:mymemdb.db", "SA", "");
            try (var preparedStatement = connection.prepareStatement("create table invoice (name varchar(100), value double)")) {
                preparedStatement.execute();
                connection.commit();
            }
            return null;
        });
    }

    public List<Invoice> all() {
        return withSql( () -> {
            try (var ps = connection.prepareStatement("select * from invoice")) {
                final var rs = ps.executeQuery();

                List<Invoice> allInvoices = new ArrayList<>();
                while (rs.next()) {
                    allInvoices.add(new Invoice(rs.getString("name"), rs.getInt("value")));
                }
                return allInvoices;
            }
        });
    }

    public void save(Invoice inv) {
        withSql( () -> {
            try (var ps = connection.prepareStatement("insert into invoice (name, value) values (?,?)")) {
                ps.setString(1, inv.customer);
                ps.setInt(2, inv.value);
                ps.execute();

                connection.commit();
            }
            return null;
        });
    }

    public void close() {
        withSql( () -> {
            if (connection != null) {
                connection.close();
            }
            return null;
        });
        connection = null;
    }

    private static interface SqlSupplier<T> {
        T doSql() throws SQLException;
    }
    private static <T> T withSql(SqlSupplier<T> sqlSupplier) {
        try {
            return sqlSupplier.doSql();
        } catch (SQLException e) {
            throw new EnvironmentFailure(e);
        }
    }
}