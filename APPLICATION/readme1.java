import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class readme1
{
public  readme1()
{
JFrame obj=new JFrame("READ ME");
JLabel l1 = new JLabel("HOSPITAL   MANAGEMENT   SYSTEM");
JLabel l2 = new JLabel("NAME");

JLabel l3 = new JLabel("CONTACT NUMBER");
JLabel l4 = new JLabel("UNIVERSITY ROLL NO.");
JLabel l5 = new JLabel("1.      KHUSHI MAURYA :");
JLabel l6 =new JLabel("2.      KAJAL YADAV :");
JLabel l7 = new JLabel("3.      KASHISH KUSHWAHA :");
JLabel l8 = new JLabel("4.      JAI PRAKASH TIWARI :");

JLabel l9 = new JLabel("8081112522");
JLabel l10 = new JLabel("9451972835");
JLabel l11 = new JLabel("6307731374");
JLabel l12 = new JLabel("9696850742");

JLabel l13 = new JLabel("2200100100183");
JLabel l14 = new JLabel("2200100130078");
JLabel l15 = new JLabel("2200100100181");
JLabel l16 = new JLabel("2200100100173");
JButton nxt=new JButton("NEXT");
nxt.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent cse1){
         obj.dispose();
         new home1();
      }
     });

obj.setSize(2000,2000);
obj.setLayout(null);
obj.setBackground(Color.yellow);
obj.setVisible(true);
l1.setFont(new Font("HOSPITAL MANAGEMENT SYSTEM",Font.BOLD,30));
l2.setFont(new Font("NAME",Font.CENTER_BASELINE,15));
l3.setFont(new Font("CONTACT NUMBER",Font.CENTER_BASELINE,15));
l4.setFont(new Font("UNIVERSITY ROLL NO",Font.CENTER_BASELINE,15));
l1.setBounds(480,150,600,50);
l2.setBounds(450,300,200,50);
l3.setBounds(650,300,200,50);
l4.setBounds(850,300,200,50);
l5.setBounds(450,320,200,70);
l6.setBounds(450,390,200,70);
l7.setBounds(450,460,200,70);
l8.setBounds(450,530,200,70);
l9.setBounds(650,320,200,70);
l10.setBounds(650,390,200,70);
l11.setBounds(650,460,200,70);
l12.setBounds(650,530,200,70);
nxt.setBounds(650,610,200,40);

l13.setBounds(850,320,200,70);
l14.setBounds(850,390,400,70);
l15.setBounds(850,460,500,70);
l16.setBounds(850,530,500,70);
obj.add(l1);
obj.add(l2);
obj.add(l3);
obj.add(l4);
obj.add(l5);
obj.add(l6);
obj.add(l7);
obj.add(l8);
obj.add(l9);
obj.add(l10);
obj.add(l11);
obj.add(l12);
obj.add(l13);
obj.add(l14);
obj.add(l15);
obj.add(l16);
obj.add(nxt);


} 
    }
    

