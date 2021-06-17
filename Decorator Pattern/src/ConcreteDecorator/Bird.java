package ConcreteDecorator;

import Component.TheGreatestSage;
import Decorator.Change;

public class Bird extends Change {
    
    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // ����
        System.out.println("Bird Move");
    }
}