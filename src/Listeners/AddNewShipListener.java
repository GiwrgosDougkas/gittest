/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import frame.AddShipFrame;
import frame.ContainerFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author George
 */
public class AddNewShipListener implements ActionListener {
    private ContainerFrame frame;
    public AddNewShipListener(ContainerFrame frame){
        this.frame=frame;
    
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        AddShipFrame frame1= new AddShipFrame();
        frame.dispose();
    }
    
}
