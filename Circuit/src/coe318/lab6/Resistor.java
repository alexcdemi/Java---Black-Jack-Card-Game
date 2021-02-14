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
public class Resistor {
    
    private static int Count;
    public int numberOfResistors;
    public double resistance;
    public Node node1, node2;
    Node [] nodesArray = new Node[2];
    
    
    
    public Resistor(double resistance, Node node1, Node node2){
        
        numberOfResistors = ++Count;
        
        
        if (resistance < 0.0){
            
            throw new IllegalArgumentException("The resistance cannot be a negative value. Error");
        }else
            
            this.resistance = resistance;
            
        if (node1 == null || node2 == null){
            
            throw new IllegalArgumentException("Error. Two or more nodes must be present.");
            
        }
            this.node1 = node1;
            this.node2 = node2; 
            
    }
    
    public Node[] getNodes(){
        
        nodesArray[0] = node1;
        nodesArray[1] = node2;
        
        return nodesArray;
    }
    
    @Override
    public String toString(){
        
        return("R" + numberOfResistors + " " + node1 + " " + node2 + " " +resistance + "\n");
    }
    
}
