package decorator;

public class Client {

    public static void main(String[] args) {
//        Coffee coffee = new Espresso();
//        System.out.println(coffee.cost());
//
//        coffee = new Mocha(coffee);
//        System.out.println(coffee.cost());
//
//        coffee = new Whip(coffee);
//        System.out.println(coffee.cost());
//
//        coffee = new Mocha(coffee);
//        System.out.println(coffee.cost());
//
//        coffee.description();

        // decaf with 2 whips
//        Coffee coffee = new Decaf();
//        coffee = new Whip(coffee);
//
//        System.out.println(coffee.cost());
//        coffee = new Mocha(coffee);
//
//        System.out.println(coffee.cost());
//        coffee.description();


        Coffee coffee = new Whip(new Mocha(new Espresso()));
        System.out.println(coffee.cost());
        coffee.description();


    }
}
