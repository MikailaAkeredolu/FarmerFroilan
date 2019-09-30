package animals;

import interfaces.AirCraft;
import interfaces.Edible;
import interfaces.Rideable;

public class Dragon extends MysticalAnimal implements Rideable, AirCraft {

	public Dragon(String name) {
		super(name);
	}

	@Override
	public void usePower() {
		System.out.println("Breathes fire upon the neighboring lands (to cull the competition)");
	}

	public void eat(Animal animal) {
		System.out.println("mmmmmmmm this " + animal.getClass().getSimpleName() + " is delicious!");
	}

	@Override
	public void eat(Edible edible){
		throw new IllegalArgumentException("Dragons prefer animals!");
	}

	@Override
	public void makeNoise() {
		System.out.println("Fear me! or be set ablaze!");
	}

	@Override
	public void fly() {
		System.out.println("Screw this walking sh*t, Let's fly");
	}
}
