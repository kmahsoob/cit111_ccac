/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects2_creatures;

/**
 *
 * @author kadenmahsoob
 */
public class SceneB {
    public static void main(String[] args) {
        Creature bear; 
        bear = new Creature(); 
        
        bear.name = "Smokey Bear"; 
        bear.species = "Brown Bear"; 
        
        SizedDonut d = new SizedDonut(); 
        d.id = 300; 
        d.type = "boston creme"; 
        
        printSizedDonutStats(d); 
        
        System.out.println("Eating donut now....."); 
        
        bear.setBiteSizeInPercent(58); 
        
        bear.eatDonut(d); 
        printSizedDonutStats(d); 
        
    }// close main 
    public static void printSizedDonutStats(SizedDonut donutToPrint) {
        System.out.println("***Donut Stats***"); 
        System.out.println("Flavor: " + donutToPrint.type); 
        System.out.println("ID: " + donutToPrint.id); 
        System.out.println("PercRemaining: " + donutToPrint.getPercRemaining()); 
    }
}

