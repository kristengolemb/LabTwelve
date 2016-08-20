import java.util.Random;

public class RandomPlayer extends Player {
		
	public Roshambo generateRoshambo() {
		Random random = new Random();
		int abc = random.nextInt(2) + 1;
		switch(abc){
		case 1: setRoshambo(Roshambo.ROCK);
			break;
		case 2:setRoshambo(Roshambo.PAPER);
			break;
		case 3:setRoshambo(Roshambo.SCISSORS);
			break;
		}
		return getRoshambo();
	}

	}