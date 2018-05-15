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
public class CreatureLand {
    public static void main(String [] args){
        
        Creature dog; 
        dog = new Creature(); 
        //writing member variables value 
        dog.name = "Coal"; 
        dog.species = "Black Lab"; 
        dog.setSizeLimit(30); 
        dog.setBiteSizeInPercent(10); 
        
        SizedDonut donutForDog = new SizedDonut(); 
        donutForDog.name = "Chocolate";
        donutForDog.sizeInmm = 25; 
        
        dog.eatDonut(donutForDog); 
        
        System.out.println("Donut left: " + donutForDog.getPercRemaining()); 
        System.out.println("***Creature Stats***"); 
        System.out.println("Creature Name: " + dog.name); 
        System.out.println("Species: " + dog.species); 
        
    }
}
