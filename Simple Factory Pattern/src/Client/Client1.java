//未用到简单工厂模式
package Client;

import Abstract.TV;
import Specific.HaierTV;
import Specific.HisenseTV;

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 TV tv1=new HaierTV();
	 TV tv2=new HisenseTV();
	 tv1.play();
	 tv2.play();
	}

}
