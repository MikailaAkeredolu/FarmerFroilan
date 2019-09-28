package persons;

import interfaces.Eater;
import interfaces.NoiseMaker;
import interfaces.Rider;

public abstract class Person implements NoiseMaker, Eater, Rider {
    private String name;
}
