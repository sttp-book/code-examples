package tudelft.mocks.invoice;

import tudelft.mocks.invoice.InvoiceDao;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class BadlyDesignedInvoiceFilter {

    public List<Invoice> lowValueInvoices() {
        final var issuedInvoices = new InvoiceDao();
        try {
            return issuedInvoices.all().stream()
                    .filter(invoice -> invoice.value < 100)
                    .collect(toList());
        } finally {
            issuedInvoices.close();
        }
    }

}