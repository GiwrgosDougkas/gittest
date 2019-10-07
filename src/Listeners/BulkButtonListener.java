/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import exam.Bulk;
import exam.Fridge;
import exam.Main;
import exam.Ship;
import frame.ContainerFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author George
 */
public class BulkButtonListener implements ActionListener {
    private JTextField code;
    private JTextField destination;
    private JTextField weight;
    private JTextField power;
    private JButton bulk;
    private JButton fridge;
    private JButton charge;
    private JList list;
    
    public BulkButtonListener(JTextField newCode, JTextField newDestination, JTextField newWeight, JTextField newPower,
    JButton newBulk, JButton newFridge, JButton newCharge, JList newList){
        this.code=newCode;
        this.destination=newDestination;
        this.weight=newWeight;
        this.power=newPower;
        this.bulk=newBulk;
        this.fridge=newFridge;
        this.charge=newCharge;   
        this.list=newList;
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       try{
        String code1= code.getText();
        String destination1=destination.getText();
         double power1;
         double weight1;
        Object selectedShipName= list.getSelectedValue();
        Ship selectedShip=null;
        for(Ship ship: Main.ships){
            if(ship.equals(selectedShipName)){
                selectedShip=ship;
            }
        
        }
       
        if(ae.getSource()== bulk){
            try{
            String weightText= weight.getText();
             weight1= Double.parseDouble(weightText);
            Bulk newbulk=new Bulk(code1,destination1,weight1);
            selectedShip.addContainer(newbulk);
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Please enter the container weight");
            }
            
        }
        else if(ae.getSource()==fridge){
            try{
            String powerText= power.getText();
            power1= Double.parseDouble(powerText);
            Fridge newfridge=new Fridge(code1,destination1,power1);
            selectedShip.addContainer(newfridge);
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Please enter the container power");
            }
        }
        else if(ae.getSource()==charge){
           JOptionPane.showMessageDialog(null, "Total charge is"+selectedShip.getTotalCharge());
            
        }
       }catch(NullPointerException ex){
           JOptionPane.showMessageDialog(null,"please select your ship");
       }
    }
    
}
