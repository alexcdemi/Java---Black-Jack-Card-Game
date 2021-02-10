/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Alexander
 */
public class Member extends Passenger {
    
    private int yearsOfMembership;
    
    public Member(int yearsOfMembership, String name, int age){
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;    
    }
    
    
    //Overriding the applyDiscount Method from the parent class 'Passenger'
    
    @Override
    public double applyDiscount(double p){
        if (yearsOfMembership > 1 && yearsOfMembership <= 5 ){
            
            return (p - (p * 0.1));
        }else
        if (yearsOfMembership > 5){
            return (p*0.5);
            
        }else
        return p;
    }
}
