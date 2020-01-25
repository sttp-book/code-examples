package tudelft.invoice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IssuedInvoices {
    private static Connection connection = null;

    public IssuedInvoices() {
        if(connection !=null) return;

        try {
            connection = DriverManager.getConnection("jdbc:hsqldb:mem:mymemdb.db", "SA", "");
            try (PreparedStatement preparedStatement = connection.prepareStatement("create table invoice (name varchar(100), value double)")) {
                preparedStatement.execute();
                connection.commit();
            }
        } catch (SQLException e) {
            throw new EnvironmentFailure(e);
        }
    }

    public List<Invoice> all() {
        try {
            try (PreparedStatement ps = connection.prepareStatement("select * from invoice")) {
                final ResultSet rs = ps.executeQuery();

                List<Invoice> allInvoices = new ArrayList<>();
                while (rs.next()) {
                    String name = rs.getString("name");
                    int value = rs.getInt("value");
                    allInvoices.add(new Invoice(name, value));
                }
                return allInvoices;
            }
        } catch (SQLException e) {
            throw new EnvironmentFailure(e);
        }

    }

    public void save(Invoice inv) {
        try {
            try (PreparedStatement ps = connection.prepareStatement("insert into invoice (name, value) values (?,?)")) {
                ps.setString(1, inv.customer);
                ps.setInt(2, inv.value);

                ps.execute();

                connection.commit();
            }
        } catch (SQLException e) {
            throw new EnvironmentFailure(e);
        }
    }

    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new EnvironmentFailure(e);
        }
        connection = null;
    }
}