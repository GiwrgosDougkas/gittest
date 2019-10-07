/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import Listeners.AddShipListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
    
/**
 *
 * @author George
 */
public class AddShipFrame extends JFrame{
    private JButton add;
    private JTextField name;
    private JTextField capacity;
    private JPanel panel;
    public AddShipFrame(){
        panel=new JPanel();
        add=new JButton("Add Ship");
        name= new JTextField("Ship Name");
        capacity=new JTextField("Ship Capacity");
        
        panel.add(name);
        panel.add(capacity);
        panel.add(add);
        AddShipListener listener= new AddShipListener(this,name,capacity,add);
        add.addActionListener(listener);
        
        this.setVisible(true);
        this.setTitle("Add ship");
        this.setSize(400,400);      
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
