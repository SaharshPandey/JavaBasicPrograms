
package delhiwork;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LeapGui {
    
JFrame f=new JFrame();
JPanel p=new JPanel();
JTextField tf=new JTextField();
JButton b=new JButton("Search");
JLabel jb=new JLabel();
public void indent()
{
f.setBounds(100, 100, 400, 400);
p.setLayout(null);
b.setBounds(140, 100, 100, 50);
tf.setBounds(140,30,100,40);
jb.setBounds(140, 200, 150, 150);

f.add(p);
p.add(b);
p.add(tf);
p.add(jb);
f.setVisible(true);

if(tf.getText()!=null)
{
b.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
   
    
     String year1=tf.getText();
    
     int year = Integer.valueOf(year1);
    if(year%4==0 && year%400==0 && year%100==0)
    {
    jb.setText("It's a Leap Year");
    
    }
    else if(year%4==0 && year%100!=0)
    {
    jb.setText("It's a Leap Year");
    }
    else if(tf.getText()==null)
    {
    jb.setText("Enter the Year First?");
    }
    else
    {jb.setText("It's not a Leap Year");
    }
    }
         
});
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
public static void main(String []args) 
{
LeapGui lg=new LeapGui();
lg.indent();
}


}
