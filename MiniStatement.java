import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;

class MiniStatement implements ActionListener
{
 JFrame jf;
 JLabel l1,l2,l3,l4,l5,l6,l7;
 JTextField t2;
 JButton b1;
 Connection con=null;

MiniStatement (){
try{  
System.out.println("Hii");                                                 //database  connection
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1821");
//set classpath=C:\Users\purvi\Downloads\ojdbc14.jar;.;
}
catch(Exception e){
System.out.println(e);
}
try{
 jf=new JFrame("Mini Statement"); 

 l1=new JLabel("Hello Bank");
 l2=new JLabel("Name of Account Holder :");
 l3=new JLabel("Card Number : 5040XXXXXXXX3341");

 l4=new JLabel("Recent Transactions");
 l5=new JLabel("DEPOSIT  :");
 l6=new JLabel("WITHDRAWL  :");

 l7=new JLabel("Your total BALANCE is Rs");

 b1=new JButton("Exit");


 jf.setLayout(null);
 l1.setBounds(140,20,150,25);
 l2.setBounds(30,70,180,25);
 t2.setBounds(230,70,150,25);
 l3.setBounds(30,110,250,25);
 l4.setBounds(140,180,200,25);
 l5.setBounds(30,230,200,25);
 l6.setBounds(30,270,200,25);
 l7.setBounds(50,340,200,25);

 b1.setBounds(140,400,100,30);
 b1.setBackground(Color.BLACK);
 b1.setForeground(Color.RED);
 b1.addActionListener(this);


 jf.setSize(420,500);
 jf.setVisible(true);
 jf.setLocation(500,240);

 
 jf.add(l1);
 jf.add(l2);
 jf.add(l3);
 jf.add(l4);
 jf.add(l5);
 jf.add(l6);
 jf.add(l7);
 jf.add(t2);
 jf.add(b1);
}
catch(Exception m){
}
}
public void actionPerformed(ActionEvent ae)
{
jf.setVisible(false);
        String n=t2.getText();
	SignedInPage sip=new SignedInPage(n);
}
public static void main(String ar[]){
MiniStatement ms=new MiniStatement();
}
}