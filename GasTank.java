/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;


import java.util.Scanner; 
/**
 *
 * @author kadenmahsoob
 */
public class GasTank {
    
    public static void main(String[] args) {
        
        System.out.println("****** Will I Make It?********");
        // question user is asking program
   
        double MilesPerGallon;
        double GasLeft; 
        double MilesLeft; 
        Scanner userInputScanner = new Scanner(System.in); 
        //create a Scanner object using the imported class library
        
        System.out.println("How many miles per gallon does your car get?"); 
        // prompt user for average MPG of their car
        MilesPerGallon = userInputScanner.nextDouble(); 
        
        System.out.println("How many gallons remain in your tank?"); 
        //prompt user for gallons left in tank
        GasLeft = userInputScanner.nextDouble(); 
        
        if(MilesPerGallon < 0){
             System.out.println("Start the program over"); 
        }// close if statement 
        System.out.println("How many miles to the next gas station?"); 
        //prompt user for miles left to station
        MilesLeft = userInputScanner.nextDouble(); 
        
        if(GasLeft * MilesPerGallon >= MilesLeft) {
            System.out.println("Hooray, you'll make it to the next station!");
            
        }// close if statement
        else {
            System.out.println("Bad news, you're in for a walk to the station.");
        }// close else statement
    }// close main method
} //close class GasTank 
