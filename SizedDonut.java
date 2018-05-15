/*
 * Creates the variables for the Donut Size 
 */
package objects2_creatures;

/**
 *
 * @author kadenmahsoob
 */
public class SizedDonut {
    public String name; 
    public int sizeInmm; 
    public int id; 
    public String type;
    public int percRem; 
    
    private int percRemaining = 100; 
    
    public void simulateEating(int percentEaten) {
        percRemaining = percRemaining - percentEaten; 
    }//close method 
    public int getPercRemaining() {
        return percRemaining; 
    }//close method 
}
