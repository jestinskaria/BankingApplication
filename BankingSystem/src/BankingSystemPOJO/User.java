package BankingSystemPOJO;

import BankingSystemConstants.CommonConstants;

public class User {
	
	private int userId = CommonConstants.ZERO;
	private String userName = CommonConstants.EMPTY_STRING;
	private String pwd = CommonConstants.EMPTY_STRING;
	private String address = CommonConstants.EMPTY_STRING;
	private int userType = 2;
	private String zip = CommonConstants.EMPTY_STRING;
	private String dob = CommonConstants.EMPTY_STRING;
	private String email = CommonConstants.EMPTY_STRING;
	private String phoneNo = CommonConstants.EMPTY_STRING;
	private String firstName = CommonConstants.EMPTY_STRING;
	private String lastName = CommonConstants.EMPTY_STRING;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
