package lab13;

public class SomeIdiot extends Player {
	
	public SomeIdiot () {}

	public SomeIdiot(String name, int roshambo) {
		super();
		
	}
	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
