//运用了简单工厂模式
package Client;

import Abstract.TV;
import Factory.TVFactory;

public class Client02 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		TV tv1 = TVFactory.createTV("Haier");	
		TV tv2 = TVFactory.createTV("hisense");
        tv1.play();
        tv2.play();
	}
}
