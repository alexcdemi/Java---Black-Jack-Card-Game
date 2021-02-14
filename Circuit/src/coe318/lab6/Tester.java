/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;


/**
 *
 * @author Alexander
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        
        Circuit circuit1 = Circuit.getInstance();
        Node C = new Node(), D = new Node(), F = new Node();
        System.out.println(C.toString()+"\n" + D.toString() + "\n" + F.toString());
        Resistor r1 = new Resistor(96.0, C, D), r2 = new Resistor(38.0, D, F);
        
        System.out.println(r1.toString() + "\n" + r2.toString());
        System.out.println("\nCircuit");
        circuit1.add(r1);
        circuit1.add(r2);
        System.out.println(circuit1.toString());
        
        
        
    }
    
}
