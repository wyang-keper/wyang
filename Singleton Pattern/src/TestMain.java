
public class TestMain {
	public static void main(String[] ages){
		Singleton e1=Singleton.getEx();
		Singleton e2=Singleton.getEx();
	    if(e1==e2){
	      System.out.println("同一个对象");
	    }else{
	      System.out.println("不同的对象");
	    }
	  }

}
