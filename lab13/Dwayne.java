package lab13;

public class Dwayne extends Player {

	
	public Dwayne() {
		super("Dwayne");
	}
	
	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
