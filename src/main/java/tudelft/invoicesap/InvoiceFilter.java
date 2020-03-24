package tudelft.invoicesap;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class InvoiceFilter {

    private final IssuedInvoices issuedInvoices;
    private final SAP sap;

    public InvoiceFilter (IssuedInvoices issuedInvoices, SAP sap) {
        this.issuedInvoices = issuedInvoices;
        this.sap = sap;
    }

	public List<Invoice> lowValueInvoices() {
		return issuedInvoices.all().stream()
				.filter(invoice -> invoice.value < 100)
				.peek(invoice -> sap.send(invoice))
				.collect(toList());
	}
}