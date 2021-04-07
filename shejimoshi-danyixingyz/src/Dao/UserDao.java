package Dao;

import DBUtil.DBUtil;
public class UserDao {
DBUtil dbUtil=new DBUtil();
public boolean findUser(String userName, String userPassword) {
	   System.out.printf("该用户存在！");
	   return true;
   }
}
