package tudelft.invoicemocked;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface IssuedInvoices {
    List<Invoice> all();
    void save(Invoice inv);
}