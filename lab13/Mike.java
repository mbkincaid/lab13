package lab13;

import java.util.Random;

public class Mike extends Player {
	
	public Mike () {}

	public Mike(String name, int roshambo) {
		super();
	}

	public Mike(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {

		int rpc = (int) ((Math.random() * 3) + 1);
		if(rpc == 1) return Roshambo.ROCK;
	    else if(rpc == 2) return Roshambo.PAPER;
	    else return Roshambo.SCISSORS;
		   
	}


}
