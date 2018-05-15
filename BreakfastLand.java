/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;
import java.util.Scanner; 
/**
 *
 * @author kadenmahsoob
 */
public class BreakfastLand {
     public static int loop = 0; 
     
     public static void main(String[] args) {
         double firstBite = 0; 
         
         //create variables for the breakfast objects that go with class instances 
         Donut firstDonut; 
         firstDonut = new Donut(); 
         
         Waffle firstWaffle; 
         firstWaffle = new Waffle(); 
         
         Bacon firstBacon; 
         firstBacon = new Bacon(); 
         
         //ask user for what they want to eat and take information in.
         System.out.println("\n what would you like to eat this morning?"
                + "\nDonut\n"
                + "Waffle\n"
                + "Bacon\n"); 
         Scanner scanner = new Scanner(System.in); 
         String userOp = scanner.next(); 
         
         //switch and loop to choose the food and continue with meal
         do{firstBite = firstBite + 0.1; 
            switch(userOp) {
                case "Donut": 
                    firstDonut.simulateEating(firstBite); 
                    printDivider(); 
                    displayDonutInfo(firstBite, firstDonut);
                    printDivider(); 
                    keepEating(); 
                    break; 
                case "Waffle": 
                    firstWaffle.eatWaffle(firstBite); 
                    printDivider(); 
                    displayWaffleInfo(firstBite, firstWaffle); 
                    printDivider(); 
                    keepEating(); 
                    break; 
                case "Bacon": 
                    firstBacon.eatBacon(firstBite); 
                    printDivider(); 
                    displayBaconInfo(firstBite, firstBacon); 
                    printDivider(); 
                    keepEating(); 
                    break; 
                    
            }//close switch
           
         } while(loop ==0);  //close do
     } //close main 
     
     private static void printDivider() {
         System.out.println("---------------------------------"); 
     }
     
     public static void displayDonutInfo(double firstBite, Donut firstDonut){
         System.out.println("You have eaten " + firstBite + " of your donut. \n"); 
         System.out.println("Total sugar consumed: " + firstDonut.displaySugar() + " grams."); 
         System.out.println("Total fat consumed: " + firstDonut.displayFat() + " grams.");
         System.out.println("Total calories consumed: " + firstDonut.displayCalories() + " calories."); 
         firstDonut.donutReset(); 
     }// close method
     public static void displayWaffleInfo(double firstBite, Waffle firstWaffle){
         System.out.println("You have eaten " + firstBite + " of your waffle. \n"); 
         System.out.println("Total sugar consumed: " + firstWaffle.displaySugar() + " grams."); 
         System.out.println("Total fat consumed: " + firstWaffle.displayFat() + " grams.");
         System.out.println("Total calories consumed: " + firstWaffle.displayCalories() + " calories."); 
         firstWaffle.waffleReset(); 
     }
     public static void displayBaconInfo(double firstBite, Bacon firstBacon) {
         System.out.println("You have eaten " + firstBite + " of your baconyepp. \n"); 
         System.out.println("Total sugar consumed: " + firstBacon.displaySugar() + " grams."); 
         System.out.println("Total fat consumed: " + firstBacon.displayFat() + " grams.");
         System.out.println("Total calories consumed: " + firstBacon.displayCalories() + " calories."); 
         firstBacon.baconReset(); 
     }// close method
     
     public static void keepEating() {
         System.out.println("Keep eating?\n"); 
         Scanner scanner = new Scanner(System.in); 
         String userInput = scanner.next(); 
         
         if(userInput.equals("No")) {
             loop = 5;
         }// close if 
     }// close keepEating
}//close class 
