/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import exam.Main;
import exam.Ship;
import frame.AddShipFrame;
import frame.ContainerFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author George
 */
public class AddShipListener implements ActionListener{
    private AddShipFrame frame;
    private JTextField name;
    private JTextField capacity;
    private JButton add;
    public AddShipListener(AddShipFrame aframe, JTextField newName, JTextField newCapacity, JButton newAdd){
        
        this.frame=aframe;
        this.name=newName;
        this.capacity=newCapacity;
        this.add=newAdd;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()== add){
            try{
            String newname= name.getText();            
                try{                   
                    int newcapacity= Integer.parseInt(capacity.getText());                    
                     Ship newship=new Ship(newname,newcapacity);
                      Main.ships.add(newship);
                      frame.dispose();
                      ContainerFrame container=new ContainerFrame(Main.ships);
                }catch(NumberFormatException ex){
                 JOptionPane.showMessageDialog(null, "Please enter ship capacity");
                }
                
            }catch(NullPointerException ex){
                JOptionPane.showMessageDialog(null, "Please enter ship name");
            }
            
          
            
         }
       
    }
    
}
