package animals;

import interfaces.Edible;
import interfaces.Rideable;
import produce.Cupcake;

public class Unicorn extends MysticalAnimal implements Rideable {

	public Unicorn(String name){
		super(name);
	}

	@Override
	public void usePower() {
		System.out.println("Farts glitter infused rainbows ✨🌈✨");
	}

	public void eat(Cupcake cupcake) {
		System.out.println("Yummmy yum yum!");
	}

	@Override
	public void eat(Edible food) {
		throw new IllegalArgumentException("Unicorns can only eat cupcakes !");
	}

	@Override
	public void makeNoise() {
		System.out.println("Take these shrooms and hop on! We're going on an adventure!");
	}
}
