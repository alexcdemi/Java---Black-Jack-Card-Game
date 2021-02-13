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

public class Suitcase {
    
    private ArrayList<Item> itemList;
    private int maximumWeight;
    private int suitCaseWeight;
    public Suitcase(int maximumWeight){
        
      this.maximumWeight = maximumWeight;
   
      this.itemList = new ArrayList<>();
        
    }
    
    public void addItem(Item item){
        int totalWeight = 0;
        int sum = 0;
        for (Item element: itemList){
            
            totalWeight += element.getWeight();
        }
            sum = totalWeight + item.getWeight();
            
            
            
            if (sum <= maximumWeight){
                
                itemList.add(item);
                this.setSuitcaseWeight(sum);
            }else{
                return;
            }
            

    }
    
    public void setSuitcaseWeight(int w){
        this.suitCaseWeight = w;
        
    }
    
    public int getSuitCaseWeight(){
        return this.suitCaseWeight;
    }
    
    public void printItems(){
        
        for (Item element : this.itemList){
            
            System.out.println(element.toString());
        }
        
    }
    public int totalWeight(){
        int total = 0;
        for(Item element : this.itemList){
            total+= element.getWeight(); 
        }
        
        return total;
    }
    
    public Item heaviestItem(){
        
        if (this.itemList.isEmpty()){
            
            return null;
        }
        
        
        Item heaviest = this.itemList.get(0);
        
        for (Item element : this.itemList){
            
            if (element.getWeight() > heaviest.getWeight()){
                
                heaviest = element;
            }
            
        }
        return heaviest;
        
        
    }
    
    
    
    @Override
    
    public String toString(){
        
        if (this.itemList.isEmpty()){
            
            return "no items (0 kg)";
        }else if (this.itemList.size() == 1){
            
             return this.itemList.size() + " item (" + this.getSuitCaseWeight() + " kg)";
        }else {
        
        return this.itemList.size() + " items (" + this.getSuitCaseWeight() + " kg)";
        }
   }
    
}
