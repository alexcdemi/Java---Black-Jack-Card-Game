/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;
import java.util.ArrayList;
/**
 *
 * @author Alexander
 */
public class Circuit {
    
ArrayList<Resistor> resistors = new ArrayList <>();      
private static Circuit instance = null;

    public static Circuit getInstance() {
    if (instance == null) {
    instance = new Circuit();
    }
    return instance;
    }

    
    private Circuit() {
        this.resistors = new ArrayList<>();
    }
    
    
    public void add(Resistor r){
        this.resistors.add(r);
        
    }

    @Override
    public String toString(){
        String answer = new String();
        for (int h = 0; h < resistors.size(); h++){
            
         answer +=this.resistors.get(h).toString() + "\n";
        }
        return (answer);
    }
}
