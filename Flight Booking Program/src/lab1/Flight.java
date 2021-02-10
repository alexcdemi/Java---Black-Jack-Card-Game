/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Alexander DeMichele, 500433351
 */
public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;
    
    
    public Flight(int flightNumber,String origin, String destination, String departureTime,int capacity, double originalPrice){
        try {
            if (origin.equalsIgnoreCase(destination)== true){
                throw new IllegalArgumentException("Please choose a different flight, the destination and origin cannot be the same.");
            }else {
               this.flightNumber= flightNumber; 
               this.origin = origin;
               this.destination = destination;
               this.departureTime = departureTime;
               this.capacity = capacity;
               this.numberOfSeatsLeft = capacity;
               this.originalPrice = originalPrice;
            }    
        }   catch (IllegalArgumentException error){
            System.out.println(error);
        }
    }

    
    //Booking a Seat
    public boolean bookASeat(){
        if (numberOfSeatsLeft > 0){
            numberOfSeatsLeft--;
            return true;
            
        }else{
            return false;
        }
    }
    
    
    //Getters and Setter Methods
    
    
   //flight number
    
    
    public void setFlightNumber(int flightNumber){
        
        this.flightNumber = flightNumber;
    }
    
    public int getFlightNumber(){
        return flightNumber;
    }
    
    // origin
    
    public void setOrigin(String origin){
       this.origin = origin;
       
    }
    public String getOrigin(){
        return origin; 
    }
    
    //destination
    
    public void setDestination (String destination){
       this.destination = destination;   
    }
    
    public String getDestination (){
        return destination;
    }
    
    //departure time
    
    public String getDepartureTime(){
        return departureTime;
    }
    
    public void setDepartureTime(String departureTime){
        this.departureTime = departureTime;
    }
    
    
    //Capacity
    public int getCapacity(){
        return capacity;
    }
    
    public void setCapacity(int capacity){
        
        this.capacity = capacity;
    }
    
    
    //Original Price
    public double getOriginalPrice(){
        
        return originalPrice;
    }
    
    public void setOriginalPrice(int originalPrice){
        
        this.originalPrice = originalPrice;
    }
    
    
    //Number of Seats
    public int getNumberOfSeatsLeft(){
        return numberOfSeatsLeft;
        
    }
    public void setNumberOfSeatsLeft(int numberOfSeatsLeft){
        this.numberOfSeatsLeft=numberOfSeatsLeft;
        
    }
    
    //Overidden toString Method
    @Override
    public String toString(){
        
        return "Flight "+this.flightNumber + " " + this.origin + " to " + this.destination + ", " + this.departureTime + ", original price: " + this.originalPrice + "$ ";  
    }

    private Exception IllegalArgumentException(String please_choose_a_different_flight_the_dest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
