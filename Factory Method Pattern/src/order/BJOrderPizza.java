package order;

import pizza.BJCheesePizza;
import pizza.BJPepperPizza;
import pizza.Pizza;

public class BJOrderPizza extends OrderPizza{
	Pizza createPizza(String orderType) {
		Pizza pizza=null;
		
		 if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		}
		else if(orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		
		return pizza;
	}
 
}
