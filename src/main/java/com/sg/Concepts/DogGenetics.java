package com.sg.Concepts;
import java.util.Scanner;
import java.util.Random;
public class DogGenetics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your dog's name?");

        String name = sc.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");

        System.out.println("\n\nSir " + name + " is\n\n");
// Apply variables to the dog breeds.
        Random ran = new Random();
        int sum = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        while (sum != 100) {  // Returns the sum of the arguments. ex) adding two integers
            a = ran.nextInt(100);

            b = ran.nextInt(100 - a);

            c = ran.nextInt(100 - b);

            d = ran.nextInt(100 - c);

            e = ran.nextInt(100 - d);
            sum = a + b + c + d + e;
        }
// Subtracted value 100 from a random value and applies it to the String.
        System.out.println(a + "% St. Bernard");
        System.out.println(b + "% Chihuahua");
        System.out.println(c + "% Dramatic RedNosed Asian Pug");
        System.out.println(d + "% Common Cur");
        System.out.println(e + "% King Doberman");

        System.out.println("\n\nWow, that's QUITE the dog!");
    }
}
