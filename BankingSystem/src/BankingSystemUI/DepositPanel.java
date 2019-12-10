package BankingSystemUI;
import java.awt.GridLayout;

import javax.swing.*;
public class DepositPanel extends JPanel{
	
	private JPanel  panel,panel1,panel2,panel3;
	private JTextField amountText;
	private JLabel amountLabel,heading;
	private JButton btnDeposit;
	private JComboBox accSelect;
	
	public DepositPanel() {
		
		setLayout(new GridLayout(3, 2));
		setBorder(BorderFactory.createTitledBorder("DEPOSIT"));
		
		accSelect = new JComboBox();
		accSelect.setModel(new DefaultComboBoxModel(new String[] {"Please Select Account", "Chequing", "Savings"}));
		
		amountLabel = new JLabel("Enter the amount :");
		amountText = new JTextField(10);
		
		btnDeposit = new JButton("Deposit");
		

		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();	
		
	
		panel.add(accSelect);
		panel1.add(amountLabel);
		panel1.add(amountText);
		panel2.add(btnDeposit);
	
		
		
		add(panel);
		add(panel1);
		add(panel2);
	}
	
}
