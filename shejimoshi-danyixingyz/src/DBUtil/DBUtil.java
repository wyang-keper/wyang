package DBUtil;
import java.sql.Connection;
public class DBUtil {
	private Connection conn;
    public Connection getConnection() {
    System.out.printf("成功连接数据库");
	   return conn;
   }
}
