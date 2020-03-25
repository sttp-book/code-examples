package tudelft.invoicesap;

public class SAPInvoiceSender {

	private final InvoiceFilter filter;
	private final SAP sap;

	public SAPInvoiceSender(InvoiceFilter filter, SAP sap) {
		this.filter = filter;
		this.sap = sap;
	}

	public void sendLowValuedInvoices() {
		filter.lowValueInvoices()
				.forEach(invoice -> sap.send(invoice));
	}
}
