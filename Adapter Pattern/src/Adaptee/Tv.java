package Adaptee;

public class Tv implements TwoElectricOutlet {
	  private String name;
	  public Tv() {
	    name="长江电视机";
	  }
	  public Tv(String s){
	    this.name=s;
	  }
	  @Override
	  public void connectElectricCurrent() {
	    turnOn();
	  }
	  private void turnOn(){
	    System.out.println(name+"开始播放节目");
	  }
	}
