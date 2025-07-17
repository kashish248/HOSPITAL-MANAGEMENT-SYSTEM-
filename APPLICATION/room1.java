import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JLabel;

public class room1 extends appoint{
    public room1()
    {
        JFrame jf=new JFrame("Room Service");
        JLabel l1=new JLabel("Facilities");
        JLabel l2=new JLabel("Bed Charges");
        JLabel l3=new JLabel("Diet Charges");
        JLabel l4=new JLabel("Advance Charges");
        JLabel l5=new JLabel("single room,separated cabin,AC");
        JLabel l6=new JLabel("single bed,attached bath,AC");
        JLabel l7=new JLabel("single bed ,attached bath");
        JLabel l8=new JLabel("Double bed,common bath");
        JLabel t1=new JLabel("750");
        JLabel t2=new JLabel("60");
        JLabel t3=new JLabel("7500");
        JLabel tt1=new JLabel("500");
        JLabel tt2=new JLabel("60");
        JLabel tt3=new JLabel("5000");
        JLabel f1=new JLabel("250");
        JLabel f2=new JLabel("60");
        JLabel f3=new JLabel("2500");
        JLabel ff1=new JLabel("100");
        JLabel ff2=new JLabel("60");
        JLabel ff3=new JLabel("1000");

        
 ImageIcon img =new ImageIcon("C:\\Users\\dell\\Desktop\\APPLICATION\\roo.jpg");
      JLabel  background=new JLabel("",img,JLabel.CENTER);
       background.setBounds(0,0,1300,780);
        
        
        JButton c1=new JButton("OK");
        JButton c2=new JButton("OK");
        JButton c3=new JButton("OK");
        JButton c4=new JButton("OK");
        c1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent cse15){
              jf.dispose();
              new exit1();
            }
        });

         c2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent cse16){
              jf.dispose();
              new exit1();
            }
        });

         c3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent cse17){
              jf.dispose();
              new exit1();
            }
        });

         c4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent cse18){
              jf.dispose();
              new exit1();
            }
        });
        
            jf.setLayout(null);
            l1.setBounds(50,20,200,40);
            l2.setBounds(300,20,80,40);
            l3.setBounds(410,20,90,40);
            l4.setBounds(520,20,150,40);
            l5.setBounds(50,100,200,40);
            l6.setBounds(50,150,200,40);
            l7.setBounds(50,200,200,40);
            l8.setBounds(50,250,200,40);
            t1.setBounds(300,100,80,40);
            t2.setBounds(410,100,90,40);
            t3.setBounds(520,100,100,40);
            tt1.setBounds(300,150,80,40);
            tt2.setBounds(410,150,90,40);
            tt3.setBounds(520,150,100,40);
            f1.setBounds(300,200,80,40);
            f2.setBounds(410,200,90,40);
            f3.setBounds(520,200,100,40);
            ff1.setBounds(300,250,80,40);
            ff2.setBounds(410,250,90,40);
            ff3.setBounds(520,250,100,40);
        
            c1.setBounds(650,100,80,40);
            c2.setBounds(650,150,80,40);
            c3.setBounds(650,200,80,40);
            c4.setBounds(650,250,80,40);
            jf.add(l1);
            jf.add(l2);
            jf.add(l3);
            jf.add(l4);
            jf.add(l5);
            jf.add(l6);
            jf.add(l7);
            jf.add(l8);
            jf.add(t1);
            jf.add(t2);
            jf.add(t3);
            jf.add(tt1);
            jf.add(tt2);
            jf.add(tt3);
            jf.add(ff1);
            jf.add(ff2);
            jf.add(ff3);
            jf.add(f1);
            jf.add(f2);
            jf.add(f3);
        
            jf.add(c1);
            jf.add(c2);
            jf.add(c3);
            jf.add(c4);
            jf.add(background);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(2000,2000);
        jf.setVisible(true);
    }
}