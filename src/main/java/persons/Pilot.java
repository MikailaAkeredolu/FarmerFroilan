package persons;

import interfaces.Edible;
import interfaces.Rideable;

public class Pilot extends Person {

	public Pilot(String name) {
		super(name);
	}

	@Override
	public void eat(Edible edible) {

	}

	@Override
	public void makeNoise() {
		System.out.println("Weeeee, im high af (in the sky)");
	}

	@Override
	public void mount(Rideable ride) {

	}

	@Override
	public void dismount(Rideable ride) {

	}

	@Override
	public void ride(Rideable ride) {

	}
}
