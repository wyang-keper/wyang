
public class Singleton {
	private static Singleton e;
	  public static Singleton getEx() {
	    if (e == null) {
	      e=new Singleton();
	    }
	    return e;
	  }
	  private Singleton() {
	    System.out.println("ִ�е���ģʽ");
	  } 
}
