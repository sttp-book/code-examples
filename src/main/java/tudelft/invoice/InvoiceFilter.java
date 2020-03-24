package tudelft.invoice;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class InvoiceFilter {

    public List<Invoice> lowValueInvoices() {
        final var issuedInvoices = new IssuedInvoices();
        try {
            return issuedInvoices.all().stream()
                    .filter(invoice -> invoice.value < 100)
                    .collect(toList());
        } finally {
            issuedInvoices.close();
        }
    }

}