package ConcreteColleague;

import Colleague.AbstractColleague;
import Mediator.AbstractMediator;

//具体同事B 
public class ColleagueB extends AbstractColleague { 
  
public ColleagueB(AbstractMediator mediator) { 
  super(mediator); 
} 
  
public void self() { 
  System.out.println("同事B --> 做好自己分内的事情 ..."); 
} 
  
public void out() { 
  System.out.println("同事B --> 请求同事A做好分内工作 ..."); 
  super.mediator.execute("ColleagueA", "self"); 
} 
} 