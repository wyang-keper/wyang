package Login;

import Dao.UserDao;


public class LoginForm {
  UserDao dao = new UserDao();
  public void init() {
	System.out.printf("��ʼ���ɹ���");
}
  public void display () {
	System.out.printf("ҳ��չʾ�ɹ���");
}
  public void validate(String userName, String userPassword) {
	if(dao.findUser(userName , userPassword)){
	System.out.printf("��½�ɹ���")	;
	}
	else {
		System.out.printf("��½ʧ�ܣ�");
	}
}
}
