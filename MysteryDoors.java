/*
 * A small game that asks the user to choose 1 of the 3 chests offered to them 
 * in return the user will recieve some sort of gift from the chest they choose.
 */
package week6;
//import needed tools
import java.util.Scanner; 
import java.math.BigInteger; 
import java.util.Random; 
/**
 *
 * @author kadenmahsoob
 */
public class MysteryDoors {
    public static void main(String args[] ) {
        //create a scanner object to read input from user
        Scanner keyboardScanner = new Scanner(System.in); 
        //create a variable for user selection and running the switch statement
        int userSelection; 
        
        System.out.println("****WELCOME TO THE GAME OF THE WEEK****");
        System.out.println("-----Everyone is a Winner here-----"); 
        System.out.println("^^^^^    ^^^^^   ^^^^^");
        System.out.println("||$||    ||$||   ||$||"); 
        System.out.println("  1        2       3  "); 
        System.out.println("|| ||    || ||   || ||");
        System.out.println("^^^^^    ^^^^^   ^^^^^");
        System.out.println("Pick a chest that catches your eye to recieve a prize!"); 
        
        //rean the integer the user submits through keyboard either 1, 2, or 3
        userSelection = keyboardScanner.nextInt(); 
        
        switch(userSelection) {
            case 1: 
                prizeStatement(); //directs to generate statement 
                break; 
            case 2: 
                generateChest(); //directs to number chest 
                break; 
            case 3:
                ifElse(); //directs to if or else
                break;        
        }//close switch
    }// close main method
    //creates statement
    public static void prizeStatement(){
        System.out.println("WOOHOO, You won a piece of bread thats something right?!");
        System.out.println("Don't eat it all at once"); 
    }//close prizeStatement
    public static void generateChest(){ 
        System.out.println("Hooray! you have won");
        Random r = new Random(); 
        BigInteger bigInt = new BigInteger(25, r); 
        //makes number and shows statement
        System.out.println(bigInt + "chicken fingers");
        System.out.println("Looks like you better start eating!");
    }//closes generateChest
    public static void ifElse(){ 
        Scanner input = new Scanner(System.in); 
        System.out.println("Do you like waffles? yes or no");
        //makes variable for user input
        String n = input.next(); 
        if(n.equals("yes")){
            System.out.println("Thats great here are waffles and a crown"); 
            
        } //closes if 
        else {
            System.out.println("This is why we can't have nice things"); 
        }//closes else 
    }//closes ifElse 
}// close class Mystery Doors 
