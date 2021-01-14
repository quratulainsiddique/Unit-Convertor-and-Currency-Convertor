import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class CurrencyConverter extends JFrame implements ActionListener
{
	JFrame f;
	JLabel label,l1,l2,l3;
	JComboBox comboBox,combo2;
	JTextField tf,tf1;
	 JButton b,b1,b2; 
	CurrencyConverter()
	{
		f=new JFrame("Currency Converter");
		f.setBounds(100,100,400,400);
		Font font1 = new Font("Arial Black", Font.ITALIC, 15);
		label=new JLabel("From Currency:");
		
		label.setBounds(10,90,140,20);
		label.setForeground(Color.WHITE);
		label.setFont(font1);

		String c[]= {"US Dollar","Euro","Pound sterling","PKR Rupee","Swiss Franc","Saudi Riyal","Moroccan dirham"};
		comboBox=new JComboBox(c);
		comboBox.setBounds(190,85,180,30);
		comboBox.setFont(font1);
		comboBox.setBackground(Color.WHITE);
		comboBox.setForeground(Color.BLACK);
		l1=new JLabel("To Currency:");
		l1.setBounds(10,70,140,20);
		l1.setForeground(Color.WHITE);
		l1.setSize(150,170);
		l1.setFont(font1);

		String s[]= {"US Dollar","Euro","Pound sterling","PKR Rupee","Swiss Franc","Saudi Riyal","Moroccan dirham"};
		combo2=new JComboBox(s);
		combo2.setBounds(190,145,180,30);
		combo2.setBackground(Color.WHITE);
		combo2.setForeground(Color.BLACK);
		combo2.setFont(font1);
		
		l2=new JLabel("Enter Amount:");
		l2.setBounds(10,40,140,20);
		l2.setForeground(Color.WHITE);
		l2.setFont(font1);
		l3=new JLabel("Converted Amount:");
		l3.setBounds(10,240,170,30);
		l3.setForeground(Color.WHITE);
		l3.setFont(font1);
		tf=new JTextField();
		tf.setText("");
        tf.setBounds(190,35,180,30);
        tf1=new JTextField();
		tf1.setText("");
        tf1.setBounds(190,240,180,30);
        tf1.setEditable(false);
        tf1.setBackground(Color.WHITE);
        b=new JButton("Convert");  
        b.setBounds(130,190,120,30); 
        b.setBackground(Color.WHITE);
		b.setForeground(Color.BLACK);
        b.setFont(font1);
        b1=new JButton("CLEAR");  
        b1.setBounds(130,280,120,30); 
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.WHITE);
        b1.setFont(font1);
        b2=new JButton("BACK");  
        b2.setBounds(10,320,120,30); 
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.WHITE);
        b2.setFont(font1);
        
        
		f.setLayout(null);
		f.setVisible(true);
		f.add(label);
		f.add(comboBox);
		comboBox.addActionListener(this);
		f.add(l1);
		f.add(combo2);
		comboBox.addActionListener(this);
		f.add(l2);
		f.add(l3);
		f.add(tf);
		f.add(tf1);
		f.add(b);
		f.add(b1);
		f.add(b2);
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		f.getContentPane().setBackground(Color.BLACK);
	}
	public void convert(Double amount, Double value,String x,String y) {
		Double price;
		if((comboBox.getSelectedItem()==x)&&(combo2.getSelectedItem()==y))
		{
		price = amount * value;
		String str1 = String.valueOf(price); 
        tf1.setText(str1); 
		}
	}
	public void actionPerformed(ActionEvent e) 
    { 
		   if(e.getSource()==b)
		{
			   double amount = Double.parseDouble(tf.getText()); 
			   // FOR US Dollar
			 //Converting US Dollar To rupee
			  convert(amount,160.59,"US Dollar","PKR Rupee") ;
			//Converting US Dollar To Euro 
			  convert(amount,0.82,"US Dollar","Euro") ;
			//Converting US Dollar To Swiss Franc
			  convert(amount,0.89,"US Dollar","Swiss Franc") ;
			//Converting US Dollar To US Dollar
				 convert(amount,1.0,"US Dollar","US Dollar") ;
	//Converting US Dollar To Pound sterling 
	 convert(amount,0.74,"US Dollar","Pound sterling") ;
	//Converting US Dollar To Saudi Riyal
	convert(amount,3.75,"US Dollar","Saudi Riyal") ;
	//Converting US Dollar To Moroccan Dirham 
	convert(amount,8.84,"US Dollar","Moroccan dirham") ;
	//for Euro
	//converting Euro to US Dollar
			convert (amount,1.22224,"Euro","US Dollar");
			//convert Euro to Rupee
			convert(amount,195.671,"Euro","PKR Rupee");
			//convert Euro to Euro
			convert(amount,1.0,"Euro","Euro");
			//convert Euro to Siss Franc
			convert(amount,1.08234,"Euro","Swiss Franc");
			//convert Euro to Pound Sterling
			convert(amount,0.900958,"Euro","Pound sterling");
			//convert Euro to Saudi Riyal
			convert(amount,4.58409,"Euro","Saudi Riyal");
			//convert Euro to Moroccan Dirham
			convert(amount,10.8166,"Euro","Moroccan dirham");
			//For Pound Sterling
			//convert pound sterling to US Dollar
			convert(amount,1.35680,"Pound sterling","US Dollar");
			//convert pound sterling to pkr rupee
			convert(amount,217.214,"Pound sterling","PKR Rupee");
			//convert pound sterling to Euro
			convert(amount,1.10993,"Pound sterling","Euro");
			//convert pound sterling to pound sterling
			convert(amount,1.0,"Pound sterling","Pound sterling");
			//convert pound sterling to Swiss Franc
			convert(amount,1.20151,"Pound sterling","Swiss Franc");
			//conert pound sterling to Saudi Riyal
			convert(amount,5.08802,"Pound sterling","Saudi Riyal");
			//convert pound sterling to Moroccan dirham
			convert(amount,12.0057,"Pound sterling","Moroccan dirham");
			//for PKR Rupee
			//convert pkr rupee to US Dollar
			convert(amount,0.00625,"PKR Rupee","US Dollar");
			//convert pkr rupee to euro
			convert(amount,0.00510972,"PKR Rupee","Euro");
			//convert pkr rupee to Pound sterling
			convert(amount,0.00460375,"PKR Rupee","Pound sterling");
			//convert Pkr to pkr rupee
			convert(amount,1.0,"PKR Rupee","PKR Rupee");
			//convert PKR rupee to swiss Franc
			convert(amount,0.00553148,"PKR Rupee","Swiss Franc");
			//convert PKR rupee to Saudi Riyal
			convert(amount,0.0234240,"PKR Rupee","Saudi Riyal");
			//convert PKR rupee to Moroccan dirham
			convert(amount,0.0552711,"PKR Rupee","Moroccan dirham");
			//convert Swiss Franc to US Dollar
			convert(amount,1.12931,"Swiss Franc","US Dollar");
			//convert Swiss Franc to euro
			convert(amount,0.923768,"Swiss Franc","Euro");
			//convert Swiss Franc to Pound sterling
			convert(amount,0.83298,"Swiss Franc","Pound sterling");
			//convert Swiss Franc to pkr rupee
			convert(amount,181.328,"Swiss Franc","PKR Rupee");
			//convert Swiss Franc to swiss Franc
			convert(amount,1.0,"Swiss Franc","Swiss Franc");
			//convert Swiss Franc to Saudi Riyal
			convert(amount,4.23505,"Swiss Franc","Saudi Riyal");
			//convert Swiss Franc to Moroccan dirham
			convert(amount,9.97457,"Swiss Franc","Moroccan dirham");
			//convert Saudi Riyal to US Dollar
			convert(amount,0.266667,"Saudi Riyal","US Dollar");
			//convert Saudi Riyal to euro
			convert(amount,0.218136,"Saudi Riyal","Euro");
			//convert Saudi Riyal to Pound sterling
			convert(amount,0.196534,"Saudi Riyal","Pound sterling");
			//convert Saudi Riyal to pkr rupee
			convert(amount,42.8018,"Saudi Riyal","PKR Rupee");
			//convert Saudi Riyal to swiss Franc
			convert(amount,0.236133,"Saudi Riyal","Swiss Franc");
			//convert Saudi Riyal to Saudi Riyal
			convert(amount,1.0,"Saudi Riyal","Saudi Riyal");
			//convert Saudi Riyal to Moroccan dirham
			convert(amount,2.35628,"Saudi Riyal","Moroccan dirham");
			//convert Moroccan dirham to US Dollar
			convert(amount,0.113167,"Moroccan dirham","US Dollar");
			//convert Moroccan dirham to euro
			convert(amount,0.0925672,"Moroccan dirham","Euro");
			//convert Moroccan dirham to Pound sterling
			convert(amount,0.0833982,"Moroccan dirham","Pound sterling");
			//convert Moroccan dirham to pkr rupee
			convert(amount,18.1713,"Moroccan dirham","PKR Rupee");
			//convert Moroccan dirham to swiss Franc
			convert(amount,0.100202,"Moroccan dirham","Swiss Franc");
			//convert Moroccan dirham to Saudi Riyal
			convert(amount,0.424343,"Moroccan dirham","Saudi Riyal");
			//convert Moroccan dirham to Moroccan dirham
			convert(amount,1.0,"Moroccan dirham","Moroccan dirham");
					         
	
		}
		 if(e.getSource()==b1)
		 {
			 tf.setText(" "); 
			 tf1.setText(" "); 
		 }
		 if(e.getSource()==b2)
			 
		 {
			 new Mainjava();
			 f.setVisible(false);
		 }
		 
	}


}