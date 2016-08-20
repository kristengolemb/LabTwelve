
import java.util.Scanner;

public class Validator {
//makes sure the player that the user selected is valid, if not it loops around.
	public static Player getPlayer(String validation){
	
		//	validation = scan.nextLine();
			if (validation.equalsIgnoreCase("Rocket")) {
				Player opponent = new RockPlayer();
				return opponent;
			} else if (validation.equalsIgnoreCase("Wildcats")) {
				Player opponent = new RandomPlayer();
				return opponent;
			}
//			System.out.println("Please enter either 'Rocket' or 'Wildcats'");

		return null;

	}
	
	public static boolean isValidOpponent (String opponent) {
		if (opponent.equalsIgnoreCase("Rocket")) {
			
			return true;
		} else if (opponent.equalsIgnoreCase("Wildcats")) {
			
			return true;
		}
			return false;
	}
	//makes sure that the user enters yes or no
	public static boolean isChoiceValid(Scanner scan) {
		String check = "";
		do {
			check = scan.nextLine();
			if (check.equalsIgnoreCase("yes")) {
				return true;
			} else if (check.equalsIgnoreCase("no")) {
				return false;
			}
			System.out.println("Please enter either 'yes' or 'no'");

		} while (!check.equals("yes") && !check.equals("no"));
		return false;

	}
	
	//makes sure when the user enters rock paper or scissors that the value is valid, otherwise is loops around.
	public static Roshambo isRPSValid(Scanner scan) {
		String check = "";
		do {
			check = scan.nextLine();
			if (check.equalsIgnoreCase("rock")) {
				return Roshambo.ROCK;
			} else if (check.equalsIgnoreCase("paper")) {
				return Roshambo.PAPER;
			} else if (check.equalsIgnoreCase("scissors")) {
				return Roshambo.SCISSORS;
			}
			System.out.println("Invalid entry, Please type 'rock', 'paper', or 'scissors'");

		} while (!check.equalsIgnoreCase("paper") && !check.equalsIgnoreCase("rock")
				&& !check.equalsIgnoreCase("scissors"));
		return null;

	}

}
