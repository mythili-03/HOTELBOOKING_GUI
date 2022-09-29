import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


      

class vistahotel extends JFrame implements ActionListener
{
       JTextField t1,t2,t3,t5,t7,t8,t9,t10,t11,t13,t14,t15,t16,t17,t19,t20,t21;
       JButton b1,b2,b3,b4,b5;
       JLabel l1,l2,l3,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23;
       JFrame f1,f2,f3,f4,f5,f6;
      
       JRadioButton r1,r2;
       
       Choice c1,c2,c3,c5;
       public static void main(String args[])throws IOException
       {
          vistahotel r=new vistahotel();
       }
       public vistahotel()
       {
             
             f1=new JFrame("SIGN UP");
             f2=new JFrame("SIGN IN");
             f3=new JFrame("BOOKING A ROOM");
             f4=new JFrame("BOOKING A ROOM");
             f5=new JFrame("BOOKING A ROOM");
             f6=new JFrame("CONFIRMATION");
             l1=new JLabel("NAME");
             l1.setBounds(50,50,100,30);
             t1=new JTextField(20);
             t1.setBounds(230,50,100,30);
             l2=new JLabel("AGE");
             l2.setBounds(50,100,100,30);
             t2=new JTextField(20);  
             t2.setBounds(230,100,100,30);
             l3=new JLabel("PASSWORD:");
             l3.setBounds(50,150,200,30);
             t3=new JTextField(20);
             t3.setBounds(230,150,100,30);                       
             l5=new JLabel("CONTACT NUMBER:");
             l5.setBounds(50,200,200,30);
             t5=new JTextField(20);  
             t5.setBounds(230,200,100,30);
             l6=new JLabel("GENDER:");
             l6.setBounds(50,250,100,30);
             c1=new Choice();
             c1.setBounds(230,250,100,30);
             c1.add("male");
             c1.add("female");
             b1=new JButton("SIGN UP");
             b1.setBounds(50,300,100,30);                                      

             l7=new JLabel("USERNAME:");
             l7.setBounds(50,50,100,30);
             t7=new JTextField(20);  
             t7.setBounds(230,50,100,30);                   
             l8=new JLabel("PASSWORD:");
             l8.setBounds(50,100,200,30);
             t8=new JTextField(20);
             t8.setBounds(230,100,100,30);
             b2=new JButton("SIGN IN");
             b2.setBounds(50,150,100,30);
             
             l9=new JLabel("NAME:");
             l9.setBounds(50,50,100,30);
             t9=new JTextField(20);
             t9.setBounds(260,50,100,30);
             l10=new JLabel("DOB:");
             l10.setBounds(50,100,100,30);
             t10=new JTextField(20);  
             t10.setBounds(260,100,100,30);            
             l11=new JLabel("GENDER:");                                
             l11.setBounds(50,150,100,30);
             r1=new JRadioButton("MALE");
             r2=new JRadioButton("FEMALE");
             r1.setBounds(170,150,100,30);
             r2.setBounds(280,150,100,30);
             l12=new JLabel ("TYPE OF ID PROOF");
             l12.setBounds(50,200,200,30);
             c5=new Choice();
             c5.setBounds(260,200,100,30);
             c5.add("Aadhar card");
             c5.add("PAN card");
             l13= new JLabel("ID PROOF DETAILS");
             l13.setBounds(50,250,200,30);
             t13=new JTextField(20);
             t13.setBounds(260,250,100,30);
             b3=new JButton ("NEXT");
             b3.setBounds(50,300,100,30);
             
             l14=new JLabel("ADDRESS:");
             l14.setBounds(50,50,100,30);
             t14=new JTextField(20);
             t14.setBounds(230,50,100,30);
             l15=new JLabel("MOBILE:");
             l15.setBounds(50,100,100,30);
             t15=new JTextField(20);                             
             t15.setBounds(230,100,100,30);
             l16=new JLabel("NO OF ADULTS:");
             l16.setBounds(50,150,100,30);
             t16=new JTextField(20);
             t16.setBounds(230,150,100,30);
             l17=new JLabel("NO OF CHILDREN:");
             l17.setBounds(50,200,200,30);
             t17=new JTextField(20);  
             t17.setBounds(230,200,100,30);
             b4=new JButton("NEXT");
             b4.setBounds(50,250,100,30);
             
             l18=new JLabel("TYPE OF ROOM");
             l18.setBounds(50,50,100,30);
             c2=new Choice();
             c2.setBounds(230,50,100,30);             
             c2.add("deluxe");
             c2.add("standard");
             c2.add("king");
             l19=new JLabel("Date In:");
             l19.setBounds(50,100,200,30);
             t19=new JTextField(20);                             
             t19.setBounds(230,100,100,30);
             l20=new JLabel("Date Out:");
             l20.setBounds(50,150,100,30);
             t20=new JTextField(20);
             t20.setBounds(230,150,100,30);
             l21=new JLabel("NO OF BEDS");
             l21.setBounds(50,200,100,30);
             t21=new JTextField(20);  
             t21.setBounds(230,200,100,30);
             l23=new JLabel ("A/C or NON A/C");
             l23.setBounds(50,250,100,30);
             c3=new Choice();
             c3.setBounds(230,250,100,30);
             c3.add("A/C");
             c3.add("non A/C");
             b5= new JButton("NEXT");
             b5.setBounds(50,300,100,30);

             l22=new JLabel("BOOKING SUCCESSFUL.");            
             l22.setBounds(50,50,300,300);
             
             
             f1.add(l1);
             f1.add(l2);
             f1.add(l3);
             f1.add(l5);
             f1.add(l6);
             f1.add(t1);             
             f1.add(t2);
             f1.add(t3);             
             f1.add(t5);
             f1.add(c1);
             f1.add(b1);
             f2.add(l7);
             f2.add(l8);             
             f2.add(t7);
             f2.add(t8);
             f2.add(b2);
             f3.add(l9);
             f3.add(l10);
             f3.add(l11);
             f3.add(l12);
             f3.add(l13);
             f3.add(t9);
             f3.add(t10);
             f3.add(c5);
             f3.add(t13);
             f3.add(b3);
             f3.add(r1);
             f3.add(r2);
             f4.add(l14);
             f4.add(l15);
             f4.add(l16);
             f4.add(l17);
             f4.add(t14);
             f4.add(t15);
             f4.add(t16);
             f4.add(t17);
             f4.add(b4);
             f5.add(l18);
             f5.add(l19);
             f5.add(l20);
             f5.add(l21);
             f5.add(t19);
             f5.add(t20);
             f5.add(t21);
             f5.add(c2);
             f5.add(b5);
             f5.add(l23);
             f5.add(c3);
             f6.add(l22);
             b1.addActionListener(this);
             b2.addActionListener(this);
             b3.addActionListener(this);
             b4.addActionListener(this);             
             b5.addActionListener(this);
             f1.setLayout(null);
             f1.setVisible(true);
             f1.setSize(500,500);
             f2.setLayout(null);
             f2.setSize(400,400);
             f3.setLayout(null);
             f3.setSize(400,400);
             f4.setLayout(null);
             f4.setSize(400,400);      
             f5.setLayout(null);
             f5.setSize(400,400);
             f6.setLayout(null);
             f6.setSize(400,400);
             setDefaultCloseOperation(EXIT_ON_CLOSE);
             f1.getContentPane().setBackground(Color.GRAY);
             f2.getContentPane().setBackground(Color.GRAY);
             f3.getContentPane().setBackground(Color.GRAY);
             f4.getContentPane().setBackground(Color.GRAY);
             f5.getContentPane().setBackground(Color.GRAY);


}
        public void actionPerformed(ActionEvent ae)
        {
              
        String ni = t19.getText();
        String no = t20.getText();
        String na = t16.getText();
        String nc = t17.getText();
        String nb = t21.getText();

        String NAME=t9.getText();
        String name=t1.getText();
        int age=Integer.parseInt(t2.getText());
        String password=t3.getText();
        String username=t7.getText();
        String pswd=t8.getText();
            
                           

              if(ae.getSource()==b1)
              {
                  f1.dispose();
                  f2.setVisible(true);
               }
               else if(ae.getSource()==b2)
               {
                    if(username.equals(name)&&pswd.equals(password))
                    {
                         
                          f2.dispose();
                          f3.setVisible(true);
                     }
                }
               else if (ae.getSource()==b3)
               {
                 f3.dispose();
                 f4.setVisible(true);
               }
               else if (ae.getSource()==b4)
               {
                 f4.dispose();
                 f5.setVisible(true);
               }
               else if (ae.getSource()==b5)
               {
                 f5.dispose();
                 f6.setVisible(true);
               }
             
  try{
         FileWriter f=new FileWriter("vistahotel.txt");
           BufferedWriter out=new BufferedWriter(f);
          out.write("NAME="+NAME+"\n");
          out.write("DATE_IN="+ni+"\n");
          out.write("DATE_OUT="+no+"\n");
          out.write("NO_OF_ADULTS="+na+"\n");
          out.write("NO_OF_CHILDREN="+nc+"\n");
          out.write("NO_OF_BEDS="+nb+"\n");
          
          out.close();
      }
      catch(Exception ex){}
}
}
