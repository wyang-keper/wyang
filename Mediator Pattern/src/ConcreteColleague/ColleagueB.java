package ConcreteColleague;

import Colleague.AbstractColleague;
import Mediator.AbstractMediator;

//����ͬ��B 
public class ColleagueB extends AbstractColleague { 
  
public ColleagueB(AbstractMediator mediator) { 
  super(mediator); 
} 
  
public void self() { 
  System.out.println("ͬ��B --> �����Լ����ڵ����� ..."); 
} 
  
public void out() { 
  System.out.println("ͬ��B --> ����ͬ��A���÷��ڹ��� ..."); 
  super.mediator.execute("ColleagueA", "self"); 
} 
} 