package com.sg.Concepts;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void printChoice() {
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.print("Enter your choice: ");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        while(true) {

            int numRounds;
            System.out.print("Enter number of rounds of game: ");
            numRounds = scan.nextInt();
            if(numRounds<1 || numRounds>10) { // Limits the number of rounds from 1 to 10.
                System.out.println("Invalid input for number of rounds."); // <-- Appears when the number of rounds exceed 10.
                System.exit(-1); // Indicates a successful termination if there is an invalid input of rounds.
            }
            int userChoice, computerChoice;
            int tie=0, userWin=0, computerWin=0;

            for(int i=0; i<numRounds; i++) { // Displays th
                printChoice();
                userChoice = scan.nextInt();
                computerChoice = rand.nextInt(3) + 1;
                // Displays the number of outcome that will indicate if the user or computer wins. Includes line 32-63.
                if(userChoice==computerChoice) {
                    tie++;
                    System.out.println("Tie");
                }
                else if(userChoice==1) {
                    if(computerChoice==2) {
                        computerWin++;
                        System.out.println("Computer Wins");
                    }
                    else if(computerChoice==3) {
                        userWin++;
                        System.out.println("User Wins");
                    }
                }
                else if(userChoice==2) {
                    if(computerChoice==1) {
                        userWin++;
                        System.out.println("User Wins");
                    }
                    else if(computerChoice==3) {
                        computerWin++;
                        System.out.println("Computer Wins");
                    }
                }
                else if(userChoice==3) {
                    if(computerChoice==1) {
                        computerWin++;
                        System.out.println("Computer Wins");
                    }
                    else if(computerChoice==2) {
                        userWin++;
                        System.out.println("User Wins");
                    }
                }
            } // Displays the overall outcome of the user vs computer.
            System.out.println("Ties: " + tie);
            System.out.println("User wins: " + userWin);
            System.out.println("Computer wins: " + computerWin);
            if(userWin > computerWin)
                System.out.println("Overall winner: User");
            else if(computerWin > userWin)
                System.out.println("Overall winner: Computer");
            else
                System.out.println("Overall winner: TIE");
                // Gives the user the option to play again.
            System.out.println("Do you want to play again? y/n ");
            String ans = "";
            ans = scan.next();
            if(ans.equals("y")) // If user chooses yes then the program runs again, if not the program will close.
                continue;
            else
                break;

        }
        scan.close();
    }
}
