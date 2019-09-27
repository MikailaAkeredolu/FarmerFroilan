package animals;

import interfaces.Eater;
import interfaces.NoiseMaker;
import interfaces.Edible;

public abstract class Animal implements Eater, NoiseMaker {
    boolean hasEatenToday;
    boolean isFull;

    public void eat(Edible food){

    }
    public void makeNoise(){

    }
}
