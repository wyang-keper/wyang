package Adapter;

import Adaptee.TwoElectricOutlet;
import Target.ThreeElectricOutlet;

public class TreeElecricAdapter implements ThreeElectricOutlet {
	TwoElectricOutlet outlet;
	  public TreeElecricAdapter(TwoElectricOutlet teo) {
	    this.outlet=teo;
	  }
	  @Override
	  public void connectElectricCurrent() {
	    outlet.connectElectricCurrent();
	  }

}
