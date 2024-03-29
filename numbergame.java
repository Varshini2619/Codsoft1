package NumberGuessingGame;
import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100) + 1;

        int tryCount = 0;
        final int maxAttempts = 5;

        while(tryCount < maxAttempts){
        System.out.println("Enter your guess (1-100):");

        int playerGuess = scanner.nextInt();
        tryCount++;

        if (playerGuess == randomNumber) {
            System.out.println("Correct! you win!");
            System.out.println("It took you " + tryCount + "tries");
            break;
        }
        else if (randomNumber > playerGuess) {
            System.out.println("Nope! The number is higher. Guess again.");
        }
        else {
            System.out.println("Nope! The number is lower. Guess again.");
        }
        }

        if (tryCount > maxAttempts) {
            System.out.println("Sorry, you have reached the maximum no. of attempts");
            System.out.println("You lost the Game!!");
            System.out.println("Try again");
        }

        int point = maxAttempts - tryCount;
        System.out.println("Your point is " + point);

        scanner.close();
        }
    }