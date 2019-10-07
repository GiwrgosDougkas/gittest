/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import Listeners.AddNewShipListener;
import Listeners.BulkButtonListener;
import exam.Bulk;
import exam.Fridge;
import exam.Main;
import exam.Ship;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.EAST;
import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.SOUTH;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author George
 */
public class ContainerFrame extends JFrame {
    private JPanel gridpanel;
    private JPanel centralpanel;
    private JTextField codefield;
    private JTextField destinationfield;
    private JTextField weightfield;
    private JTextField powerfield;
    private JButton charge;
    private JButton bulk;
    private JButton fridge;
    private JList shiplist;
    private GridLayout grid;
    private BorderLayout border;
    private DefaultListModel model;
    private JButton addship;
    
    
    public ContainerFrame(List<Ship> ships){
        gridpanel=new JPanel();
        shiplist=new JList();
        codefield=new JTextField("code");
         destinationfield=new JTextField("destination");
          weightfield=new JTextField("weight");
           powerfield=new JTextField("power");
        bulk=new JButton("Create Bulk");
        fridge=new JButton("Create Fridge");
        charge=new JButton("Calculate Charge");
        addship=new JButton("Add new Ship");
        grid=new GridLayout(3,2);
        gridpanel.setLayout(grid);
        
        gridpanel.add(codefield);
        gridpanel.add(destinationfield);
        gridpanel.add(weightfield);
        gridpanel.add(powerfield);
        gridpanel.add(bulk);
        gridpanel.add(fridge);
        
        centralpanel=new JPanel();
        
        border=new BorderLayout();
        
        centralpanel.setLayout(border);
        
        centralpanel.add(shiplist, EAST);
        centralpanel.add(gridpanel, CENTER);
        centralpanel.add(charge, SOUTH);
        centralpanel.add(addship, NORTH);
        model= new DefaultListModel();  
        for(Ship ship: ships){
               model.addElement(ship);
        }
        
        shiplist.setModel(model);
        //ADD Listeners
        BulkButtonListener listener=new BulkButtonListener(this.codefield,this.destinationfield,this.weightfield,this.powerfield,this.bulk,this.fridge,this.charge, this.shiplist);
        bulk.addActionListener(listener);
        fridge.addActionListener(listener);
        charge.addActionListener(listener);
        
        AddNewShipListener add=new AddNewShipListener(this);
        addship.addActionListener(add);
        this.setVisible(true);
        this.setSize(400,400);
        this.setContentPane(centralpanel);
        this.setTitle("Container Frame");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
     public  JTextField getCode(){
         return this.codefield;
     }
    
     public JTextField getDestination(){
         return this.destinationfield;
     }
     
     public JTextField getWeight(){
         return this.weightfield;
     }
     
     public JTextField getPowerField(){
         return this.powerfield;
     }
     
      public JList getShipList(){
          return this.shiplist;
      }
      
      public JButton getBulkButton(){
          return this.bulk;
      }
      
      public JButton getFridgeButton(){
          return this.fridge;
      }
      public JButton getChargeButton(){
          return this.charge;
      }
      
}