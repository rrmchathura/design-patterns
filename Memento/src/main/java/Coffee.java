
import java.util.ArrayList;

public class Coffee {
    ArrayList<Topping> toppings = new ArrayList();



    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public ArrayList<Topping> getToppings() {
        return (ArrayList) toppings.clone();
    }

    public CoffeeMemento save() {
        return new CoffeeMemento(getToppings());
    }

    public void revert(CoffeeMemento coffeeMemento) {
        toppings = coffeeMemento.getToppings();
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "topping=" + toppings +
                '}';
    }

    static class CoffeeMemento {
        ArrayList<Topping> toppings;

        public CoffeeMemento(ArrayList<Topping> toppings) {
            this.toppings = toppings;
        }

        private ArrayList<Topping> getToppings() {
            return toppings;
        }
    }


}
