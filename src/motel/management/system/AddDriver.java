
package motel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;




public class AddDriver extends JFrame implements ActionListener{
    
    
    JTextField t1, t2, t3, t4, t5;
    JComboBox c1, c2;
    JButton b1, b2;
    
    AddDriver(){
        
        JLabel title = new JLabel("Add Drivers");
        title.setBounds(150, 10, 150, 30);
        title.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(title);
        
        JLabel name = new JLabel("Name");
        name.setFont(new Font("Tahoma", Font.PLAIN, 14));
        name.setBounds(60, 70, 100, 30);
        add(name);
        
          JLabel age = new JLabel("Age");
        age.setFont(new Font("Tahoma", Font.PLAIN, 14));
        age.setBounds(60, 110, 100, 30);
        add(age);
        
          JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Tahoma", Font.PLAIN, 14));
        gender.setBounds(60, 150, 100, 30);
        add(gender);
        
          JLabel car = new JLabel("Car Company");
        car.setFont(new Font("Tahoma", Font.PLAIN, 14));
        car.setBounds(60, 190, 100, 30);
        add(car);
        
          JLabel model = new JLabel("Car Model");
        model.setFont(new Font("Tahoma", Font.PLAIN, 14));
        model.setBounds(60, 230, 100, 30);
        add(model);
        
          JLabel available = new JLabel("available");
        available.setFont(new Font("Tahoma", Font.PLAIN, 14));
        available.setBounds(60, 270, 100, 30);
        add(available);
        
          JLabel location = new JLabel("Location");
        location.setFont(new Font("Tahoma", Font.PLAIN, 14));
        location.setBounds(60, 310, 100, 30);
        add(location);
        
        
//        TEXT FIELDS

        t1 = new JTextField();
        t1.setBounds(200, 70, 150, 30);
        add(t1);
        
         t2 = new JTextField();
        t2.setBounds(200, 110, 150, 30);
        add(t2);
        
        
            t3 = new JTextField();
        t3.setBounds(200, 230, 150, 30);
        add(t3);
        
            t4 = new JTextField();
        t4.setBounds(200, 190, 150, 30);
        add(t4);
        
            t5 = new JTextField();
        t5.setBounds(200, 310, 150, 30);
        add(t5);
        
        
        
//        COMBOBOX

        c1 = new JComboBox(new String[] { "Male", "Female" });
        c1.setBounds(200, 150, 150, 30);
        add(c1);
        
         c2 = new JComboBox(new String[] { "Male", "Female" });
        c2.setBounds(200, 270, 150, 30);
        add(c2);
        
        
//        BUTTONS

        b1 = new JButton("Add Driver");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(60, 370, 120, 30);
        b1.addActionListener(this);
        add(b1);
        
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        b2.setBounds(190, 370, 120, 30);
        add(b2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("eleven.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l1 = new JLabel(i3);
        l1.setBounds(400, 50, 500, 300);
        add(l1);
       
        
        setLayout(null);
        setBounds(400, 200, 1000, 450);
        setVisible(true);
        
    }
    
     @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource() == b1){
           
           String name = t1.getText();
           String age = t2.getText();
           String gender = (String) c1.getSelectedItem();
           String company = t3.getText();
           String brand = t4.getText();
           String available = (String) c2.getSelectedItem();
           String location = t5.getText();
           
           conn c = new conn();
           
           String str = "insert into driver values('"+name+"', '"+age+"', '"+gender+"', '"+company+"', '"+brand+"', '"+available+"', '"+location+"')";
           
           
           try{
               c.s.executeUpdate(str);
               JOptionPane.showMessageDialog(null, "Driver Succesfylly Added");
           }catch(Exception e){
               e.printStackTrace();
           }
           
           
           
           
       }else if(ae.getSource() == b2){
           setVisible(false);
       }
    }
    
    public static void main(String[] args){
    
        new AddDriver().setVisible(true);
    }

   
    
}
