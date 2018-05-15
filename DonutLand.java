/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;

/**
 *
 * @author kadenmahsoob
 */
public class DonutLand {
    public static void main(String [] args) {
        final int firstBiteSize = 12; 
        
        Donut firstDonut; 
        
        
        firstDonut = new Donut(); 
        //access firstDonut's name property, type string and 
        //store the name Boston Creme in this particular Donut object's memory 
        firstDonut.name = "Boston Creme"; 
        
        //print a test of Boston Creme's member variable values 
        System.out.println("When first created, " + firstDonut.name + " 's\n"
            + "percent remaining is " + firstDonut.getPercRemaining()); 
        //print row of dashes 
        printDivider(); 
        
        System.out.println("Calling simulateEating and passing in\n" +
                "a bite size of " + firstBiteSize); 
        
        System.out.println("After being eaten, " + firstDonut.name + " 's\n" 
        + "percent remaining is " + firstDonut.getPercRemaining());
    }// close main 
    private static void printDivider() {
        System.out.println("-------------------------------------------------");
    }
}//close class 

