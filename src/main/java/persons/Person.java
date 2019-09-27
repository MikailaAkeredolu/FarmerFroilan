package persons;

import interfaces.Eater;
import interfaces.NoiseMaker;

public abstract class Person implements NoiseMaker, Eater {
    private String name;
}
