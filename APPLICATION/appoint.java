import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
class appoint extends registrationform{
    public appoint(){
        JFrame frm2=new JFrame();
        JButton bu=new JButton("LOGOUT");
        JLabel lab0=new JLabel("LIST OF DOCTORS                                                                       Timing");
        JLabel lab1=new JLabel("NEUROLOGIST                                                                          2:00PM to 4:00PM");
        JLabel lab2=new JLabel("DERMATOLOGIST                                                                      2:00PM t0 4:00PM");
        JLabel lab3=new JLabel("PEDIATRICIAN                                                                         2:00PM to 4:00PM");
        JLabel lab4=new JLabel("CARDIOLOGIST                                                                         2:00PM to 4:00PM");
        JLabel lab5=new JLabel("PATHOLOGIST                                                                          2:00PM to 4:00PM");
        JLabel lab6=new JLabel("NEPHROLOGIST                                                                        2:00PM to 4:00PM");
        JLabel lab7=new JLabel("GYNECOLOGIST                                                                        2:00PM to 4:00PM");
        JLabel lab8=new JLabel("UROLOGIST                                                                             2:00PM to 4:00PM");
        JLabel lab9=new JLabel("GASTROENTEROLOGY                                                              2:00PM to 4:00PM");
        JLabel lab10=new JLabel("OPTHALMOLOGIST                                                                  2:00PM to 4:00PM");
       
        ImageIcon  img =new ImageIcon("C:\\Users\\dell\\Desktop\\APPLICATION\\app1.jpg");
       JLabel  background=new JLabel("",img,JLabel.CENTER);
       background.setBounds(0,0,2000,1220);
        
        JButton ch1=new JButton("MY APPOINTMENT");
        JButton ch2=new JButton("MY APPOINTMENT");        
        JButton ch3=new JButton("MY APPOINTMENT");                
        JButton ch4=new JButton("MY APPOINTMENT");
        JButton ch5=new JButton("MY APPOINTMENT");
        JButton ch6=new JButton("MY APPOINTMENT");
        JButton ch7=new JButton("MY APPOINTMENT");
        JButton ch8=new JButton("MY APPOINTMENT");
        JButton ch9=new JButton("MY APPOINTMENT"); 
        JButton ch10=new JButton("MY APPOINTMENT");
        ch1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent cse5){
                frm2.dispose();
                new room1();
            }

        });

         ch2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent cse6){
                frm2.dispose();
                new room1();
            }

        });

         ch3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent cse7){
                frm2.dispose();
                new room1();
            }

        });

         ch4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent cse8){
                frm2.dispose();
                new room1();
            }

        });

         ch5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent cse9){
                frm2.dispose();
                new room1();
            }

        });

         ch6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent cse10){
                frm2.dispose();
                new room1();
            }

        });

         ch7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent cse11){
                frm2.dispose();
                new room1();
            }

        });

         ch8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent cse12){
                frm2.dispose();
                new room1();
            }

        });

         ch9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent cse13){
                frm2.dispose();
                new room1();
            }

        });

         ch10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent cse14){
                frm2.dispose();
                new room1();
            }

        });
        
        
        frm2.setLayout(null);
        bu.setBounds(20,10,100,40);
        lab0.setBounds(200,20,400,40);
        lab1.setBounds(200,80,400,40);
        ch1.setBounds(1000,80,200,40);
        
        lab2.setBounds(200,160,400,40);
        ch2.setBounds(1000,160,200,40);
        
        lab3.setBounds(200,240,400,40);
        ch3.setBounds(1000,240,200,40);
       
        lab4.setBounds(200,320,400,40);
        ch4.setBounds(1000,320,200,40);
        
        lab5.setBounds(200,400,400,40);
        ch5.setBounds(1000,400,200,40);
       
        lab6.setBounds(200,480,400,40);
        ch6.setBounds(1000,480,200,40);
        
        lab7.setBounds(200,560,400,40);
        ch7.setBounds(1000,560,200,40);
        
        lab8.setBounds(200,640,400,40);
        ch8.setBounds(1000,640,200,40);

        lab9.setBounds(200,720,400,40);
        ch9.setBounds(1000,720,200,40);
        
        lab10.setBounds(200,800,400,40);
        ch10.setBounds(1000,800,200,40);
        
        
        frm2.add(bu);
        frm2.add(lab0);
        frm2.add(ch1);
        
        frm2.add(lab1);
        frm2.add(ch2);
       
        frm2.add(lab2);
        frm2.add(ch3);
        
        frm2.add(lab3);
        frm2.add(ch4);
       
        frm2.add(lab4);
        frm2.add(ch5);
        
        frm2.add(lab5);
        frm2.add(ch6);

        frm2.add(lab6);
        frm2.add(ch7);
        
        frm2.add(lab7);
        frm2.add(ch8);
        
        frm2.add(lab8);
        frm2.add(ch9);
               
        frm2.add(lab9);
        frm2.add(ch9);
        
        frm2.add(lab10);
        frm2.add(ch10);
        
        
        
        frm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm2.setSize(2000,2000);
        frm2.setVisible(true);
    }
    
}
    

