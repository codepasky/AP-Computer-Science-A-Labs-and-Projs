//(c) A+ Computer Science
// www.apluscompsci.com
//Name - paschal

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
    private int upperBound;
    private int target;
    private int guessesTaken;
    private int percent;

    public GuessingGame(int stop)
    {
        upperBound = stop;
    }

    public void playGame()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Guessing game - how many numbers? ");
        upperBound = keyboard.nextInt();

        // protect against bad upperBound
        if (upperBound < 1) {
            System.out.println("Upper bound must be at least 1. Try again:");
			
			System.out.print("Guessing game - how many numbers? ");
			upperBound = keyboard.nextInt();
        }

        target = (int)(Math.random() * upperBound) + 1;
        guessesTaken = 0;
        int guess = -1;

        while (guess != target)
        {
            System.out.print("Enter a number between 1 and " + upperBound + ": ");
            guess = keyboard.nextInt();

            // check range first; out of range guesses are NOT counted
            if (guess > upperBound || guess <= 0) {
                System.out.println("Number out of range!");
                continue; // go back to prompt
            }
            guessesTaken++;
        }

        percent = (guessesTaken - 1) * 100 / upperBound;

        System.out.println("\n" + "It took " + guessesTaken + " guesses to guess " + target + ".");
        System.out.println(this.toString());
    }

    public String toString()
    {
        return "You guessed wrong " + percent + " percent of the time.";
    }
}