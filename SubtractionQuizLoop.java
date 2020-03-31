import java.util.*;
public class SubtractionQuizLoop {
	 public static void main(String[] args) {
			final int NUMBER_OF_QUESTIONS = 5; // Number of questions
			int correctCount = 0; // Count the number of correct answers
			// int count = 0; // comment out initial declaration from while loop to integrate  into for loop
			
			long startTime = System.currentTimeMillis();
			String output = ""; // output string is initially empty
			Scanner input = new Scanner(System.in);
		    
			// while (count < NUMBER_OF_QUESTIONS) { // comment out while loop
			for (int count = 0; count < NUMBER_OF_QUESTIONS; count++) { // convert while loop to for loop using count varaible
				// 1. Generate two random single-digit integers
				int number1 = (int)(Math.random() * 10);
				int number2 = (int)(Math.random() * 10);
		    
				// 2. If number1 < number2, swap number1 with number2
				if (number1 < number2) {
					int temp = number1;
					number1 = number2;
					number2 = temp;
				}

				// 3. Prompt the student to answer "What is number1 – number2?"
				System.out.print("What is " + number1 + " - " + number2 + "? ");
				int answer = input.nextInt();

				// 4. Grade the answer and display the result
				if (number1 - number2 == answer) {
					System.out.println("You are correct!\n");
					correctCount++;
				}
				else
					System.out.println("Your answer is wrong.\n" + number1 
							+ " - " + number2 + " should be " + (number1 - number2) + "\n");

				// Increase the count
				//count++; // remove increas count from while loop because it was integrated into for loop

				output += "\n" + number1 + "-" + number2 + "=" + answer + 
						((number1 - number2 == answer) ? " correct" : " wrong");
			}

			long endTime = System.currentTimeMillis();
			long testTime = endTime - startTime;

			System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
		  }
		}

