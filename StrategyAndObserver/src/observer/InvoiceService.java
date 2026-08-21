package observer;

public class InvoiceService {

    public void createInvoice(String orderId) {
        System.out.println("Invoice generated for: "+orderId);
    }
}
