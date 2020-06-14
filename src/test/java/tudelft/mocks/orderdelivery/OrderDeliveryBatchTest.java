package tudelft.mocks.orderdelivery;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.mockito.Mockito.*;

public class OrderDeliveryBatchTest {

    final Orders orders = mock(Orders.class);
    final DeliveryStartProcess delivery = mock(DeliveryStartProcess.class);
    final OrderDeliveryBatch batch = new OrderDeliveryBatch(orders, delivery);

    @Test
    void books_are_delivered() {

        Book o1 = new Book("Lord of the Rings", "Tolkien");
        Book o2 = new Book("Harry Potter", "JK Rowling");

        when(orders.paidButNotDelivered()).thenReturn(Arrays.asList(o1, o2));

        batch.runBatch();

        verify(delivery).deliver(o1);
        verify(delivery).deliver(o2);
        verifyNoMoreInteractions(delivery);

    }
}
