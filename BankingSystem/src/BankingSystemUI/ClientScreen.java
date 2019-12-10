package BankingSystemUI;

import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import BankingSystemUtil.CommonUtil;
public class ClientScreen extends JFrame{
	
	private BalancePanel balance;
	private DepositPanel deposit;
	private WithdrawPannel draw;
	private TransferPanel transfer;

public 	ClientScreen(){
	setTitle("WELCOME TO ONLINE BANKING");
	
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	 
	
	 setLayout(new BorderLayout());
	 
	 balance = new BalancePanel();
	 deposit = new DepositPanel();
	 draw = new WithdrawPannel();
	 transfer = new TransferPanel();
	 

	 
	 add(balance, BorderLayout.NORTH);
	 add(deposit, BorderLayout.WEST);
	 add(draw, BorderLayout.CENTER);
	 add(transfer, BorderLayout.EAST);
	 
	 // Pack the contents of the window and display it.
	 pack();
	 setVisible(true);
}



}