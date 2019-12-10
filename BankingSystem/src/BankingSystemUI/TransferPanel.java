package BankingSystemUI;
import java.awt.GridLayout;

import javax.swing.*;
public class TransferPanel extends JPanel{
	private JPanel  panel,panel1,panel2,panel3;
	private JTextField amountText;
	private JLabel amountLabel,heading;
	private JButton btnTransfer;
	private JComboBox fromAccSelect,toAccSelect;
	
	public TransferPanel() {
		
		setLayout(new GridLayout(3, 2));
		setBorder(BorderFactory.createTitledBorder("TRANSFER"));
		
		fromAccSelect = new JComboBox();
		fromAccSelect.setModel(new DefaultComboBoxModel(new String[] {"Please Select Account", "Chequing", "Savings"}));
		
		toAccSelect = new JComboBox();
		toAccSelect.setModel(new DefaultComboBoxModel(new String[] {"Please Select Account", "Chequing", "Savings"}));
		
		amountLabel = new JLabel("Enter the amount :");
		amountText = new JTextField(10);
		
		btnTransfer = new JButton("Transfer");
		

		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();	
		
	
		panel.add(fromAccSelect);
		panel1.add(toAccSelect);
		panel2.add(amountLabel);
		panel2.add(amountText);
		panel3.add(btnTransfer);
	
		
		
		add(panel);
		add(panel1);
		add(panel2);
		add(panel3);
	}
	
}
