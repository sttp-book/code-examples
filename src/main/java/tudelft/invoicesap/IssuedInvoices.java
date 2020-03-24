package tudelft.invoicesap;

import java.util.List;

public interface IssuedInvoices {
    List<Invoice> all();
    void save(Invoice inv);
}