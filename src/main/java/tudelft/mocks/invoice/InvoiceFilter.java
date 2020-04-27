package tudelft.mocks.invoice;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class InvoiceFilter {

    private final IssuedInvoices issuedInvoices;

    public InvoiceFilter (IssuedInvoices issuedInvoices) {
        this.issuedInvoices = issuedInvoices;
    }

	public List<Invoice> lowValueInvoices() {
		return issuedInvoices.all().stream()
				.filter(invoice -> invoice.value < 100)
				.collect(toList());
	}
}