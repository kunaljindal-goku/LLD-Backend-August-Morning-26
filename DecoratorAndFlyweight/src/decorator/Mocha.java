package decorator;

public class Mocha extends Condiment{

//    private int price;

    public Mocha(Coffee coffee) {
        super(coffee);
    }

//    // ccd/price/{input}
//    public void setPrice(int price) {
//        // read from database
//        this.price = price;
//    }

    @Override
    public int cost() {
        return 40 + coffee.cost();
    }

    @Override
    public void description() {
        coffee.description();
        System.out.println("Mocha");
    }
}
