package order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import pizza.Pizza;

public abstract class OrderPizza {
	//定义一个抽象方法，createPizza，让各个工厂子类自己实现
		abstract Pizza  createPizza(String orderType);
	//构造器
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;
		do {
			orderType = getType();
			pizza = createPizza(orderType);//抽象的方法，由工厂子类完成
			/*if(orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName("希腊pizza");
			}
			else if(orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName("奶酪pizza");
			}
			else if(orderType.equals("pepper")) {
				pizza = new PepperPizza();
				pizza.setName("胡椒pizza");
			}
			else {
				break;
			}*/
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}while(true);
	}
	
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 种类：");
			String str =strin.readLine();
			return str;
		}catch (IOException e) {
			e.printStackTrace();
			return "抱歉，没有该种类";
		}
	}

}
