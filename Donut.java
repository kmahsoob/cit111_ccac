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
public class Donut {
    
    private double percRemaining = 100; 
    public String name; 
    private double sugar = 25; 
    private double fat = 15; 
    private double calories = 235; 
    
    //nutrition information based on bitesize's 
    public void simulateEating(double percentEaten){
        percRemaining = percRemaining - (percentEaten * 10); 
        sugar = sugar * percentEaten; 
        fat = fat * percentEaten; 
        calories = calories * percentEaten;  
    }// close method 
    public double getPercRemaining() { 
        return percRemaining; 
    }// close method 
    public double displaySugar() {
        return sugar; 
    }// close method 
    public double displayFat() {
        return fat; 
    }// close method 
    public double displayCalories() {
        return calories; 
    }// close method 
    public void donutReset() {
        sugar = 25; 
        fat = 15; 
        calories = 235; 
    }
}

