package BankingSystemUI;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import BankingSystemUtil.CommonUtil;
import javax.swing.*;
import BankingSystemPOJO.User;
import BankingSystemBusinessLogic.LoginLogic;
import BankingSystemConstants.CommonConstants;
import BankingSystemUI.AdminScreen;
import BankingSystemUI.ClientScreen;


public class LoginScreen extends JFrame {

	private JPanel  panel,panel1,panel2,panel3;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;
	private JLabel lblUserType,lblUsername,lblPassword;
	private JComboBox cmbUserType;
	private JButton btnLogin;
    final int width = 350;
	final int height = 250;
	CommonUtil commonUtil = new CommonUtil();
	
	public LoginScreen() {
		setTitle("BANKING APP");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(width,height);
		setLayout(new GridLayout(4,0));
		buildPanel();
		add(panel);
		add(panel1);
		add(panel2);
		add(panel3);
		
	    setVisible(true);
	}
	
	public void buildPanel()
	{  
	panel = new JPanel();
	panel1 = new JPanel();
	panel2 = new JPanel();
	panel3 = new JPanel();
    lblUsername = new JLabel("Username");
    lblUsername.setForeground(Color.BLUE);
   	
	txtUsername = new JTextField(10);
	
	lblPassword = new JLabel("Password");
	pwdPassword = new JPasswordField(10);
	
	lblUserType = new JLabel("User Type");
	cmbUserType = new JComboBox();
	cmbUserType.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "Admin", "Client"}));
	
	 btnLogin = new JButton("Login");
	
	panel.add(lblUsername);
	panel.add(txtUsername);
	panel1.add(lblPassword);
	panel1.add(pwdPassword);
	panel2.add(lblUserType);
	panel2.add(cmbUserType);
	panel3.add(btnLogin);
	
	btnLogin.addMouseListener(new MouseAdapter() {
		@SuppressWarnings("deprecation")
		@Override
		public void mousePressed(MouseEvent e) {
			String username = txtUsername.getText();
			String password = pwdPassword.getText();
			LoginLogic loginObj = new LoginLogic();
			if (username.isEmpty() ) {
				JOptionPane.showMessageDialog(null, "Please enter the username", "Error",
						JOptionPane.ERROR_MESSAGE);
			}  if (password.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please enter the password", "Error",
						JOptionPane.ERROR_MESSAGE);
			}	 if	(cmbUserType.getSelectedIndex()==0) {
				JOptionPane.showMessageDialog(null, "Please select a user", "Error",
						JOptionPane.ERROR_MESSAGE);
			}  if (loginObj.checkUser(username, password,cmbUserType.getSelectedIndex())) {
				JOptionPane.showMessageDialog(null, "Welcome - "+username, "Success",
						JOptionPane.INFORMATION_MESSAGE);
				User userObj = new User();
				userObj = loginObj.getUserDetails(username, password,cmbUserType.getSelectedIndex());
				commonUtil.setUserId(userObj.getUserId());
				System.out.println(userObj.getUserType());
				if(userObj.getUserType()==CommonConstants.ADMIN) {
					AdminScreen adminScreen = new AdminScreen();
//					adminScreen.setVisible(true);
					dispose();
				} else if(userObj.getUserType()==CommonConstants.CLIENT) {
					
					ClientScreen clientScreen = new ClientScreen();
					
//					clientScreen.setVisible(true);
					dispose();
				} 
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect login or password", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	});
	
	}
	
	public static void main(String args[]){
		new LoginScreen();
	}
}
