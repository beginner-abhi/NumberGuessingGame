package oASISINFO;
import java.util.Scanner;
public class NumberGuessingGame {
	
		public static void
		guessNumberGame()
		{
			try (// Scanner Class
			Scanner sc = new Scanner (System.in)) {
				// Generate the numbers
				int number =  (int)(100* Math.random())+1;

				// Given K trials
				int K = 5;

				int i, guess=0;
				
				int score =100;
				

				System.out.println("A number is chosen"+ " between 1 to 100."
					+ "Guess the number"+ " within 5 trials.");

				// Iterate over K Trials
				for (i = 0; i < K; i++) {

					System.out.println("Guess the number:");

					// Take input for guessing
					guess = sc.nextInt();

					// If the number is guessed
					if (number == guess) {
						System.out.println("Great Work!"+ " You guessed the number.");
						break;
					}
					else if (number > guess && i != K - 1) {
						System.out.println("The number is "+ "higher than " + guess);
					}
					else if (number < guess&& i != K - 1) {
						System.out.println("The number is"+ " lower than " + guess);
					}
				}

				if (i == K) {
					System.out.println("Your K trials are finished.");

					System.out.println("The number was " + number+".");
				}
				score = 100 - guess / 5;
					
					System.out.println("Your score = "+score);
              sc.close();
			}
		
		}

		// Driver Code
		public static void main(String arg[])
		{

			// Function Call
			guessNumberGame();
		}
	}


