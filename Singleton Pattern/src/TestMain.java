
public class TestMain {
	public static void main(String[] ages){
		Singleton e1=Singleton.getEx();
		Singleton e2=Singleton.getEx();
	    if(e1==e2){
	      System.out.println("ͬһ������");
	    }else{
	      System.out.println("��ͬ�Ķ���");
	    }
	  }

}
