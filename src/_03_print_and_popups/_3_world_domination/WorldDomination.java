package _03_print_and_popups._3_world_domination;

import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) {

		// 1. Ask the user if they know how to write code.
		String input = JOptionPane.showInputDialog("Do u know how 2 code?");
		// 2. If they say "yes", tell them they will rule the world.
		if (input.equals("yes")) {
			System.out.println("that means will rule the vurtual world");
		}
		// 3. Otherwise, tell them to sign up for classes at The League.
		else {
			System.out.println("Get classes at The League which is the sponsor of this text");
		}
	}
}
