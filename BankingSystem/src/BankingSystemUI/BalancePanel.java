package BankingSystemUI;
import java.awt.GridLayout;
import BankingSystemDAO.DBConn;
import BankingSystemUtil.CommonUtil;
import BankingSystemDAO.ClientDAO;

import javax.swing.*;

public class BalancePanel extends JPanel {
	private JPanel  panel,panel1,panel2,panel3;
	
	private JLabel totalAccLabel,totalAccBalLabel,chqAccLabel,chqAccBalLabel,savAccLabel,savAccBalLabel;
	private JComboBox accSelect;
	
	public BalancePanel() {
		
		ClientDAO clientDAO =  new ClientDAO();
		
		setLayout(new GridLayout(4, 2));
		setBorder(BorderFactory.createTitledBorder("Account Balance Details"));
		
		accSelect = new JComboBox();
		accSelect.setModel(new DefaultComboBoxModel(new String[] {"Please Select Account", "Admin", "Client"}));
		
		totalAccLabel = new JLabel("Total Account Balance");
		totalAccBalLabel = new JLabel("4000");
		chqAccLabel = new JLabel("Cheqing Account Balance");
		chqAccBalLabel = new JLabel("2000");
		savAccLabel = new JLabel("Savings Account Balance");
		savAccBalLabel = new JLabel("2000");
		
		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();	
		
		panel3.add(accSelect);
		panel.add(totalAccLabel);
		panel.add(totalAccBalLabel);
		panel1.add(chqAccLabel);
		panel1.add(chqAccBalLabel);
		panel2.add(savAccLabel);
		panel2.add(savAccBalLabel);
		
		add(panel3);
		add(panel);
		add(panel1);
		add(panel2);
		
		
		
	}
}
