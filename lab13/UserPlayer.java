package lab13;

import java.util.Scanner;

public class UserPlayer extends Player {
	
	Scanner scnr = new Scanner(System.in);

	public UserPlayer(String name) {
		super(name);
		
	}

	@Override
	public Roshambo generateRoshambo() {
		String userChoice = scnr.nextLine();
		if (userChoice.equalsIgnoreCase("Rock")) {
			return Roshambo.ROCK;
		}
		if (userChoice.equalsIgnoreCase("Paper")) {
			return Roshambo.PAPER;
		}
		else {
			return Roshambo.SCISSORS;
		}
	}

	public Object setValue(Roshambo rock) {
		// TODO Auto-generated method stub
		return null;
	}
}
