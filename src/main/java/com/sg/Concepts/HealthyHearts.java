package com.sg.Concepts;
import java.util.Scanner;
public class HealthyHearts {

        public static void main (String[]args){
        Scanner sr = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sr.nextInt();
        int hr = 220 - age; // Subtract the value 220 from the users input.
        System.out.println("Your maximum heart rate should be " + hr + " beats per minute");
        // The hr calculated above is multiplied by the percetnage values in decimal form.
        System.out.println("Your target HR Zone is " + (hr * 0.5) + " - " + (hr * 0.85) + " beats per minute");
    }
}

