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
public class NonMember extends Passenger {
    
    public NonMember (String name, int age ){
        
        super(name, age);
    }
    
    //Overriding the applyDiscount method from the parent class 'Passenger'
    
    @Override
    
    public double applyDiscount(double p){
        
        if (this.getAge() <= 65){
            
         return p;   
         
        }else
        
        return (p-(p*0.1));
    }
    
    
}
