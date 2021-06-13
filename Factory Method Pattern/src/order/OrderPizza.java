package order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import pizza.Pizza;

public abstract class OrderPizza {
	//����һ�����󷽷���createPizza���ø������������Լ�ʵ��
		abstract Pizza  createPizza(String orderType);
	//������
	public OrderPizza() {
		Pizza pizza = null;
		String orderType;
		do {
			orderType = getType();
			pizza = createPizza(orderType);//����ķ������ɹ����������
			/*if(orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName("ϣ��pizza");
			}
			else if(orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName("����pizza");
			}
			else if(orderType.equals("pepper")) {
				pizza = new PepperPizza();
				pizza.setName("����pizza");
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
			System.out.println("input pizza ���ࣺ");
			String str =strin.readLine();
			return str;
		}catch (IOException e) {
			e.printStackTrace();
			return "��Ǹ��û�и�����";
		}
	}

}
