package observer;

public class AnalyticService implements OrderPlacedSubscriber{

    public AnalyticService(Amazon amazon) {
        amazon.getOrderFacade().registerSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Order order) {
        // capture analytics logic
        System.out.println("Analytics captured");
    }
}
