package Handler;

public abstract class IFilter {
	private IFilter successor; 
	  
	  public IFilter getSuccessor() { 
	    return successor; 
	  } 
	  
	  public void setSuccessor(IFilter successor) { 
	    this.successor = successor; 
	  } 
	    
	  public abstract void handleFilter(); 
	    
	  public abstract void handleFilter2(); 

}
