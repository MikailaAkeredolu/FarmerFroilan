package animals;

import interfaces.Edible;
import interfaces.Produce;
import produce.EdibleEgg;

public class Chicken extends Animal implements Produce {
    boolean hasBeenFertilized;

    public Edible yield(){
        return new EdibleEgg();
    }

    @Override
    public void eat(Edible food) {
        super.eat(food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Can't you see I'm chickening here! cluck off!");
    }
}
