

import java.util.Stack;

public class CareTaker {

    Stack<Coffee.CoffeeMemento> history = new Stack<>();

    public void save(Coffee coffee){
        history.push(coffee.save());
    }

    public void revert(Coffee coffee){
        if (!history.isEmpty())
            coffee.revert(history.pop());
        else
            System.out.println("Cannot undo");
    }
}
