/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
import java.util.ArrayList;

public class Hold {
    
    private int maximumWeight;
    
    private ArrayList<Suitcase> suitcases;
    
    public Hold( int maximumWeight){
        
        this.maximumWeight = maximumWeight;
        
        this.suitcases = new ArrayList <>();
        
        
    }
    
    public void addSuitcase(Suitcase suitcase){
      int totalWeight = 0;
        int sum = 0;
        for (Suitcase element: suitcases){
            
            totalWeight += element.totalWeight();
        }
            sum = totalWeight + suitcase.totalWeight();
            
            
            
            if (sum <= maximumWeight){
                
                this.suitcases.add(suitcase);
                
            }  
        
        
    }

    
    @Override
    
    
    public String toString(){
        
        int total = 0;
        for (Suitcase suitcase: this.suitcases){
            
            total += suitcase.getSuitCaseWeight();
        }

        return this.suitcases.size() + " suitcases (" + total +" kg)";    
    
    }
    
    
    public void printItems(){
        
        for (Suitcase element : suitcases){
            
            element.printItems();
  
        }

    }
 
}
