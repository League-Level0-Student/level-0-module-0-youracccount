package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main(String[] args) {
		
	
	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
		int randomNum;
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
		randomNum = ran.nextInt(4); //0-3
		// 3. Print your variable to the console
		System.out.println(randomNum);
		// 4. Get the user to enter something that they think is awesome
		String input = JOptionPane.showInputDialog("What do u think is cool");
		// 5. If your variable is  0
		if(randomNum == 0) {
			System.out.println("I agree");
		}
			// -- tell the user whatever they entered is awesome!
		
		// 6. If your variable is  1
		if(randomNum == 1) {
			System.out.println("It is meh.");
		}
			// -- tell the user whatever they entered is ok.
		
		// 7. If your variable is  2
		if(randomNum == 2) {
			System.out.println("really that is boring");
		}
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
		if(randomNum == 3) {
			System.out.println("ok ;)");
		}
			// -- invent your own message to give to the user (be nice).
	}
}
