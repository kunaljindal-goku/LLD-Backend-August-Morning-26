package observer;

import java.util.ArrayList;
import java.util.List;

public class OrderFacade {

    private WmsService wmsService;
    private ShippingService shippingService;
    private InvoiceService invoiceService;
    private List<OrderPlacedSubscriber> subscribers;

    public OrderFacade() {
        this.invoiceService = new InvoiceService();
        this.shippingService = new ShippingService();
        this.wmsService = new WmsService();
        this.subscribers = new ArrayList<>();
    }

    public void registerSubscriber(OrderPlacedSubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void deregisterSubscriber(OrderPlacedSubscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void placeOrderFacade(String orderId, int productId, int quantity) {
        shippingService.createShipment(orderId);
        wmsService.updateInventory(productId,quantity);
        invoiceService.createInvoice(orderId);
        Order order = new Order();

        notifyAll(order); // tell that something has changed
    }

    private void notifyAll(Order order) {
        for(OrderPlacedSubscriber subscriber: subscribers) {
            subscriber.onOrderPlaced(order);
        }
    }
}
