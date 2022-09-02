package com.company;   // AISLING GONZALEZ CS1400.03
import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Pick a number in your head between 1 and 100.");
        // ask user to pick number
        System.out.println();
        int low = 30; int high = 50;
        Random g = new Random();
        int guess;
        int i = 1;
        guess = g.nextInt(high-low+i)+low;
        // a number for the program to go off from
        System.out.println("Is " + guess + " the correct number?");
        //guess would be random num
        System.out.println("Respond with 0 if the guess is correct");
        System.out.println("Respond with -1 if the guess is too high");
        System.out.println("Respond with 1 if guess is too low\n");
        int input = keyboard.nextInt();
        while (input >= 2)
        // to make sure that the user input is valid
        {
            System.out.println("Invalid entry");
            System.out.println("Respond with 0 if the guess is correct");
            System.out.println("Respond with -1 if the guess is too high");
            System.out.println("Respond with 1 if guess is too low");
            input =keyboard.nextInt();
            // the user inputs 0, 1, or -1
        }
        if (input ==1 || input <0)
        // either too high or too low
        {
            do
            {
                if (input == 1)
                // guess is too low
                {
                    low = guess + i;
                    guess = g.nextInt(high - low + i) + low;
                    System.out.println("Is " + guess + " the correct number?");
                    System.out.println("Respond with 0 if the guess is correct");
                    System.out.println("Respond with -1 if the guess is too high");
                    System.out.println("Respond with 1 if guess is too low");
                    input = keyboard.nextInt();
                    if (guess ==low && guess == high)
                    {
                        System.out.print("you either made a mistake or LIED, ");
                        // for when a mistake occurs
                        System.out.println("game over.");
                        System.exit(0);
                    }
                }
                else if (input < 0 )
                // guess is too high
                {
                    high = guess - i;
                    guess = g.nextInt(high - low + i) + low;
                    System.out.println("Is " + guess + " the correct number?");
                    System.out.println("Respond with 0 if the guess is correct");
                    System.out.println("Respond with -1 if the guess is too high");
                    System.out.println("Respond with 1 if guess is too low");
                    input = keyboard.nextInt();
                    if (guess ==low && guess == high)
                    {
                        System.out.print("you either made a mistake or LIED, ");
                        // for when a mistake occurs
                        System.out.println("game over.");
                        System.exit(0);
                    }
                }
                else if (input == 0)
                // computer guesses the number
                {
                    System.out.println(" I found the answer, it's "+guess);
                    System.exit(0);
                }
                else
                {
                    System.out.print("you either made a mistake or LIED, ");
                    // for when a mistake occurs
                    System.out.println("game over.");
                    System.exit(0);
                }
            } while (low != high);
        }
        if (input == 0)
        // if the num (the guess) was correct on first try
        {
            System.out.println("psh that was easy");
            System.exit(0);
            // end it here
        }
        System.out.print("you either made a mistake or LIED, ");
        // for when a mistake occurs
        System.out.println("game over.");
        System.exit(0);
    }
}
