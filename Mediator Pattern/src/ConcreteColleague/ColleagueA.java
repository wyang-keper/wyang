package ConcreteColleague;

import Colleague.AbstractColleague;
import Mediator.AbstractMediator;

public class ColleagueA extends AbstractColleague { 
    
	  //ÿ������ͬ�¶�ͨ�����๹�캯�����н���ȡ����ϵ 
	  public ColleagueA(AbstractMediator mediator) { 
	    super(mediator); 
	  } 
	    
	  //ÿ������ͬ�±�Ȼ���Լ����ڵ��£�û��Ҫ���������� 
	  public void self() { 
	    System.out.println("ͬ��A --> �����Լ����ڵ����� ..."); 
	  } 
	    
	  //ÿ������ͬ��������Ҫ����罻���Ĳ�����ͨ���н�����������Щ�߼������Ź��� 
	  public void out() { 
	    System.out.println("ͬ��A --> ����ͬ��B���÷��ڹ��� ..."); 
	    super.mediator.execute("ColleagueB", "self"); 
	  } 
	} 
