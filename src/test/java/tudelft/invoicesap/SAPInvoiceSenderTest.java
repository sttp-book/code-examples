package tudelft.invoicesap;

import org.junit.jupiter.api.Test;
import static java.util.Arrays.asList;
import static org.mockito.Mockito.*;

public class SAPInvoiceSenderTest {

	private static final InvoiceFilter filter = mock(InvoiceFilter.class);
    private static final SAP sap = mock(SAP.class);
	private static final SAPInvoiceSender sender = new SAPInvoiceSender(filter, sap);

    @Test
    void sendToSap() {
        final var mauricio = new Invoice("Mauricio", 20);
        final var steve = new Invoice("Steve", 99);
        final var arie = new Invoice("Arie", 300);

        when(filter.lowValueInvoices()).thenReturn(asList(mauricio, steve));

        sender.sendLowValuedInvoices();

        verify(sap, times(3)).send(any(Invoice.class));
        verify(sap, times(1)).send(mauricio);
        verify(sap, times(1)).send(steve);
        verify(sap, times(1)).send(arie);
    }
}
