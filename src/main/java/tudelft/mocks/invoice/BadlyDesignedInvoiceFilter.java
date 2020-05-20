package tudelft.mocks.invoice;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class BadlyDesignedInvoiceFilter {

    public List<Invoice> lowValueInvoices() {
        final var connection = new DatabaseConnection();
        final var issuedInvoices = new InvoiceDao(connection);

        try {
            return issuedInvoices.all().stream()
                    .filter(invoice -> invoice.value < 100)
                    .collect(toList());
        } finally {
            connection.close();
        }
    }

}