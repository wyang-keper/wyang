package Client;

import Adaptee.Tv;
import Adaptee.Wash;
import Adapter.TreeElecricAdapter;
import Target.ThreeElectricOutlet;

public class Appliction {
	public static void main(String[] args) {
	    ThreeElectricOutlet outlet; //Ŀ��ӿ��������
	    Wash wash=new Wash();
	    outlet=wash;
	    System.out.println("ʹ�����������ͨ����");
	    outlet.connectElectricCurrent();
	    Tv tv=new Tv();
	    TreeElecricAdapter adapter=new TreeElecricAdapter(tv);
	    outlet= adapter;
	    System.out.println("ʹ�����������ͨ����");
	    outlet.connectElectricCurrent();
	  }

}
