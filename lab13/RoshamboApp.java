package lab13;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String name = null;
		String opponent2 = null;
		String rpc = null;
		
		System.out.println("Welcome to Rock, Paper, Scissors App!");
 		System.out.print("Please enter your name: ");
 		
 		String userName = scnr.nextLine();
		UserPlayer player = new UserPlayer(name);
		
 		System.out.print("Would you like to play against Mike or Some Idiot? (m/s)");
 		String opponent = scnr.nextLine();
	
		
		if (opponent.equalsIgnoreCase("m")){
 			opponent2 = new Mike("Mike");
 		} else if (opponent.equalsIgnoreCase("s")){
 			opponent2 = new SomeIdiot("Some Idiot");
 		}
		
		String rpc2 = opponent2.generateRoshambo();
 		boolean cont = true;
 		while(cont){
 			System.out.println("Rock, paper or scissors? (R/P/S): ");
 			String answer = scnr.nextLine().toLowerCase();
			switch (answer) {
 			case "r":
 				rpc = (String) player.setValue(Roshambo.ROCK);
 				break;
 			case "p":
 				rpc = (String) player.setValue(Roshambo.PAPER);
 				break;
 			case "s":
 				rpc = (String) player.setValue(Roshambo.SCISSORS);
 				break;
 			default:
 				break;
 			
 		}
 		System.out.print("Would you like to play again?(yes/no)");
 		String userContinue = scnr.nextLine();
 		if (userContinue.equalsIgnoreCase("no"))
 			cont = false;
 		}
		
	}

}
