package persons;

import interfaces.Edible;
import interfaces.Rideable;
import persons.Person;
import produce.Cupcake;

public class Baker extends Person {
	public Baker(String name){
		super(name);
	}

	public Cupcake bakeCupcake(){
		return new Cupcake();
	}

	@Override
	public void eat(Edible edible) {

	}

	@Override
	public void makeNoise() {

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
