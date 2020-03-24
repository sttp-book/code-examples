package tudelft.invoicesap;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


public class InvoiceFilterTest {
    private final IssuedInvoices issuedInvoices = mock(IssuedInvoices.class);
    private final SAP sap = mock(SAP.class);
    private final InvoiceFilter filter = new InvoiceFilter(issuedInvoices, sap);

    @Test
    void filterInvoices() {
        final var mauricio = new Invoice("Mauricio", 20);
        final var steve = new Invoice("Steve", 99);
        final var arie = new Invoice("Arie", 300);

        when(issuedInvoices.all()).thenReturn(asList(mauricio, arie, steve));

        assertThat(filter.lowValueInvoices()).containsExactlyInAnyOrder(mauricio, steve);
    }

    @Test
    void sendToSap() {
        final var mauricio = new Invoice("Mauricio", 20);
        final var steve = new Invoice("Steve", 99);
        final var arie = new Invoice("Arie", 300);

        when(issuedInvoices.all()).thenReturn(asList(mauricio, arie, steve));

        filter.lowValueInvoices();

        verify(sap, atMost(2)).send(any(Invoice.class));
        verify(sap, atMostOnce()).send(mauricio);
        verify(sap, atMostOnce()).send(steve);
        verify(sap, never()).send(arie);
    }

}
