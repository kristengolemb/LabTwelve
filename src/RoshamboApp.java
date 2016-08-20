import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String response;
		Player computerPlayer;
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println("What is your name?");

		Player humanPlayer;
		Player user = new HumanPlayer();
		user.setName(scan.nextLine());

		System.out.println("What team do you want to play? Enter 'rocket' or 'wildcats'");
		String opponent = scan.nextLine();

		while (!Validator.isValidOpponent(opponent)) {
			System.out.println("What team do you want to play? Enter 'rocket' or 'wildcats'");

		}

		Player opponentPlayer = Validator.getPlayer(opponent);
		do {
			System.out.println("Rock, paper or scissors? (Enter ROCK/PAPER/SCISSORS)");
			String playerChoice = scan.nextLine();
			playerChoice.toUpperCase();

			Roshambo userChoice = Roshambo.valueOf(playerChoice);

			user.setRoshambo(userChoice);

			System.out.println(user.getName() + ", you entered " + userChoice);

			didUserWin(user, opponentPlayer);

			System.out.println("Do you want to play again? Enter yes/no");
			response = scan.nextLine();
		} while (response.equals("yes"));
		System.out.println("Thanks for playing!");
	}

	public static void didUserWin(Player humanPlayer, Player computerPlayer) {

		String lose = "You lose!";
		String win = "You win!";

		Roshambo computerInput = computerPlayer.generateRoshambo();

		System.out.println("Your opponent chose " + computerInput);

		if (humanPlayer.getRoshambo() == computerInput) {
			System.out.println("It's a draw!");
			return;
		}

		switch (humanPlayer.getRoshambo()) {

		case ROCK:
			if (computerInput == Roshambo.SCISSORS) {
				System.out.println(win);
				break;
			} else {
				System.out.println(lose);
				break;
			}

		case PAPER:
			if (computerInput == Roshambo.ROCK) {
				System.out.println(win);
				break;
			} else {
				System.out.println(lose);
				break;
			}

		case SCISSORS:
			if (computerInput == Roshambo.PAPER) {
				System.out.println(win);
				break;
			} else {
				System.out.println(lose);
				break;
			}
		}
		return;
	}

}
