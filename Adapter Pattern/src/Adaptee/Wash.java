package Adaptee;

import Target.ThreeElectricOutlet;

public class Wash implements ThreeElectricOutlet {
	  private String name;
	  public Wash() {
	    name="ϴ�»�";
	  }
	  public Wash(String name){
	    this.name=name;
	  }
	  @Override
	  public void connectElectricCurrent() {
	    turnOn();
	  }
	  private void turnOn(){
	    System.out.println(name+"��ʼϴ�·�");
	  }
	}
