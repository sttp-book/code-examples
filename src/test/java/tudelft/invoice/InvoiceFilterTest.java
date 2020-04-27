package tudelft.invoice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InvoiceFilterTest {
    private IssuedInvoices invoices;

    @BeforeEach public void open() {
        invoices = new IssuedInvoices();
    }

    @AfterEach public void closeDao() {
        if (invoices != null) invoices.close();
    }

    @Test
    void filterInvoices() {
        final var mauricio = new Invoice("Mauricio", 20);
        final var fred = new Invoice("Fred", 99);
        final var arie = new Invoice("Arie", 300);

        invoices.save(mauricio);
        invoices.save(fred);
        invoices.save(arie);

        final InvoiceFilter filter = new InvoiceFilter();

        assertThat(filter.lowValueInvoices()).containsExactlyInAnyOrder(mauricio, fred);
    }

}
