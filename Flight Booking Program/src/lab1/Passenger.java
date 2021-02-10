/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Alexander De Michele, 500433351
 */
public abstract class Passenger {
    
   private String name;
   private int age;
   
   public Passenger (String name, int age){
       
       this.name = name;
       this.age = age;
   }
   //abstract method applyDiscount
  abstract public double applyDiscount(double p); 
   
   
   //Getter and Setter Methods
   
   public void SetName(String name){
       this.name = name;
   }
   
   public String getName(){
       return name;
   }
   
   public void setAge(int age){
       this.age = age;
   } 
   public int getAge(){
       return age;
   }
}
