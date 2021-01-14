import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Mainjava extends JFrame implements ActionListener
{
	JFrame f1;

	JLabel label,l1,l2,l3,l4;
	JComboBox comboBox,combo2;
	JTextField tf;
	 JButton b; 
	 JRadioButton j1,j2;
	 ButtonGroup G1;
	Mainjava()
	{
		
		f1=new JFrame("MENU");
		f1.setBounds(300,300,250,250);
		Font font1 = new Font("Algerian", Font.BOLD, 15);
		Font font2 = new Font("Times new roman", Font.BOLD, 15);
		l4=new JLabel("What you want.....?");
		l4.setBounds(50,10,400,100);
		l4.setFont(font1);
		l4.setForeground(Color.WHITE);
		j1=new JRadioButton();
		j1.setText("Currency Converter");
		j1.setBounds(50,90,190,30);
		j1.setBackground(Color.BLACK);
		j1.setForeground(Color.WHITE);
		j1.setFont(font2);
		j2=new JRadioButton();	
		
		j2.setText("Unit Converter");
		j2.setBounds(50,110,190,30);
		j2.setBackground(Color.BLACK);
		j2.setForeground(Color.WHITE);
		j2.setFont(font2);
        j1.addActionListener(this);
        j2.addActionListener(this);
        f1.add(j1);
        f1.add(j2);
		
		f1.add(l4);
		
		f1.setLayout(null);
		f1.getContentPane().setBackground(Color.BLACK);
		f1.setVisible(true);	
	
	}
	public void actionPerformed(ActionEvent e) {
		
   if(j1.isSelected())
   {
	  new CurrencyConverter();
	  f1.setVisible(false);
   }
   if(j2.isSelected())
   {
	  new UnitConverter();
	  f1.setVisible(false);
   }
	}

	public static void main(String args[])
	{
		new Mainjava();
	}
}