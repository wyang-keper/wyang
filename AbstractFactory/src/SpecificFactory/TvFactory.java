package SpecificFactory;

import AbstractFactory.AbsFactory;
import AbstractProduct.Apple;
import AbstractProduct.Samsung;
import SpecificProduct.ApplePhone;
import SpecificProduct.AppleTv;

public class TvFactory implements AbsFactory {
	public Apple createApple() {
		return new AppleTv();
	}
	
	
    public Samsung createSamsung() {
    	return null;
    }
}
