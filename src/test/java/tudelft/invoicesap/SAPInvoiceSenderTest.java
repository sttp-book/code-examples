package tudelft.invoicesap;

import org.junit.jupiter.api.Test;
import static java.util.Arrays.asList;
import static org.mockito.Mockito.*;

public class SAPInvoiceSenderTest {

	private final InvoiceFilter filter = mock(InvoiceFilter.class);
    private final SAP sap = mock(SAP.class);
	private final SAPInvoiceSender sender = new SAPInvoiceSender(filter, sap);

    @Test
    void sendToSap() {
        final Invoice mauricio = new Invoice("Mauricio", 20);
        final Invoice steve = new Invoice("Steve", 99);
        final Invoice arie = new Invoice("Arie", 300);

        when(filter.lowValueInvoices()).thenReturn(asList(mauricio, steve, arie));

        sender.sendLowValuedInvoices();

        verify(sap, times(3)).send(any(Invoice.class));
        verify(sap, times(1)).send(mauricio);
        verify(sap, times(1)).send(steve);
        verify(sap, times(1)).send(arie);
    }
}
