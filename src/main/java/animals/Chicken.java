package animals;

import interfaces.Edible;
import interfaces.Produce;
import produce.EdibleEgg;

public class Chicken extends Animal implements Produce {
    boolean hasBeenFertilized;

    public Edible yield(){
        return new EdibleEgg();
    }
}
