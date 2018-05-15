/*
 * A price of sale application for the employees of a restaurant, 
 * maintains amount in inventory and total cost 
 */
package weekB1_scope;

import java.util.Scanner; 
/**
 *
 * @author kadenmahsoob
 */
public class OrderTabulatorKaden {
    
    private static int burgerOrder = 0; 
    private static int friesOrder = 0; 
    private static int saladOrder = 0; 
    //variables for ordering in one go 
    
    private static int burger = 30; 
    private static int fries = 90; 
    private static int salad = 50; 
    // variables for inventory 
    
    private static double orderTotal = 0; 
    final static double BURG_PRICE = 7.99; 
    final static double FRY_PRICE = 4.99; 
    final static double SAL_PRICE = 8.99; 
    final static double TAX = 0.07; 
    // variables for pricing and tax 
    
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in); 
        //create scanner for switch or case statements 
        int i = 0; 
        int userSelect; 
        //users selection 
        
        while (i == 0){
            System.out.println("****TODAY'S SPECIALS******"); 
            
            currentTotal(); 
            
            System.out.println("1. Burger"); 
            System.out.println("2. Fries"); 
            System.out.println("3. Salad"); 
            System.out.println(); 
            userSelect = userIn.nextInt(); 
            
            switch(userSelect){
                case 1: 
                    burger(); 
                    break; 
                case 2: 
                    fries(); 
                    break; 
                case 3: 
                    salad(); 
                    break; 
                default: 
                    System.out.println("Please choose something from the menu."); 
                    break; 
            }// end switch 
        }// close while 
    }// close main method 
    public static void burger() {
        if (burger > 0){
            Scanner quantity = new Scanner(System.in); 
            int quant; 
            System.out.println("Enter Quantity:"); 
            quant = quantity.nextInt(); 
            burgerOrder = burgerOrder + quant; 
            //add one order of burger 
            burger = burger - quant; 
            //take a burger from inventory 
            orderTotal = orderTotal + (quant * BURG_PRICE); 
            //add cost of one order to full order 
        } else{ 
            System.out.println("We apologize we are currently out of this food"); 
            System.out.println(""); 
        }//close else 
    } //close method 
    public static void fries(){
        if (fries > 0){
            Scanner quantity = new Scanner(System.in); 
            int quant; 
            System.out.println("Enter Quantity:"); 
            quant = quantity.nextInt(); 
            friesOrder = friesOrder + quant; 
            //add one order of fry  
            fries = fries - quant; 
            //take a fry from inventory 
            orderTotal = orderTotal + (quant * FRY_PRICE); 
            //add cost of one order to full order 
        } else{ 
            System.out.println("We apologize we are currently out of this food"); 
            System.out.println(""); 
        }//close else 
    }// close method 
    public static void salad(){
        if (salad > 0){
            Scanner quantity = new Scanner(System.in); 
            int quant; 
            System.out.println("Enter Quantity:"); 
            quant = quantity.nextInt(); 
            saladOrder = saladOrder + quant; 
            //add one order of salad 
            salad = salad - quant; 
            //take a salad from inventory 
            orderTotal = orderTotal + (quant * SAL_PRICE); 
            //add cost of one order to full order 
        } else{ 
            System.out.println("We apologize we are currently out of this food"); 
            System.out.println(""); 
        }//close else 
    }// close method 
    public static void currentTotal(){ 
        System.out.println("*** Order Summary for Meal *** "); 
        System.out.println("Burger - " + burgerOrder + " (" + burger + " remaining)" );  
        System.out.println("Fries - " + friesOrder + " (" + fries + " remaining)" ); 
        System.out.println("Salad - " + saladOrder + " (" + salad + " remaining)" );  
        System.out.println(""); 
        System.out.println("Current Total is $" + orderTotal);  
        System.out.println("tax: $" + orderTotal * TAX);  
        System.out.println("Total with Tax: $" + (orderTotal * TAX) + orderTotal); 
        System.out.println(""); 
        
    }
}// close class 
