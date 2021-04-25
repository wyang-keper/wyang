package Test;

import AbstractProduct.Apple;
import AbstractProduct.Samsung;
import SpecificFactory.PhoneFactory;

public class AbsFactoryTest {
	public static void main(String[] args) {
		PhoneFactory phoneFactory = new PhoneFactory();
		Apple apple = phoneFactory.createApple();
		apple.appleStyle();
		Samsung samsung = phoneFactory.createSamsung();
		samsung.samsungStyle();
	}
}
