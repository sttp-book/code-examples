package tudelft.mocks.invoice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.sql.SQLException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InvoiceDaoIntegrationTest {

    private final DatabaseConnection connection = new DatabaseConnection();
    private final InvoiceDao dao = new InvoiceDao(connection);

    @BeforeEach
    void cleanup() throws SQLException {
        /**
         * Let's clean up the table before the test runs.
         * That will avoid possible flaky tests.
         */
        connection.getConnection().prepareStatement("truncate table invoice").execute();

        /**
         * Maybe you also want to double check if the cleaning operation
         * worked!
         */
        List<Invoice> invoices = dao.all();
        assertThat(invoices).isEmpty();
    }

    @AfterEach
    void close() {
        /**
         * Closing up the connection might also be something you do
         * at the end of each test.
         * Or maybe only at the end of the entire test suite, just to optimize.
         * (In practice, you should also use some connection pool, like C3P0,
         * to handle connections)
         */
        connection.close();
    }

    @Test
    void save() {
        final var inv1 = new InvoiceBuilder().build();
        final var inv2 = new InvoiceBuilder().build();

        dao.save(inv1);

        List<Invoice> afterSaving = dao.all();
        assertThat(afterSaving).containsExactlyInAnyOrder(inv1);

        dao.save(inv2);
        List<Invoice> afterSavingAgain = dao.all();
        assertThat(afterSavingAgain).containsExactlyInAnyOrder(inv1, inv2);
    }

    @Test
    void atLeast() {
        int value = 50;

        /**
         * Explore the boundary: value >= x
         * On point = x
         * Off point = x-1
         * In point = x + 1 (not really necessary, but it's cheap, and makes the
         *   test strategy easier to comprehend)
         */
        final var inv1 = new InvoiceBuilder().withValue(value - 1).build();
        final var inv2 = new InvoiceBuilder().withValue(value).build();
        final var inv3 = new InvoiceBuilder().withValue(value + 1).build();

        dao.save(inv1);
        dao.save(inv2);
        dao.save(inv3);

        List<Invoice> afterSaving = dao.allWithAtLeast(value);
        assertThat(afterSaving).containsExactlyInAnyOrder(inv2, inv3);
    }
}
