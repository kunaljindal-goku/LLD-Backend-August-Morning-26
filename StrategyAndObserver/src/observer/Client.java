package observer;

public class Client {

    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        amazon.placeOrder("dis",10,3);

        LoyaltyProgService loyaltyProgService = new LoyaltyProgService(amazon);
        AnalyticService analyticService = new AnalyticService(amazon);

        amazon.placeOrder("123",1,10);
    }
}
