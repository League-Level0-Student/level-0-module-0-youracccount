package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero.
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER

		// 2. Ask the user a question
		String input = JOptionPane.showInputDialog("What's 9+10?");
		// 3. Use an if statement to check if their answer is correct
		if (input.equals("19")) {
			System.out.println("Correct");
			score = score+1;
		}
		else {
			System.out.println("You put 21 didn't u");
			score = score-1;
		}
		String cab = JOptionPane.showInputDialog("Is 1 a prime number");
		if (cab.equals("no")) {
			System.out.println("Correct");
			score = score+1;
		}
		else {
			System.out.println("1 is unity");
			score = score-1;
		}
		
		
		
		System.out.println("final score");
		System.out.println(score);
		// 4. if the user's answer was correct, add one to their score

		// MAKE MORE QUESTIONS. Ask more questions by repeating the above
		// Option: Subtract a point from their score for a wrong answer

		// After all the questions have been asked, tell the user their final score

	}
}
