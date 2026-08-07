package facade;

public class OrderFacade {

    private WmsService wmsService;
    private ShippingService shippingService;
    private InvoiceService invoiceService;

    public OrderFacade() {
        this.invoiceService = new InvoiceService();
        this.shippingService = new ShippingService();
        this.wmsService = new WmsService();
    }

    public void placeOrderFacade(String orderId, int productId, int quantity) {
        shippingService.createShipment(orderId);
        wmsService.updateInventory(productId,quantity);
        invoiceService.createInvoice(orderId);
    }
}
