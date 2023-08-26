package Arrays;

import java.util.Scanner;
import java.util.Random;
public class Guess {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    Random rand = new Random();
    int high = 1000;
    
    boolean keepGoing = true;
    while(keepGoing) {
      int secretNum = rand.nextInt(high);
      int guesses = 1;
      System.out.println("I'm thinking of a number between 0 and " + high);
      System.out.print("Enter your guess: ");
      int guess = console.nextInt();

      while(guess != secretNum) {
        if (guess > secretNum) {
          System.out.print("Too high. Enter another number: ");
        } else {
          System.out.print("Too low. Enter another number: ");
        }
        guess = console.nextInt();
        guesses++;
      }

      System.out.println("Correct! Took you " + guesses + " guesses.");
      System.out.println("Go again? (enter 'Y'): ");
      String yorn = console.next();
      if (yorn.equalsIgnoreCase("Y")) {
        keepGoing = true;
      } else {
        keepGoing = false;
      }
    }

    System.out.println("Goodbye!");
  }
}
