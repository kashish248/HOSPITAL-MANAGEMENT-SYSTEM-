

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class exit1

{
public exit1()
{
JFrame fr = new JFrame();



JLabel ch1 = new JLabel("YOU HAVE BEEN SUCCESSFULLY REGISTERED FOR YOUR APPOINTMENT     ! !");

  ImageIcon img=new ImageIcon("C:\\Users\\dell\\Desktop\\APPLICATION\\end.jpg");
      JLabel  background=new JLabel("",img,JLabel.CENTER);
       background.setBounds(0,0,2000,1057);
        

fr.setLayout(null);
 fr.setSize(2000,2000);

ch1.setBounds(100,400,1700,50);
ch1.setFont(new Font("YOU HAVE BEEN SUCCESSFULLY  REGISTERED FOR YOUR APPOINTMENT     ! !",Font.BOLD,30));

fr.add(ch1);
fr.add(background);

fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

fr.setVisible(true);

}

}




