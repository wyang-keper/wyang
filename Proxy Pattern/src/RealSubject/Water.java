package RealSubject;

import Subject.Drink;

//被代理的类
public class Water implements Drink {

@Override
public void drink() {
  System.out.println("drink water");
}

}