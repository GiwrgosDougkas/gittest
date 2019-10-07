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
public class Bulk extends Container{
   private double weight;
   
   public Bulk(String newId, String newDestination, double newWeight){
       super(newId,newDestination);
       this.weight=newWeight;
   }

   @Override
        public double getCharge() {
            return 10*weight;
        }
}
