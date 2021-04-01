
package motel.management.system;

import java.awt.Color;
import javax.swing.*;



public class Reception extends JFrame {
    
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9 ,b10, b11, b12;
    
    Reception(){
        b1 = new JButton("New Customer Form");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(10, 30, 200, 30);
        add(b1);
        
         b2 = new JButton("Room");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(10, 70, 200, 30);
        add(b2);
        
         b3 = new JButton("Department");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(10, 110, 200, 30);
        add(b3);
        
         b4 = new JButton("All Emplyee Info");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(10, 150, 200, 30);
        add(b4);
        
         b5 = new JButton("Customer Info");
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(10, 190, 200, 30);
        add(b5);
        
         b6 = new JButton("Manager Info");
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBounds(10, 230, 200, 30);
        add(b6);
        
         b7 = new JButton("Check Out");
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.setBounds(10, 270, 200, 30);
        add(b7);
        
         b8 = new JButton("Update Check Status");
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.setBounds(10, 310, 200, 30);
        add(b8);
        
         b9 = new JButton("Update Room Status");
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.setBounds(10, 350, 200, 30);
        add(b9);
        
         b10 = new JButton("Pick up Service");
        b10.setBackground(Color.BLACK);
        b10.setForeground(Color.WHITE);
        b10.setBounds(10, 390, 200, 30);
        add(b10);
        
          
         b11 = new JButton("Search Room");
        b11.setBackground(Color.BLACK);
        b11.setForeground(Color.WHITE);
        b11.setBounds(10, 430, 200, 30);
        add(b11);
        
          
         b12 = new JButton("Logout");
        b12.setBackground(Color.BLACK);
        b12.setForeground(Color.WHITE);
        b12.setBounds(10, 470, 200, 30);
        add(b12);
        
        
        
        setLayout(null);
        setBounds(400, 150, 800, 550);
        setVisible(true);
    }
    
    public static void main (String[] args){
    
        new Reception().setVisible(true);
        
    }
    
}
