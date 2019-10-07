/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author George
 */
public class Fridge extends Container {
    private double power;
    
    public Fridge(String newId, String newDestination, double newPower){
        super(newId,newDestination);
        this.power=newPower;
    }
    
    @Override
    public double getCharge(){
        return 2000*power;
    }
}
