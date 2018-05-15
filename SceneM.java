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
public class SceneM {
    public static void main(String[] args) {
        Creature monkey; 
        monkey = new Creature(); 
        
        monkey.name = "Bob"; 
        monkey.species = "Gorilla"; 
        monkey.setBiteSizeInPercent(27); 
        
        SizedDonut donutForMonkey = new SizedDonut(); 
        donutForMonkey.name = "Gina";
        donutForMonkey.type = "Glazed";
        donutForMonkey.id = 120; 
        
        monkey.eatDonut(donutForMonkey); 
        
        System.out.println("Donut left for Bob: " + donutForMonkey.getPercRemaining());
    }
}
