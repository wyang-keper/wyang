package ConcreteDecorator;

import Component.TheGreatestSage;
import Decorator.Change;

public class Fish extends Change {
    
    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // ДњТы
        System.out.println("Fish Move");
    }
}