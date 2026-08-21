package observer;

public class LoyaltyProgService implements OrderPlacedSubscriber{

    public LoyaltyProgService(Amazon amazon) {
        amazon.getOrderFacade().registerSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {
        // lgic of updating loyalty
        System.out.println("Loyalty points updated");
    }
}
