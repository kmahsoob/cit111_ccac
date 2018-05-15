/*
 * Zoo park with certain animals and information about the animals 
 */
package finalproject;
import java.util.Scanner; 
/**
 * Inspiration came from the idea of a fish tank similar wanted to have a collection of animals 
 * @author kadenmahsoob
 */
public class ZooPark { 
    public static int loop = 0;
    public static void main(String[] args) {
        double firstVisit = 0; 
        Scanner userInput = new Scanner(System.in); 
        Scanner keyboardScanner = new Scanner(System.in); 
        int userSelection; 
        //user selection added 
        System.out.println("Welcome to the Zoo Park!"); 
        printDivider(); 
        //seperate text with a line 
        System.out.println("What animal would you like to see today?"
                + "\n1. Lion"
                + "\n2. Giraffe"
                + "\n3. Elephant"); 
        userSelection = keyboardScanner.nextInt(); 
        //allow user selection for choices 
    do {firstVisit = firstVisit + 0.33;
        switch(userSelection){
            case 1: 
                lion();
                keepVisiting(); 
                break; 
            case 2: 
                giraffe();
                keepVisiting();
                break; 
            case 3:
                elephant();
                keepVisiting();
                break; 
            default: 
                System.out.println("Please enter 1, 2, or 3."); 
        }  //close switch 
    } while(loop == 0); //close main
    }
    public static void lion() {
        animals lion; 
        lion = new animals(); 
        lion.name = "Fluffy"; 
        lion.age = 13; 
        lion.sex = "Male"; 
        lion.weight = 400; 
        System.out.println("This is " + lion.name + " He is " + lion.age + " years old" );
        System.out.println("He weighs " + lion.weight + " pounds"); 
    }//close method
    public static void giraffe() {
        animals giraffe; 
        giraffe = new animals(); 
        giraffe.name = "Lucy"; 
        giraffe.age = 18; 
        giraffe.sex = "Female"; 
        giraffe.weight = 1600;
        System.out.println("This is " + giraffe.name + " She is " + giraffe.age + " years old " ); 
        System.out.println("She weighs " + giraffe.weight + " pounds"); 
        
    }//close method
    public static void elephant() { 
        animals elephant; 
        elephant = new animals(); 
        elephant.name = "Dumbo"; 
        elephant.age = 34; 
        elephant.sex = "Male"; 
        elephant.weight = 12000;
        System.out.println("This is " + elephant.name + " He is " + elephant.age + " years old"); 
        System.out.println("He weighs " + elephant. weight + " pounds");
    }// close method 
    private static void printDivider() {
        System.out.println("---------------------------"); 
    }// close method 
    public static void keepVisiting() {
        System.out.println("Keep visiting?"); 
        Scanner scanner = new Scanner(System.in); 
        String userInput = scanner.next(); 
        if(userInput.equals("No")) {
            loop = 5; 
        }// close if 
    }// close keepvisiting
}// close class 
/** 
 * Disclaimer: I did not originally have this project in mind I wanted to try to learn
 * about Encryption and decryption but was confused on the Cipher and other 
 * classes and imports that i believe go with it as well. Hope you enjoyed the Visit at the Zoo! 
 */
