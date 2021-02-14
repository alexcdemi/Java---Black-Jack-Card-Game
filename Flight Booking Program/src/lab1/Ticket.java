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
public class Ticket {

    private Passenger passenger;
    private Flight flight;
    private double price;
    private static int counter = 0;
    private int number;
    
    public Ticket (Flight flight, Passenger passenger, double price){
        
        this.flight = flight;
        this.passenger = passenger;
        this.price = price;
        counter++;
        number=counter;
    }
    
    //Passenger
    
    public Passenger getPassenger(){
        return passenger;
    }
   
    public void setPassenger(Passenger passenger){
        this.passenger = passenger;
    }
    
    //flight
    
    public Flight getFlight(){
        
        return flight;
    }
    
    public void setFlight(Flight flight){
        this.flight= flight;
    }
    
    //price
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    //Number
    
    public int getNumber(){
        
        return number;
    }
    
    public void setNumber(int number){
        
        this.number = number;
        
    }
    
    //Counter
    
    public int getCounter(){
        
        return counter;
    }
    
    public void setCounter(int counter){
        this.counter= counter;
        
    }
    
    @Override
    public String toString(){

    return passenger.getName() + ", " + "Flight " + flight.getFlightNumber() + ", " + flight.getOrigin() + " to " + flight.getDestination() + ", " + flight.getDepartureTime() + ", " + "original price: " + flight.getOriginalPrice()+ "$ , ticket price: $" + price;                
        
    }
    
    
    
    
    
    
    
    
    

    
    

    
}
















