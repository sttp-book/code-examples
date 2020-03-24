package tudelft.invoicestubbed;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class InvoiceFilterTest {
    private final IssuedInvoices issuedInvoices = Mockito.mock(IssuedInvoices.class);
    private final InvoiceFilter filter = new InvoiceFilter(issuedInvoices);

    @Test
    void filterInvoices() {
        final var mauricio = new Invoice("Mauricio", 20);
        final var fred = new Invoice("Fred", 99);
        final var arie = new Invoice("Arie", 300);

        when(issuedInvoices.all()).thenReturn(asList(mauricio, arie, fred));

        assertThat(filter.lowValueInvoices()).containsExactlyInAnyOrder(mauricio, fred);
    }

}
