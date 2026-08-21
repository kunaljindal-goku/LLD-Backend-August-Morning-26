package observer;

public class WmsService {

    public void updateInventory(int productId, int quantity) {
        System.out.println("Quantity of product: "+productId+" has been updated to "+quantity);
    }
}
