package facade;

public class Amazon {

    private OrderFacade orderFacade;

    public Amazon() {
        this.orderFacade = new OrderFacade();
    }

    void placeOrder(String orderId, int productId, int quantity) {
        orderFacade.placeOrderFacade(orderId,productId,quantity);
    }
}
