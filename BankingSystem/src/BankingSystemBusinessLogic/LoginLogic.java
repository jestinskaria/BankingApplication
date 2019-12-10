package BankingSystemBusinessLogic;

import BankingSystemDAO.UserDAO;
import BankingSystemPOJO.User;

public class LoginLogic {
	UserDAO userDAO =  new UserDAO();
	
	public boolean checkUser(String username,String password,int userType) {
		
		boolean flag = false;
		User userObj = userDAO.getUserDetails(username,password,userType);
		if(userObj == null) {
			flag = false;
		} else {
			flag = true;
		}
	
		return flag;
	}
	public User getUserDetails(String username,String password,int userType) {
		 
		User userObj = userDAO.getUserDetails(username,password,userType);
		
		return userObj;
	}
}
