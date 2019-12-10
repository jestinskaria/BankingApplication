package BankingSystemDAO;

import BankingSystemDAO.DBConn;
import BankingSystemPOJO.User;
import BankingSystemUtil.CommonUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UserDAO{
	
	
	CommonUtil commonUtil = new CommonUtil();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public User getUserDetails(String username, String pwd,int type) {
		
		User userObj = null;
		try {
			conn = DBConn.jdbcConnection();
			if(type ==1) {
//			String sql = "SELECT userId,username,pwd,referId,userType,createdBy,createdDate,modifiedBy,modifiedDate"
//					+ " FROM tblUser"
//					+ " WHERE username=? AND pwd =?";
//		      
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, username);
//			pstmt.setString(2, pwd);
//			rs = pstmt.executeQuery();
//			while (rs.next()) {
//				userObj = new User();
//				userObj.setUserId(rs.getInt("userId"));
//				userObj.setUserName(rs.getString("username"));
//				userObj.setPwd(rs.getString("pwd"));
//				userObj.setReferId(rs.getString("referId"));
//				userObj.setUserType(rs.getString("userType"));
//				userObj.setCreatedBy(rs.getString("createdBy"));
//				userObj.setCreatedDate(rs.getString("createdDate"));
//				userObj.setModifiedBy(rs.getString("modifiedBy"));
//				userObj.setModifiedDate(rs.getString("modifiedDate"));
//			}
			
			}else if(type ==2){
				String sql = "SELECT CLIENT_USER_ID,CLIENT_F_NAME,CLIENT_L_NAME,CLIENT_EMAIL,CLIENT_USER_NAME,CLIENT_USER_PASSWORD,CLIENT_ADDRESS,CLIENT_ZIP_CODE,CLIENT_PHONE_NO,CLIENT_DOB"
						+ " FROM tbl_clients"
						+ " WHERE CLIENT_USER_NAME=? AND CLIENT_USER_PASSWORD =?";
			      
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, username);
				pstmt.setString(2, pwd);
				rs = pstmt.executeQuery();
		
				while (rs.next()) {
					userObj = new User();
					userObj.setUserId(rs.getInt("CLIENT_USER_ID"));
					userObj.setUserName(rs.getString("CLIENT_USER_NAME"));
					userObj.setPwd(rs.getString("CLIENT_USER_PASSWORD"));
					userObj.setUserType(type);
					userObj.setAddress(rs.getString("CLIENT_ADDRESS"));
					userObj.setZip(rs.getString("CLIENT_ZIP_CODE"));
					userObj.setDob(rs.getString("CLIENT_DOB"));
					userObj.setEmail(rs.getString("CLIENT_EMAIL"));
					userObj.setPhoneNo(rs.getString("CLIENT_PHONE_NO"));
					userObj.setFirstName(rs.getString("CLIENT_F_NAME"));
					userObj.setLastName(rs.getString("CLIENT_L_NAME"));
			}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	
	return userObj;

	}
	
	
}


