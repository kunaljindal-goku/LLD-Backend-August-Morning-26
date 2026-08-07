package decorator;

public class Decaf implements Coffee{
    @Override
    public int cost() {
        return 120;
    }

    @Override
    public void description() {
        System.out.println("Decaf");
    }
}
