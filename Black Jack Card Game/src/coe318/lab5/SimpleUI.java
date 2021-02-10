package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        System.out.println("House holds: ");
        System.out.println(game.getHouseCards());
        System.out.println("You hold: ");
        System.out.println(game.getYourCards());
    }

  @Override
    public boolean hitMe() {
        System.out.println("Do you want another hit? y/n?");
        String decision = user.nextLine();
        boolean hits = false;
        switch(decision){
            case "y":
            hits = true;
            break;
            
            case "n":
            hits = false;
            break;
            
            default:
                System.out.println("Please enter either 'y' or 'n'.");
                hitMe();
        }
        return(hits);
    }

  @Override
    public void gameOver() {
        this.display();
        int yourScore = game.score(game.getYourCards());
        int houseScore = game.score(game.getHouseCards());
        System.out.println("House Score: " + houseScore + ", Your Score: " + yourScore);
        if( (yourScore > houseScore || houseScore > 21) && (yourScore <= 21)){
            System.out.println("You Win!");
        }else{
            System.out.println("House Wins!");
        }
       System.out.println("Thanks for playing!");
    }

}