package Adaptee;

public class Tv implements TwoElectricOutlet {
	  private String name;
	  public Tv() {
	    name="�������ӻ�";
	  }
	  public Tv(String s){
	    this.name=s;
	  }
	  @Override
	  public void connectElectricCurrent() {
	    turnOn();
	  }
	  private void turnOn(){
	    System.out.println(name+"��ʼ���Ž�Ŀ");
	  }
	}
