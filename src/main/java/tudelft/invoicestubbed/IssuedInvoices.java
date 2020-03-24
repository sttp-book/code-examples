package tudelft.invoicestubbed;

import java.util.List;

public interface IssuedInvoices {
    List<Invoice> all();
    void save(Invoice inv);
}