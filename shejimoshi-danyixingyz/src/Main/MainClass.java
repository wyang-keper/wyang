package Main;

import DBUtil.DBUtil;
import Dao.UserDao;
import Login.LoginForm;

public class MainClass {
	public static void main (String[] args) {
	  DBUtil dbUtil = new DBUtil();
	  LoginForm login = new LoginForm();
      login.validate("wyang","123");
      login.init();
      login.display();
}
}
