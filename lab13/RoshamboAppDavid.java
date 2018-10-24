package lab13;

import java.util.Scanner;

public class RoshamboAppDavid {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		
		
		Player one = new Dwayne();
		Player two = new Jack();
		
		System.out.println(Roshambo.ROCK.beats(Roshambo.SCISSORS));
		
		Roshambo oneChoice = one.generateRoshambo();
		Roshambo twoChoice = two.generateRoshambo();
		
		System.out.println(one.getName() + " plays" + oneChoice);
		System.out.println(two.getName() + " plays" + twoChoice);
		
		if (oneChoice.beats(twoChoice)) {
			System.out.println(one.getName() + " wins.");
		} else if (oneChoice.ties(twoChoice)) {
			System.out.println("It's a tie.");
		} else {
			System.out.println(two.getName() + " wins.");
		}
		
	}

}
