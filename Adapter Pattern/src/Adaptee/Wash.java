package Adaptee;

import Target.ThreeElectricOutlet;

public class Wash implements ThreeElectricOutlet {
	  private String name;
	  public Wash() {
	    name="洗衣机";
	  }
	  public Wash(String name){
	    this.name=name;
	  }
	  @Override
	  public void connectElectricCurrent() {
	    turnOn();
	  }
	  private void turnOn(){
	    System.out.println(name+"开始洗衣服");
	  }
	}
