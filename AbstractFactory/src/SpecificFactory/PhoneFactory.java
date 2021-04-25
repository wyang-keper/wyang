package SpecificFactory;

import AbstractFactory.AbsFactory;
import AbstractProduct.Apple;
import AbstractProduct.Samsung;
import SpecificProduct.ApplePhone;
import SpecificProduct.SumsungPhone;

public class PhoneFactory implements AbsFactory {
	public Apple createApple() {
		return new ApplePhone();
	}
	
	
    public Samsung createSamsung() {
    	return new SumsungPhone();
    }
}
