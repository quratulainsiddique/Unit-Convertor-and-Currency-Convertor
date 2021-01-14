
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class UnitConverter extends JFrame implements ActionListener
{
	JFrame f;
	JLabel label,label1;
	JLabel label4,label7;
	JLabel label8,label11;
	JComboBox comboBox,combo2,combo3,combo4,combo5,combo6;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6;
	 JButton b,b1,b2; 

	UnitConverter()
	{
		f=new JFrame("Unit Converter");
		
		f.setBounds(200,200,500,500);
		f. setBackground(Color. RED);
		label=new JLabel("Length:");
		 label.setBounds(10,40,150,20);
		label.setForeground(Color.WHITE);
		Font font1 = new Font("Arial Black", Font.ITALIC, 15);
		label.setFont(font1);
		tf1=new JTextField();
		tf1.setText("");
        tf1.setBounds(50,65,150,20);
        tf2=new JTextField();
		tf2.setText("");
        tf2.setBounds(250,65,150,20);
		String l1[]= {"Meter","Kilometer","centimeter","Milimeter","Inches","Feet"};
		comboBox=new JComboBox(l1);
		comboBox.setBounds(50,90,150,20);
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(font1);
		label1=new JLabel("=");
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setSize(450,150);
		label1.setForeground(Color.WHITE);
		label1.setFont(font1);
		String l2[]= {"Meter","Kilometer","Centimeter","Milimeter","Inches","Foot"};
		combo2=new JComboBox(l2);
		combo2.setBounds(250,90,150,20);
		combo2.setBackground(Color.WHITE);
		combo2.setFont(font1);
		
		label4=new JLabel("Mass:");
		label4.setHorizontalAlignment(JLabel.CENTER);
		label4.setSize(100,300);
		label4.setForeground(Color.WHITE);
		label4.setFont(font1);
		String l3[]= {"Gram","KiloGram","MiliGram","Pounds"};
		combo3=new JComboBox(l3);
		combo3.setBounds(50,190,150,20);
		combo3.setBackground(Color.WHITE);
		combo3.setFont(font1);
		label7=new JLabel("=");
		label7.setHorizontalAlignment(JLabel.CENTER);
		label7.setSize(450,350);
		label7.setForeground(Color.WHITE);
		label7.setFont(font1);
		String l4[]= {"Gram","KiloGram","MiliGram","Pounds"};
		combo4=new JComboBox(l4);
		combo4.setBounds(250,190,150,20);
		combo4.setBackground(Color.WHITE);
		combo4.setFont(font1);
		tf3=new JTextField();
		tf3.setText("");
        tf3.setBounds(50,165,150,20);
        tf4=new JTextField();
		tf4.setText("");
        tf4.setBounds(250,165,150,20);
		
		label8=new JLabel("Temperature:");
		label8.setHorizontalAlignment(JLabel.CENTER);
		label8.setSize(145,500);
		label8.setForeground(Color.WHITE);
		label8.setFont(font1);
		tf5=new JTextField();
		tf5.setText("");
        tf5.setBounds(50,275,150,20);
        tf6=new JTextField();
		tf6.setText("");
        tf6.setBounds(250,275,150,20);
		String l5[]= {"Celsius","Fahrenheit","Kelvin"};
		combo5=new JComboBox(l5);
		combo5.setBounds(50,300,150,20);
		combo5.setBackground(Color.WHITE);
		combo5.setFont(font1);
		label11=new JLabel("=");
		label11.setHorizontalAlignment(JLabel.CENTER);
		label11.setSize(450,570);
		label11.setForeground(Color.WHITE);
		label11.setFont(font1);
		String l6[]= {"Celsius","Fahrenheit","Kelvin"};
		combo6=new JComboBox(l6);
		combo6.setBounds(250,300,150,20);
		combo6.setBackground(Color.WHITE);
		combo6.setFont(font1);
		b=new JButton("Convert");  
        b.setBounds(80,350,120,30); 
        b.setBackground(Color.WHITE);
        b.setFont(font1);
        b1=new JButton("Clear");  
        b1.setBounds(230,350,120,30); 
        b1.setBackground(Color.WHITE);
        
        b1.setFont(font1);
        b2=new JButton("Back"); 
        b2.setBounds(160,390,120,30); 
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.WHITE);
        b2.setFont(font1);
		f.setLayout(null);
		f.setVisible(true);
		f.add(label);
		f.add(tf1);
		f.add(comboBox);
		f.add(label1);
		f.add(tf2);
		f.add(combo2);
		f.add(b);
		f.add(b1);
		f.add(label4);
		f.add(tf3);
		f.add(tf4);
		f.add(combo3);
		f.add(label7);
		f.add(combo4);
		
		f.add(label8);
		f.add(tf5);
		f.add(tf6);
		f.add(combo5);
		f.add(label11);
		f.add(combo6);
		f.add(b2);
		comboBox.addActionListener(this);
		combo2.addActionListener(this);
		combo3.addActionListener(this);
		combo4.addActionListener(this);
		combo5.addActionListener(this);
		combo6.addActionListener(this);
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.getContentPane().setBackground(Color.BLACK);
	}
	public void actionPerformed(ActionEvent e) 
    {
		
		   double templ=0;
		   String tempsl="";
		if((comboBox.getSelectedItem()=="Meter")&&(combo2.getSelectedItem()=="Meter"))
		{ if(e.getSource()==b)
		 {
			tf2.setText(tf1.getText()); 
		 }
		}
		else  if((comboBox.getSelectedItem()=="Meter")&&(combo2.getSelectedItem()=="Kilometer"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ/1000;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl); 
			 }
		}
		else  if((comboBox.getSelectedItem()=="Meter")&&(combo2.getSelectedItem()=="Centimeter"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ*100;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Meter")&&(combo2.getSelectedItem()=="Milimeter"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ= templ*1000;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Meter")&&(combo2.getSelectedItem()=="Inches"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ *39.37;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Meter")&&(combo2.getSelectedItem()=="Foot"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ *3.28;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Kilometer")&&(combo2.getSelectedItem()=="Meter"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ *1000;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Kilometer")&&(combo2.getSelectedItem()=="Kilometer"))
		{
			 if(e.getSource()==b)
			 {
			tf2.setText(tf1.getText()); 
			 }
		}
		else  if((comboBox.getSelectedItem()=="Kilometer")&&(combo2.getSelectedItem()=="Centimeter"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ *100000;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Kilometer")&&(combo2.getSelectedItem()=="Milimeter"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ *1000000;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Kilometer")&&(combo2.getSelectedItem()=="Inches"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ *39370;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Kilometer")&&(combo2.getSelectedItem()=="Foot"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ *3280.84;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="centimeter")&&(combo2.getSelectedItem()=="Meter"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ /100;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="centimeter")&&(combo2.getSelectedItem()=="Kilometer"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ /100000;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="centimeter")&&(combo2.getSelectedItem()=="Centimeter"))
		{
			 if(e.getSource()==b)
			 {
			tf2.setText(tf1.getText()); 
			 }
		}
		else  if((comboBox.getSelectedItem()=="centimeter")&&(combo2.getSelectedItem()=="Milimeter"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ*10;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="centimeter")&&(combo2.getSelectedItem()=="Inches"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ/2.54;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="centimeter")&&(combo2.getSelectedItem()=="Foot"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ/30.48;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Milimeter")&&(combo2.getSelectedItem()=="Meter"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ/1000;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Milimeter")&&(combo2.getSelectedItem()=="Kilometer"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ/1000000;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Milimeter")&&(combo2.getSelectedItem()=="Centimeter"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ/10;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Milimeter")&&(combo2.getSelectedItem()=="Milimeter"))
		{
			 if(e.getSource()==b)
			 {
			tf2.setText(tf1.getText()); 
			 }
		}
		else  if((comboBox.getSelectedItem()=="Milimeter")&&(combo2.getSelectedItem()=="Inches"))
		{ 
			if(e.getSource()==b)
		 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ/ 25.4;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
		 }
		}
		else  if((comboBox.getSelectedItem()=="Milimeter")&&(combo2.getSelectedItem()=="Foot"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ/ 305;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Inches")&&(combo2.getSelectedItem()=="Meter"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ/  39.37;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Inches")&&(combo2.getSelectedItem()=="Kilometer"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ/ 39370;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Inches")&&(combo2.getSelectedItem()=="Centimeter"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ*2.54;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Inches")&&(combo2.getSelectedItem()=="Milimeter"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ*25.4;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Inches")&&(combo2.getSelectedItem()=="Inches"))
		{
			 if(e.getSource()==b)
			 {
			tf2.setText(tf1.getText()); 
			 }
		}
		else  if((comboBox.getSelectedItem()=="Inches")&&(combo2.getSelectedItem()=="Foot"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ/12;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Foot")&&(combo2.getSelectedItem()=="Meter"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ/3.281;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Foot")&&(combo2.getSelectedItem()=="Kilometer"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ/3281;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Foot")&&(combo2.getSelectedItem()=="Centimeter"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ*30.48;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Foot")&&(combo2.getSelectedItem()=="Milimeter"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ*304.8;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Foot")&&(combo2.getSelectedItem()=="Inches"))
		{
			 if(e.getSource()==b)
			 {
			tempsl=tf1.getText();
			templ=Double.parseDouble(tempsl);
			templ = templ*12;
			tempsl= String.valueOf(templ);	
			tf2.setText(tempsl);
			 }
		}
		else  if((comboBox.getSelectedItem()=="Foot")&&(combo2.getSelectedItem()=="Foot"))
		{	
			 if(e.getSource()==b)
			 {
			tf2.setText(tf1.getText()); 
			 }
		}
		 double tempm=0;
		   String tempsm="";
		if((combo3.getSelectedItem()=="Gram")&&(combo4.getSelectedItem()=="Gram"))
		{
			 if(e.getSource()==b)
			 {
			tf4.setText(tf3.getText()); 
			 }
		}
		else if((combo3.getSelectedItem()=="Gram")&&(combo4.getSelectedItem()=="KiloGram"))
		{
			 if(e.getSource()==b)
			 {
			tempsm=tf3.getText();
			tempm=Double.parseDouble(tempsm);
			tempm = tempm/1000;
			tempsm= String.valueOf(tempm);	
			tf4.setText(tempsm);
			 }
		}
		else if((combo3.getSelectedItem()=="Gram")&&(combo4.getSelectedItem()=="MiliGram"))
		{
			 if(e.getSource()==b)
			 {
			tempsm=tf3.getText();
			tempm=Double.parseDouble(tempsm);
			tempm = tempm*1000;
			tempsm= String.valueOf(tempm);	
			tf4.setText(tempsm);
			 }
		}
		else if((combo3.getSelectedItem()=="Gram")&&(combo4.getSelectedItem()=="Pounds"))
		{
			 if(e.getSource()==b)
			 {
			tempsm=tf3.getText();
			tempm=Double.parseDouble(tempsm);
			tempm = tempm/454;
			tempsm= String.valueOf(tempm);	
			tf4.setText(tempsm);
			 }
		}
		else if((combo3.getSelectedItem()=="KiloGram")&&(combo4.getSelectedItem()=="Gram"))
		{
			 if(e.getSource()==b)
			 {
			tempsm=tf3.getText();
			tempm=Double.parseDouble(tempsm);
			tempm= tempm*1000;
			tempsm= String.valueOf(tempm);	
			tf4.setText(tempsm);
			 }
		}
		else if((combo3.getSelectedItem()=="KiloGram")&&(combo4.getSelectedItem()=="KiloGram"))
		{
			 if(e.getSource()==b)
			 {
			tf4.setText(tf3.getText()); 
			 }
		}
		else if((combo3.getSelectedItem()=="KiloGram")&&(combo4.getSelectedItem()=="MiliGram"))
		{
			 if(e.getSource()==b)
			 {
			tempsm=tf3.getText();
			tempm=Double.parseDouble(tempsm);
			tempm = tempm*1000000;
			tempsm= String.valueOf(tempm);	
			tf4.setText(tempsm);
			 }
		}
		else if((combo3.getSelectedItem()=="KiloGram")&&(combo4.getSelectedItem()=="Pounds"))
		{
			 if(e.getSource()==b)
			 {
			tempsm=tf3.getText();
			tempm=Double.parseDouble(tempsm);
			tempm = tempm*2.205;
			tempsm= String.valueOf(tempm);	
			tf4.setText(tempsm);
			 }
		}
		else if((combo3.getSelectedItem()=="MiliGram")&&(combo4.getSelectedItem()=="Gram"))
		{
			 if(e.getSource()==b)
			 {
			tempsm=tf3.getText();
			tempm=Double.parseDouble(tempsm);
			tempm = tempm/1000;
			tempsm= String.valueOf(tempm);	
			tf4.setText(tempsm);
			 }
		}
		else if((combo3.getSelectedItem()=="MiliGram")&&(combo4.getSelectedItem()=="KiloGram"))
		{
			 if(e.getSource()==b)
			 {
			tempsm=tf3.getText();
			tempm=Double.parseDouble(tempsm);
			tempm = tempm/1000000;
			tempsm= String.valueOf(tempm);	
			tf4.setText(tempsm);
			 }
		}
		else if((combo3.getSelectedItem()=="MiliGram")&&(combo4.getSelectedItem()=="MiliGram"))
		{
			 if(e.getSource()==b)
			 {
			tf4.setText(tf3.getText()); 
			 }
		}
		else if((combo3.getSelectedItem()=="MiliGram")&&(combo4.getSelectedItem()=="Pounds"))
		{
			 if(e.getSource()==b)
			 {
			tempsm=tf3.getText();
			tempm=Double.parseDouble(tempsm);
			tempm = tempm/453592;
			tempsm= String.valueOf(tempm);	
			tf4.setText(tempsm);
			 }
		}
		else if((combo3.getSelectedItem()=="Pounds")&&(combo4.getSelectedItem()=="Gram"))
		{
			 if(e.getSource()==b)
			 {
			tempsm=tf3.getText();
			tempm=Double.parseDouble(tempsm);
			tempm = tempm*454;
			tempsm= String.valueOf(tempm);	
			tf4.setText(tempsm);
			 }
		}
		else if((combo3.getSelectedItem()=="Pounds")&&(combo4.getSelectedItem()=="KiloGram"))
		{
			 if(e.getSource()==b)
			 {
			tempsm=tf3.getText();
			tempm=Double.parseDouble(tempsm);
			tempm = tempm/2.205;
			tempsm= String.valueOf(tempm);	
			tf4.setText(tempsm);
			 }
		}
		else if((combo3.getSelectedItem()=="Pounds")&&(combo4.getSelectedItem()=="MiliGram"))
		{
			 if(e.getSource()==b)
			 {
			tempsm=tf3.getText();
			tempm=Double.parseDouble(tempsm);
			tempm = tempm*453592;
			tempsm= String.valueOf(tempm);	
			tf4.setText(tempsm);
			 }
		}
		else if((combo3.getSelectedItem()=="Pounds")&&(combo4.getSelectedItem()=="Pounds"))
		{
			 if(e.getSource()==b)
			 {
			tf4.setText(tf3.getText()); 
			 }
		}
		 double tempt=0;
		   String tempst="";
		if((combo5.getSelectedItem()=="Celsius")&&(combo6.getSelectedItem()=="Celsius"))
		{
			 if(e.getSource()==b)
			 {
			tf6.setText(tf5.getText()+"°"); 
			 }
		}
		else if((combo5.getSelectedItem()=="Celsius")&&(combo6.getSelectedItem()=="Fahrenheit"))
		{
			 if(e.getSource()==b)
			 {
			tempst=tf5.getText();
			tempt=Double.parseDouble(tempst);
			tempt = (tempt*9/5) + 32;
			tempst= String.valueOf(tempt);	
			tf6.setText(tempst+"°");
			 }
		}
		else if((combo5.getSelectedItem()=="Celsius")&&(combo6.getSelectedItem()=="Kelvin"))
		{
			if(e.getSource()==b)
			 {
			tempst=tf5.getText();
			tempt=Double.parseDouble(tempst);
			tempt = (tempt+ 273.15);
			tempst= String.valueOf(tempt);	
			tf6.setText(tempst+"°");
			 }
		}
		else if((combo5.getSelectedItem()=="Fahrenheit")&&(combo6.getSelectedItem()=="Celsius"))
		{
			 if(e.getSource()==b)
			 {
			tempst=tf5.getText();
			tempt=Double.parseDouble(tempst);
			tempt = (tempt - 32)*5/9;
			tempst= String.valueOf(tempt);	
			tf6.setText(tempst+"°");
			 }
		}
		else if((combo5.getSelectedItem()=="Fahrenheit")&&(combo6.getSelectedItem()=="Fahrenheit"))
		{
			 if(e.getSource()==b)
			 {
			tf6.setText(tf5.getText()+"°"); 
			 }
		}
		else if((combo5.getSelectedItem()=="Fahrenheit")&&(combo6.getSelectedItem()=="Kelvin"))
		{
			 if(e.getSource()==b)
			 {
			tempst=tf5.getText();
			tempt=Double.parseDouble(tempst);
			tempt = (tempt- 32)*5/9+273.15;
			tempst= String.valueOf(tempt);	
			tf6.setText(tempst+"°");
			 }
		}
		else if((combo5.getSelectedItem()=="Kelvin")&&(combo6.getSelectedItem()=="Celsius"))
		{
			 if(e.getSource()==b)
			 {
			tempst=tf5.getText();
			tempt=Double.parseDouble(tempst);
			tempt = (tempt - 273.15);
			tempst= String.valueOf(tempt);	
			tf6.setText(tempst+"°");
			 }
		}
		else if((combo5.getSelectedItem()=="Kelvin")&&(combo6.getSelectedItem()=="Fahrenheit"))
		{
			 if(e.getSource()==b)
			 {
			tempst=tf5.getText();
			tempt=Double.parseDouble(tempst);
			tempt = (tempt- 273.15)*9/5+32;
			tempst= String.valueOf(tempt);	
			tf6.setText(tempst+"°");
			 }
		}
		else if((combo5.getSelectedItem()=="Kelvin")&&(combo6.getSelectedItem()=="Kelvin"))
		{
			 if(e.getSource()==b)
			 {
				 tf6.setText(tf5.getText()+"°");
			 }
		}	
         if(e.getSource()==b1)
	 {
		 tf1.setText(" "); 
		 tf2.setText(" "); 
		 tf3.setText(" "); 
		 tf4.setText(" "); 
		 tf5.setText(" "); 
		 tf6.setText(" "); 
	 }

	 if(e.getSource()==b2)
			 
		 {
			 new Mainjava();
			 f.setVisible(false);
		 }
    }

}