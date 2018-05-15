/*
 * This will convert different types of measurement into the 
 * desired type of measurement for the user. 
 */
package week8;
import java.util.Scanner; 
/**
 *
 * @author kadenmahsoob
 */
public class UnitConverter {
    public static void main(String[] args) {
        System.out.println("Enter a number of your choice to convert from" 
                + "\n temperature, speed and weight");
        Scanner scan = new Scanner(System.in); 
        // access scanner 
        int choice = scan.nextInt(); 
        Temperature(choice); 
        System.out.println(); 
    }// close main 
    public static void Temperature(double celcius) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the number of degree to convert from celcius" 
                + " to fahrenheit" ); 
        double userCelcius = scan.nextDouble(); 
        double fahrenheit = (userCelcius- 32) * 0.56; 
        System.out.println(userCelcius + " degree celcius is eqaul to" 
            + fahrenheit + "fahrenheit" ); 
        SpeedConversionMeter(0.0); 
    }// close Temp Method 
    public static void SpeedConversionMeter(double meter){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the number of Kilometers you travel" 
                    + "today so I can convert it into meters for you"); 
        double userKilometer = scan.nextInt(); 
        meter = userKilometer/0.001; 
        System.out.println(userKilometer + "Kilometer makes" 
                + meter + "meters"); 
    }// close SpeedConversionMeter Method 
    public static void weightConversionToKilogram(double pound) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter a weight, and I will convert it to" + " kilogram "); 
        double userPound = scan.nextDouble(); 
        double Kilogram = userPound/2.21; 
        System.out.println(userPound + "pound eqaul to " + Kilogram + "kilogram"); 
    }// close weight method 
}// close class 
