/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Alexander De Michele
 */
public class Manager {
    
    private static ArrayList<Flight> flightList = new ArrayList<>();
    private static ArrayList<Ticket> ticketList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    
    
    
    //Methods
    
    ///Adding Flight Objects to the ArrayList flightList
    public static void createFlights(){
        
        System.out.println("Please enter the flight's number: ");
        int flightNum = scanner.nextInt();
        scanner.nextLine();      
        
        System.out.println("Please enter the flight's origin: ");
        String origin = scanner.nextLine();
        
        System.out.println("Please enter the flight's destination: ");
        String destination = scanner.nextLine();
        
        System.out.println("Please enter the flight's departure time and date: ");
        String departTime = scanner.nextLine();
        
        System.out.println("Please enter the flight's capacity: ");
        int capac = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter the original price of the flight's ticket: ");
        double origPrice = scanner.nextDouble();
        scanner.nextLine();
        flightList.add(new Flight(flightNum, origin, destination, departTime, capac, origPrice));
        
        
    }
    
    public static void displayAvailableFlights(String origin, String destination){
        
            for (Flight element : flightList){
            
                if (element.getOrigin().equalsIgnoreCase(origin) && element.getDestination().equalsIgnoreCase(destination)){
                
                    System.out.println(element.toString());
                    
                }else
                    System.out.println("No available Flights. Please Enter Again.");
           
            }
    }
    
    
    public static Flight getFlight(int flightNumber){
        
        for (Flight element: flightList){
            
            if (element.getFlightNumber() == flightNumber)
            
            return element;
        }
        return null;
    }
    
    public static void bookSeat(int flightNumber, Passenger p){
        
        String yes = "yes";
        String no = "no";
        
        for (Flight element: flightList){
            if (element.getFlightNumber() == flightNumber){
                
                System.out.println("Flight exists.\n Attempting to Book: \n");
                
                boolean booking = element.bookASeat();
                    if (booking == true){
                        
                        System.out.println("Booking Successful.Issuing Ticket:");
                        
                       Ticket t1 = new Ticket(null,null, 1.0);
                       t1.setFlight(element);
                       t1.setPassenger(p);
                       t1.setPrice(p.applyDiscount(getFlight(flightNumber).getOriginalPrice()));
                       ticketList.add(t1);
                        System.out.println(t1.toString());
                    }else {
                        
                        System.out.println("Apologies, there are no seats left on this flight. Please pick another flight");
                       
                    }
      
            }else if (element.getFlightNumber() != flightNumber) {
                
                System.out.println("Flight does not exist, please choose a different flight.");
                
            }      
        }
    }    
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanna = new Scanner(System.in);
        
        //Create Available Flights
        
        createFlights();
        createFlights();
        createFlights();
         //Display available flights
        int k = 0; 
        while(k < flightList.size()){
        displayAvailableFlights(flightList.get(k).getOrigin(), flightList.get(k).getDestination());
        k++;
        }
        //Retrieve a Flight, by its number
        System.out.println("Enter the number of the flight you wish to see");
        int flightNumNum = scanna.nextInt();
        scanna.nextLine();
        getFlight(flightNumNum);
        
        //Create a passenger:
        
        System.out.println("Please enter the passenger's name: ");
        String n = scanna.nextLine();
        
        System.out.println("Please enter the passenger's age: ");
        int a = scanna.nextInt();
        scanna.nextLine();
        
        
        String yes = "yes"; 
        String no = "no";
        
      
        System.out.println("Is the passenger member? Answer yes or no");
        
        String answer = scanna.nextLine();
        
        if (answer.equalsIgnoreCase(yes)){
            System.out.println("Please input the number of years the passenger has been a member");
            int memYears = scanna.nextInt();
            scanna.nextLine();
            Member mem = new Member(memYears, n, a);
            
            System.out.println("Please enter the flight number of the flight you wish to book:");
            int flightNumba1 = scanna.nextInt();
            scanna.nextLine();
            System.out.println("Booking Ticket: ");
            bookSeat(flightNumba1, mem);
            
        }else if(answer.equalsIgnoreCase(no)) {
            NonMember nonMem = new NonMember(n, a);
             System.out.println("Please enter the flight number of the flight you wish to book:");
            int flightNumba2 = scanna.nextInt();
            scanna.nextLine();
            
            bookSeat(flightNumba2, nonMem);
        }

    }
    
}
