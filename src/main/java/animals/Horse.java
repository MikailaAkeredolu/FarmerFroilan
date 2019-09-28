package animals;

import interfaces.Edible;
import interfaces.Rideable;

public class Horse extends Animal implements Rideable {
	@Override
	public void eat(Edible food) {
		super.eat(food);
	}

	@Override
	public void makeNoise() {
		System.out.println("Down with the establishment!.... i mean uh neigh");
	}
}
