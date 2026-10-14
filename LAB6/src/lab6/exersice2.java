/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author khale
 */
import java.util.Scanner;
public class exersice2 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    System.out.print("Enter a username");
    String username = input.nextLine();
    
    if(username.length()<10){
        System.out.print("Invalid username");
        return;
    }
        int digitCount = 0;
        for(int i=0;i<username.length();i++){
            char ch=username.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                System.out.print("Invalid username");
                return;
            }
            if(Character.isDigit(ch)){
                digitCount++;
            }
        }
        if(digitCount<2){
            System.out.print("Invalid username");
        }
        else{
            System.out.print("Valid username");
                    }
        }
        
    }
        
        
    

