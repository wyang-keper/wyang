package Client;

import ConcreteHandler.ConcreteFilter;
import Handler.IFilter;

public class Client {
	public static void main(String[] args) { 
	    IFilter filter1 = new ConcreteFilter("permission-filter");//Ȩ�޹��� 
	    IFilter filter2 = new ConcreteFilter("suffix-filter");//��׺������ 
	    IFilter filter3 = new ConcreteFilter("style-filter");//������ 
	    filter1.setSuccessor(filter2); 
	    filter2.setSuccessor(filter3); 
	    System.out.println("------������ÿһ��������(���������)��������, ˳��Ҳ��һ��һ���Ĵ���------"); 
	    filter1.handleFilter(); 
	      
	    System.out.println("------�����ǽ������һ������ߴ���------"); 
	    filter1.handleFilter2(); 
	      
	  } 

}
