package Proxy;

import Subject.Drink;

//������
//�뱻������ʵ��ͬһ���ӿ�
public class DrinkProxy implements Drink {
 
private Drink drinkImpl;
 
//ͨ�����캯������Water����
public DrinkProxy(Drink drinkImpl) {
  this.drinkImpl = drinkImpl;
}
 
@Override
public void drink() {
  //��ִ�б��������ķ���ǰ��һЩ����
  System.out.println("before drink");
  //ִ�б��������ķ���
  drinkImpl.drink();
  //��ִ�б��������ķ�������һЩ��
  System.out.println("after drink");
}

}