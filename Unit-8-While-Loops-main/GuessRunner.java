//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class GuessRunner
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        char response;

        do
        {
            GuessingGame game = new GuessingGame(0);
            game.playGame();

            out.print("\nDo you want to play again? (y/n): ");
            response = keyboard.next().trim().toLowerCase().charAt(0);
        }
        while(response == 'y');

        keyboard.close();
    }
}