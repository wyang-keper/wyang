package Client;

import ConcreteHandler.ConcreteFilter;
import Handler.IFilter;

public class Client {
	public static void main(String[] args) { 
	    IFilter filter1 = new ConcreteFilter("permission-filter");//权限过滤 
	    IFilter filter2 = new ConcreteFilter("suffix-filter");//后缀名过滤 
	    IFilter filter3 = new ConcreteFilter("style-filter");//风格过滤 
	    filter1.setSuccessor(filter2); 
	    filter2.setSuccessor(filter3); 
	    System.out.println("------以下是每一个处理者(包括后继者)都处理了, 顺序也是一级一级的传递------"); 
	    filter1.handleFilter(); 
	      
	    System.out.println("------以下是交由最后一个后继者处理------"); 
	    filter1.handleFilter2(); 
	      
	  } 

}
