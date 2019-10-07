/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author George
 */
public class Ship {
    private String name;
    private int capacity;
    private List<Container> containers=new ArrayList<>();
    
    public Ship(String newName, int newCapacity){
        this.name=newName;
        this.capacity=newCapacity;
    }
    
    public void addContainer(Container item){
        if(containers.size()<capacity){
        containers.add(item);
        }
        else{
            System.out.println("Ship is foul");
        }
        
    }
    
    @Override
    
    public String toString(){
        return this.name;
    }
    public double getTotalCharge(){
        double sum=0;
        for(Container container: containers){
           sum+=container.getCharge();
        
        }
        return sum;
    }
}
