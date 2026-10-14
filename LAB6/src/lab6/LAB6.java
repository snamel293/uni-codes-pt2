/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

/**
 *
 * @author khale
 */

    import java.util.Scanner;

public class LAB6 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        double sum = 0;
        int count = 0;
        double temperature = input.nextDouble();
        
        do {
            
            
            temperature++;
            while (temperature>=0){
            sum += temperature;
            count++;
            
            System.out.print("Enter a temperature : ");
        temperature = input.nextDouble();
        } 
        
    }
        while (false);

double average = sum / count;
System.out.println("Average temperature: " + average);
            
            
        
            
        
        
        
        
    }
    
}
    
    


