package Proxy;

import Subject.Drink;

//代理类
//与被代理类实现同一个接口
public class DrinkProxy implements Drink {
 
private Drink drinkImpl;
 
//通过构造函数传入Water对象
public DrinkProxy(Drink drinkImpl) {
  this.drinkImpl = drinkImpl;
}
 
@Override
public void drink() {
  //在执行被代理对象的方法前做一些事情
  System.out.println("before drink");
  //执行被代理对象的方法
  drinkImpl.drink();
  //在执行被代理对象的方法后做一些事
  System.out.println("after drink");
}

}