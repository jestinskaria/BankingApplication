package BankingSystemUI;
import java.awt.GridLayout;

import javax.swing.*;
public class WithdrawPannel extends JPanel{
	
	private JPanel  panel,panel1,panel2,panel3;
	private JTextField amountText;
	private JLabel amountLabel,heading;
	private JButton btnWithdraw;
	private JComboBox accSelect;
	
	public WithdrawPannel() {
		
		setLayout(new GridLayout(3, 2));
		setBorder(BorderFactory.createTitledBorder("WITHDRAW"));
		
		accSelect = new JComboBox();
		accSelect.setModel(new DefaultComboBoxModel(new String[] {"Please Select Account", "Chequing", "Savings"}));
		
		amountLabel = new JLabel("Enter the amount :");
		amountText = new JTextField(10);
		
		btnWithdraw = new JButton("DRAW");
		

		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();	
		
	
		panel.add(accSelect);
		panel1.add(amountLabel);
		panel1.add(amountText);
		panel2.add(btnWithdraw);
	
		
		
		add(panel);
		add(panel1);
		add(panel2);
	}

}
