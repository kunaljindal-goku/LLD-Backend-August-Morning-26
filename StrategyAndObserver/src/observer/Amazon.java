package observer;

public class Amazon {

    private OrderFacade orderFacade;

    public Amazon() {
        this.orderFacade = new OrderFacade();
    }

    void placeOrder(String orderId, int productId, int quantity) {
        orderFacade.placeOrderFacade(orderId,productId,quantity);
    }

    public OrderFacade getOrderFacade() {
        return orderFacade;
    }

    public void setOrderFacade(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }
}
