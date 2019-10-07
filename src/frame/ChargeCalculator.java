/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import Listeners.ChargeButtonListener;
import exam.Ship;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author George
 */
public class ChargeCalculator extends JFrame{
    private JPanel panel;
    private JButton button;
    
    public ChargeCalculator(Ship ship){
        
       panel=new JPanel();
       button=new JButton("Calculate Charge");
       
       panel.add(button);
       
       ChargeButtonListener listener=new ChargeButtonListener();
       listener.setShip(ship);
       
       button.addActionListener(listener);
       this.setContentPane(panel);
       this.setVisible(true);
       this.setTitle("Calculator");
       this.setSize(400,400);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
