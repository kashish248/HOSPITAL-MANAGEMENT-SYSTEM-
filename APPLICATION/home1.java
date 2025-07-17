    

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

    public class home1 
    {
      public home1(){
  
        JFrame fr=new JFrame("HOME PAGE");
        fr.setTitle("welcome");
               
                fr.setLayout(null);
                
  
        JLabel l =new JLabel("LOYAL     HOSPITAL");

        
        ImageIcon  img =new ImageIcon("C:\\Users\\dell\\Desktop\\APPLICATION\\log.jpg");
      JLabel  background=new JLabel("",img,JLabel.CENTER);
       background.setBounds(0,0,2000,1000);
        
         l.setBounds(500,200,600,150);
         l.setFont(new Font("LOYAL HOSPITAL",Font.BOLD,50));
         l.setForeground(Color.red);
         
          JButton b2=new JButton("PATIENT LOGIN");
          b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent cse2){
              fr.dispose();
              new registrationform();
            }
          });
            


           
          b2.setBounds(550,500,300,100);
         fr.add (l);
        
        fr. add(b2);
        fr.add(background);
        
        fr.setBackground(Color.green);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr. setSize(2000,2000);
        fr.setVisible(true);

       
  
    }
      
    }
    
    
