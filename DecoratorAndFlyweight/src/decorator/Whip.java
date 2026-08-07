package decorator;

public class Whip extends Condiment{
    public Whip(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return 30 + coffee.cost();
    }

    @Override
    public void description() {
        coffee.description();
        System.out.println("Whip");
    }
}
