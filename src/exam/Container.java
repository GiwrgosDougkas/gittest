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
public abstract class Container {
    private String id;
    private String destination;
    
    public Container(String newId, String newDestination){
    
        this.id=newId;
        this.destination=newDestination;
    }
    
    public abstract double getCharge();
}
