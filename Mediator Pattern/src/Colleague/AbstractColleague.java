package Colleague;

import Mediator.AbstractMediator;

public class AbstractColleague {
	protected AbstractMediator mediator; 
    
	  /**��Ȼ���н��ߣ���ôÿ������ͬ�±�ȻҪ���н�������ϵ�� 
	   * �����û��Ҫ������ ���ϵͳ���У�����Ĺ��캯���൱ 
	   * �����ϵͳ��ע��һ���н��ߣ���ȡ����ϵ 
	   */
	  public AbstractColleague(AbstractMediator mediator) { 
	    this.mediator = mediator; 
	  } 
	    
	  // �ڳ���ͬ����������������н���ȡ����ϵ����ע�ᣩ�ķ��� 
	  public void setMediator(AbstractMediator mediator) { 
	    this.mediator = mediator; 
	  } 

}
