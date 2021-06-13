package order;

import pizza.BJCheesePizza;
import pizza.BJPepperPizza;
import pizza.LDCheesePizza;
import pizza.LDPepperPizza;
import pizza.Pizza;

public class LDOrderPizza extends OrderPizza{
	Pizza createPizza(String orderType) {
		Pizza pizza=null;
		
		 if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		}
		else if(orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		
		return pizza;
	}

}
