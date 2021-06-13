package Factory;

import Abstract.TV;
import Specific.HaierTV;
import Specific.HisenseTV;

public class TVFactory {
	public static TV createTV(String type) {
		if(type.equalsIgnoreCase("Haier"))
		{
			System.out.println("���ӻ����������������ӻ���");
			return new HaierTV();
		}
		else if(type.equalsIgnoreCase("Hisense"))
		{
			System.out.println("���ӻ������������ŵ��ӻ���");
			return new HisenseTV();
		}
		else
		{
			return null;
		}
	}
 
}
