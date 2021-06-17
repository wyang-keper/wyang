package Client;

import Adaptee.Tv;
import Adaptee.Wash;
import Adapter.TreeElecricAdapter;
import Target.ThreeElectricOutlet;

public class Appliction {
	public static void main(String[] args) {
	    ThreeElectricOutlet outlet; //目标接口三相插座
	    Wash wash=new Wash();
	    outlet=wash;
	    System.out.println("使用三相插座接通电流");
	    outlet.connectElectricCurrent();
	    Tv tv=new Tv();
	    TreeElecricAdapter adapter=new TreeElecricAdapter(tv);
	    outlet= adapter;
	    System.out.println("使用三相插座接通电流");
	    outlet.connectElectricCurrent();
	  }

}
