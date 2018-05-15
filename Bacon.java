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
public class Bacon {
    private double percRemaining = 100; 
    private double sugar = 12;
    private double fat = 23; 
    private double calories = 90; 
    
    public void eatBacon(double percEaten) {
        sugar = sugar * percEaten; 
        fat = fat * percEaten; 
        calories = calories * percEaten; 
        percRemaining = percRemaining - (percEaten * 10); 
       
    }
    public double getPercRemaining() {
        return percRemaining; 
    }
    public double displaySugar() {
        return sugar; 
    }
    public double displayFat() {
        return fat; 
    }
    public double displayCalories() {
        return calories; 
    }
    public void baconReset() {
        sugar = 12; 
        fat = 23; 
        calories = 90; 
    }
}
