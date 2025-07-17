import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class registrationform implements ActionListener{
    
  
    JFrame frame;
    String[] gender={"Male","Female"};
    JLabel patientnamelabel=new JLabel("PATIENT NAME");
    JLabel fathersnamelabel=new JLabel("FATHER'S NAME");
    JLabel citylabel=new JLabel("CITY");
    JLabel emailidlabel=new JLabel("EMAIL ID");
    JLabel contactlabel=new JLabel("CONTACT");
    JLabel addresslabel=new JLabel("ADDRESS");
    JTextField patientnametextfield=new JTextField();
     JComboBox gendercombobox=new JComboBox<>(gender);
    JTextField fathersnametextfield=new JTextField();
    JTextField citytextfield=new JTextField();
    JTextField emailidtextfield=new JTextField();
    JTextField contacttextfield=new JTextField();
    JTextField addresstextfield=new JTextField();
     JLabel genderlabel=new JLabel("GENDER");
    JButton registerbutton=new JButton("REGISTER");
    JButton resetbutton=new JButton("CLEAR");
    ImageIcon img;
    JLabel background;
   
  

    public registrationform(){
       
        createwindow();
        setlocationandsize();
        addcomponentstoframe();
        actionevent();
    }
    public void createwindow(){
        frame=new JFrame("Registration Form");
        frame.setLayout(null);
        frame.setSize(2000,2000);    
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         img =new ImageIcon("C:\\Users\\dell\\Desktop\\APPLICATION\\reg1.jpg");
        background=new JLabel("",img,JLabel.CENTER);
       background.setBounds(0,0,2000,1750);
        


    }

    public void setlocationandsize(){
        patientnamelabel.setBounds(80,150, 200, 40);
        fathersnamelabel.setBounds(80,300,200,40);
        genderlabel.setBounds(80,220,200,40);
        citylabel.setBounds(80,360,200,40);
        emailidlabel.setBounds(80,440,200,40);
        contactlabel.setBounds(80,500,200,40);
        addresslabel.setBounds(80,560,200,40);
        patientnametextfield.setBounds(360,160,300,40);
        gendercombobox.setBounds(360,220,100,40);
        fathersnametextfield.setBounds(360,300,300,40);
        citytextfield.setBounds(360,360,300,40);
        emailidtextfield.setBounds(360,440,300,40);
        contacttextfield.setBounds(360,500,300,40);
        addresstextfield.setBounds(360,560,300,80);
        registerbutton.setBounds(150,670,100,40);
        resetbutton.setBounds(400,670,100,40);
        background.setBounds(0,0,2000,1038);
        
    }

    public void addcomponentstoframe(){
        frame.add(patientnamelabel);
        frame.add(genderlabel);
        frame.add(fathersnamelabel);
        frame.add(citylabel);
        frame.add(emailidlabel);
        frame.add(contactlabel);
        frame.add(addresslabel);
        frame.add(patientnametextfield);
        frame.add(fathersnametextfield);
        frame.add(citytextfield);
        frame.add(emailidtextfield);
        frame.add(contacttextfield);
        frame.add(addresstextfield);
        frame.add(gendercombobox);
        frame.add(registerbutton);
        frame.add(resetbutton);
        frame.add(background);
        
    }

    public void actionevent(){
       registerbutton.addActionListener(this);
       resetbutton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
           
    try{
       
       if(e.getSource()==registerbutton){
        Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1821");
       PreparedStatement psta1=con.prepareStatement("insert into msg values(?,?,?,?,?,?,?)");
        psta1.setString(1,patientnametextfield.getText());
        psta1.setString(2,fathersnametextfield.getText());
        psta1.setString(3,gendercombobox.getSelectedItem().toString());
        psta1.setString(4,citytextfield.getText());
        psta1.setString(5,emailidtextfield.getText());
        psta1.setString(6,contacttextfield.getText());
        psta1.setString(7,addresstextfield.getText());
       
            JOptionPane.showMessageDialog(null,"SUCESSFULLY REGISTERED");    
                  psta1.executeUpdate();
       
       } 
    }

               catch(Exception e1){
                System.out.println(e1);
               }
        if(e.getSource()==resetbutton){
            patientnametextfield.setText("");
            fathersnametextfield.setText("");
            citytextfield.setText("");
            emailidtextfield.setText("");
            contacttextfield.setText("");
            addresstextfield.setText("");
        }
     

  
  registerbutton .addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent cse4){
        frame.dispose();
        new appoint();
    }

  });

}
}
    
    
    

