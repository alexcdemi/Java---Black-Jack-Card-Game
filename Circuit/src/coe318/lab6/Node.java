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
public class Node {
    
    // Declaring Instance Variables:
    
    private int nodes;
    private static int nodeNum = 0;
    
    
    // Implementing a Constructor
    
    public Node(){
        
        this.nodes = nodeNum;
        nodeNum++;
        
    }
    
    
    @Override
    
    public String toString(){
        
        
        return ("" + this.nodes);
    }
    
    
    
}
