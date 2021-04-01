
package motel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;


public class MotelManagementSystem extends JFrame implements ActionListener{
    
    MotelManagementSystem(){
        setBounds(100, 100, 1366, 565);
        
     
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("first.jpg"));
        JLabel ll = new JLabel(i1);
        ll.setBounds(0,0,1366,565);
        add(ll);
        
        JLabel i2 = new JLabel("Hotel Management System");
        i2.setBounds(20, 430, 1000, 90);
        i2.setForeground(Color.WHITE);
        i2.setFont(new Font("serif", Font.PLAIN, 70));
        ll.add(i2);
        
        JButton b1 = new JButton("Next");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(1150, 450, 150, 50);
        b1.addActionListener(this);
        ll.add(b1);
        
        setLayout(null);
        setVisible(true);
        
        while(true){
            i2.setVisible(false);
            try{
                Thread.sleep(500);
            }catch(Exception e){
               
            }
            i2.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){}   
        }
    }
    
    public void actionPerformed(ActionEvent ae){
        new Login().setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new MotelManagementSystem();
        
    }
    
}
