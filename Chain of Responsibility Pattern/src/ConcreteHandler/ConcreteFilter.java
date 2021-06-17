package ConcreteHandler;

import Handler.IFilter;

public class ConcreteFilter extends IFilter { 
    
	  private String name; 
	  public ConcreteFilter(String name) { 
	    this.name = name; 
	  } 
	    
	  @Override
	  public void handleFilter() { 
	    /* 
	     * �Լ��ȴ������к���ߣ�����������һ�� 
	     */ 
	    System.out.println(name + " ����������"); 
	    if (getSuccessor() != null) { 
	      getSuccessor().handleFilter(); 
	    } 
	  } 
	    
	  @Override 
	  public void handleFilter2() { 
	    /* 
	     * �к���߾ͺ���ߴ���, �����Լ����� 
	     */
	    if (getSuccessor() != null) { 
	      getSuccessor().handleFilter2(); 
	    } else { 
	      System.out.println(name + " ����������"); 
	    } 
	  } 
	} 