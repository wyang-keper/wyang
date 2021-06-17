package Client;

import ConcreteColleague.ColleagueA;
import ConcreteColleague.ColleagueB;
import ConcreteMediator.Mediator;
import Mediator.AbstractMediator;

public class Client {
	public static void main(String[] args) { 
	      
	    //����һ���н��� 
	    AbstractMediator mediator = new Mediator(); 
	      
	    //��������ͬ�� 
	    ColleagueA colleagueA = new ColleagueA(mediator); 
	    ColleagueB colleagueB = new ColleagueB(mediator); 
	      
	    //�н��߷ֱ���ÿ��ͬ�½�����ϵ 
	    mediator.addColleague("ColleagueA", colleagueA); 
	    mediator.addColleague("ColleagueB", colleagueB); 
	      
	    //ͬ���ǿ�ʼ���� 
	    colleagueA.self(); 
	    colleagueA.out(); 
	    System.out.println("======================������죬������ɣ�\n"); 
	      
	    colleagueB.self(); 
	    colleagueB.out(); 
	    System.out.println("======================������죬������ɣ�"); 
	  } 

}
