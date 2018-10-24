package lab13;

import java.util.Random;

public class Jack extends Player {

	public Jack() {
		super("Jack");
	}
	
	public Jack(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {

		int num = (int) ((Math.random() * 3));
		
		return Roshambo.values()[num];	   
	}
}
