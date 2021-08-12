
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author connorskiro
 */


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome! I am the birthday wizard!");
        
        System.out.println("I can tell when your birthday has occurred or will occur...");
        
        int currentYear, birthYear, currentAge, desiredAge, date;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("First, tell me what year it is..");
        
        currentYear = keyboard.nextInt();
        
        System.out.println("Great! Now what year were you born?");
        
        birthYear = keyboard.nextInt();
        
        currentAge = currentYear - birthYear;
        
        System.out.println("Whoa! You are " + currentAge + " years old!");
        
        System.out.println("Now, select an age and I'll let you know what year it'll be!");
        
        desiredAge = keyboard.nextInt();
        
        
        
        if (desiredAge <= currentAge) {
            // If I want to know when I was 18 years old, then subtract currentAge by desiredAge 
            // Then subtract currentYear
            date = currentYear - (currentAge - desiredAge);
            System.out.println("You were " + desiredAge + " years old in " + date);
        } else {
            // If I want to know when I'm 60 years old, then add birthYear and desiredAge
            date = desiredAge + birthYear;
            System.out.println("You'll be " + desiredAge + " years old in " + date);
        }
       
    }
    
}
