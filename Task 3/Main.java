import java.util.Random;
import java.util.Scanner;  


 class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
 // Create a Scanner object
    Scanner scanner = new Scanner(System.in);

    // Read user input
    System.out.print("Enter your guess: ");

    // use hasNextDouble to check if input is numeric,
    if (scanner.hasNextInt()) {
        // if so...
        int guess = scanner.nextInt();
        // Compare it with the random number
        if (guess == rnd_number) {
            // Let the user know the result of the comparison
            System.out.println("Congratulations! You guessed the number!");
            return;
        } else if (guess < rnd_number) {
            // Help the user by revealing whether the guess was lower or higher than the target number
            System.out.println("Your guess is too low.");
        } else {
            System.out.println("Your guess is too high.");
        }
        // Let the user try again by calling this method recursively
        makeAGuess();
    } else {
        // if input was not numeric show an error message and call this method recursively
        System.out.println("Invalid input. Please enter a numeric value.");
        makeAGuess();
    }
    }
   

}