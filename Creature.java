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
public class Creature {
    public String name; 
    public String species; 
    
    private int biteSizeInPercent; 
    private int numBitesTaken; 
    private int sizeLimit; 
    
    public int eatDonut(SizedDonut donutToEat) {
        donutToEat.simulateEating(biteSizeInPercent); 
        numBitesTaken = numBitesTaken + 1; 
        return numBitesTaken; 
        
    }// close method 
    public int getSizeLimit() {
        return sizeLimit; 
    }// close method 
    public void setSizeLimit(int sizeLimit) {
        this.sizeLimit = sizeLimit; 
    }// close method 
    // get and set for SizeLimit 
    public int getNumBitesTaken() {
        return biteSizeInPercent; 
    }// close method 
    public void setBiteSizeInPercent(int BiteSizeInPercent) {
        this.biteSizeInPercent = BiteSizeInPercent; 
    }// close method 
    // get for NumBitesTaken & set for BiteSizeInPercent 
    
}// close class 

