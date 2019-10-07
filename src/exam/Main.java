/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import frame.ContainerFrame;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author George
 */

public class Main{
    public static List<Ship> ships=new ArrayList<>();
    public static void main(String[] args){
       
        Ship ship1=new Ship("Hercule", 450);
        ships.add(ship1);
               Container bulk1=new Bulk("BZY150","Athens",1500);
               Container bulk2=new Bulk("BZY151","Athens",1000);
               Container fridge1=new Fridge("FRID150","Athens",2.7);
               Container fridge2=new Fridge("FRID151","Athens",5.6);
               
               ship1.addContainer(bulk1);
               ship1.addContainer(bulk2);
               ship1.addContainer(fridge1);
               ship1.addContainer(fridge2);
               ContainerFrame frame=new ContainerFrame(ships);
    
    }
}
