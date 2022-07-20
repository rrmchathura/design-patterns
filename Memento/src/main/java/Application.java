public class Application {

    public static void main(String[] args){
        CareTaker careTaker = new CareTaker();
        Coffee coffee = new Coffee();
        coffee.addTopping(new Topping("Cream"));
        coffee.addTopping(new Topping("Chocolate"));

        careTaker.save(coffee);
        System.out.println(coffee);

        coffee.addTopping(new Topping("Ice"));
        careTaker.save(coffee);
        System.out.println(coffee);


        careTaker.revert(coffee);


    }
}
