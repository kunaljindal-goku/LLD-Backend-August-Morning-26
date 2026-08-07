package decorator;

import java.util.List;

public class Espresso implements Coffee{

    @Override
    public int cost() {
        return 100;
    }

    @Override
    public void description() {
        System.out.println("Expresso");
    }
}
