/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import exam.Ship;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author George
 */
public class ChargeButtonListener implements ActionListener {
    private Ship ship;
    
    public void setShip(Ship ship1){
        this.ship=ship1;
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
       System.out.println(ship.getTotalCharge());
    }
    
}
