/*
 * A simple program that will ask a math question and need an answer from the user 
 * to find out if they can get the right answer. 
 */
package week5;

import java.util.Scanner; 
//import scanner to recieve user input 
/**
 *
 * @author kadenmahsoob
 */
public class QuizPractice {
    public static void main(String args[]) {
      int userAnswer; 
      int correctAnswer = 12;
      int attempts = 0;  
      final int attemptsAllowed = 3; 
      System.out.println("*****Let's check your math skills!*****"); 
      
      Scanner userInputScanner = new Scanner(System.in); 
      
      while(attempts < 3){
          
              System.out.println("What is (14/2)+5 ?");
              
              userAnswer = userInputScanner.nextInt(); 
              
              if(userAnswer == correctAnswer) { 
                  System.out.println("Great job! You got it correct in only " + (attempts) + " attempts"); 
                 break; 
              }//close first if statement
              //
              else if(userAnswer != correctAnswer) {
                  System.out.println("That is not the correct answer, but don't give up"); 
              } // close else in while loop
              
                 
              attempts = attempts + 1;
          } //close while 
      //user reaches 3 attempts system prints line
      if(attempts == attemptsAllowed){ 
           System.out.println("Better luck next time! The answer is 12"); 
        } //close second if statement 
    }// close main method       
}//close Quiz class 
