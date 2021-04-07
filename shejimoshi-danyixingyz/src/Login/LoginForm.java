package Login;

import Dao.UserDao;


public class LoginForm {
  UserDao dao = new UserDao();
  public void init() {
	System.out.printf("初始化成功！");
}
  public void display () {
	System.out.printf("页面展示成功！");
}
  public void validate(String userName, String userPassword) {
	if(dao.findUser(userName , userPassword)){
	System.out.printf("登陆成功！")	;
	}
	else {
		System.out.printf("登陆失败！");
	}
}
}
