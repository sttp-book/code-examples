package tudelft.mocks.orderdelivery;

import java.util.Collection;

public interface Orders {
    public Collection<Book> paidButNotDelivered();
}
