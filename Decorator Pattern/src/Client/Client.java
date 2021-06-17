package Client;

import Component.TheGreatestSage;
import ConcreteComponent.Monkey;
import ConcreteDecorator.Bird;
import ConcreteDecorator.Fish;

public class Client {
	public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();
        // 第一种写法
        TheGreatestSage bird = new Bird(sage);
        TheGreatestSage fish = new Fish(bird);
        // 第二种写法
        //TheGreatestSage fish = new Fish(new Bird(sage));
        fish.move(); 
    }

}
