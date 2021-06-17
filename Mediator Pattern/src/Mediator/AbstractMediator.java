package Mediator;

import java.util.Hashtable;

import Colleague.AbstractColleague;

public abstract class AbstractMediator { 
    
  //�н��߿϶���Ҫ����������ͬ�µ���ϵ��ʽ 
  protected Hashtable<String, AbstractColleague> colleagues = new Hashtable<String, AbstractColleague>(); 
    
  //�н��߿��Զ�̬����ĳ��ͬ�½�����ϵ 
  public void addColleague(String name, AbstractColleague c) { 
    this.colleagues.put(name, c); 
  }   
    
  //�н���Ҳ���Զ�̬�س�����ĳ��ͬ�µ���ϵ 
  public void deleteColleague(String name) { 
    this.colleagues.remove(name); 
  } 
    
  //�н��߱���߱���ͬ��֮�䴦���߼����������񡢴ٽ������Ĳ��� 
  public abstract void execute(String name, String method);  
} 