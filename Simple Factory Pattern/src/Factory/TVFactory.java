package Factory;

import Abstract.TV;
import Specific.HaierTV;
import Specific.HisenseTV;

public class TVFactory {
	public static TV createTV(String type) {
		if(type.equalsIgnoreCase("Haier"))
		{
			System.out.println("电视机工厂生产海尔电视机！");
			return new HaierTV();
		}
		else if(type.equalsIgnoreCase("Hisense"))
		{
			System.out.println("电视机工厂生产海信电视机！");
			return new HisenseTV();
		}
		else
		{
			return null;
		}
	}
 
}
