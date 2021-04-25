package SpecificFactory;

import AbstractFactory.AbsFactory;
import AbstractProduct.Apple;
import AbstractProduct.Samsung;
import SpecificProduct.ApplePhone;
import SpecificProduct.SamsungMp3;

public class Mp3Factory implements AbsFactory {
	public Apple createApple() {
		return null;
	}
	
	
    public Samsung createSamsung() {
    	return new SamsungMp3();
    }
}
