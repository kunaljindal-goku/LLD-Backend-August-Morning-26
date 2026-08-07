package facade;

public class Client {

    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        amazon.placeOrder("dis",10,3);
    }
}
