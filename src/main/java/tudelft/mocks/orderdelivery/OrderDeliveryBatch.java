package tudelft.mocks.orderdelivery;

public class OrderDeliveryBatch {

    private final Orders orders;
    private final DeliveryStartProcess delivery;

    public OrderDeliveryBatch(Orders orders, DeliveryStartProcess delivery) {
        this.orders = orders;
        this.delivery = delivery;
    }

    public void runBatch() {
        for (Book book : orders.paidButNotDelivered()) {
            delivery.deliver(book);
        }
    }
}


