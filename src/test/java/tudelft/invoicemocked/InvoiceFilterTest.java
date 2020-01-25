package tudelft.invoicemocked;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

/* Notes:
    These are stubs, not mocks, as there are no assertions about what is called

    IssuedInvoices is now an interface, as the implementation is not relevant here

    The structure under test can be assembled at the top of the test
 */
public class InvoiceFilterTest {
    private final IssuedInvoices issuedInvoices = Mockito.mock(IssuedInvoices.class);
    private final InvoiceFilter filter = new InvoiceFilter(issuedInvoices);

    @Test
    void filterInvoices() {
        final Invoice mauricio = new Invoice("Mauricio", 20);
        final Invoice fred = new Invoice("Fred", 99);
        final Invoice arie = new Invoice("Arie", 300);

        when(issuedInvoices.all()).thenReturn(asList(mauricio, arie, fred));

        assertThat(filter.lowValueInvoices()).containsExactlyInAnyOrder(mauricio, fred);
    }

}
