import java.util.Scanner;
public class AdditionGame {
	public static void main(String[] args) {
       System.out.print("Hello Blessing!");
		// This is my development 1412 branch.
		
		// Outline for addition problem.
		// Initialize game variables
       int score = 0; // make a variable score that is an integer and starts at 0;
		int hardness = 10; // make a variable hardness that is an integer and starts at 10;
		
		// Round 1
		//	Generate 2 random numbers
		int number1 = (int)(Math.random() * hardness);
		int number2 = (int)(Math.random() * hardness);
		int correctAnswer = number1 + number2;
		
		//  Ask the user to add these two numbers together
		System.out.println("What integer is " + number1 + " + " + number2 + "?");
		System.out.println("Please enter integers only.");
		//  Read in their response
		Scanner input = new Scanner(System.in);
		int studentAnswer = input.nextInt();
		//  Check if the answer was correct
		if(studentAnswer == correctAnswer){
			//		IF correct
			//			Tell them it was correct
			System.out.println("Your answer was correct.");
			//			Give them points
			score += hardness;
			System.out.println("Your score is now: " + score);
			//			Make the next question harder
			hardness *= 10;
			System.out.println("The next hardness will be: " + hardness);
		}else{
			//		IF not correct
			//			Tell them it was wrong
			System.out.println("Your answer was not correct.");
			// 			Tell them the correct answer
			System.out.println("The correct answer was: " + correctAnswer);
			//			Do not give them points
			score += 0;
			//			Make the next question easier
			if (hardness > 10){
				hardness /= 10;
				System.out.println("Your hardness is now: " + hardness);
			}else{
				System.out.println("Your hardness is at the lowest level");
				System.out.println("Your hardness is now: " + hardness);
			}
			
			
		}

		System.out.println("End of round 1.");
		


	}

}
