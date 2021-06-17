package Client;

import Proxy.DrinkProxy;
import RealSubject.Water;

public class Client {
	 public static void main(String[] args) {
		    Water water = new Water();
		    DrinkProxy drinkProxy = new DrinkProxy(water);
		    drinkProxy.drink();
		  }

}
