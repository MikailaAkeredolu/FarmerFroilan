package persons;

import interfaces.Botanist;
import interfaces.Edible;
import interfaces.Rider;
import interfaces.Rideable;
import containers.CropRow;

public class Farmer extends Person implements Rider, Botanist {
    public void mount(Rideable ride){

    };
    public void dismount(Rideable ride){

    };
    public void ride(Rideable ride){

    };

    public void plantCrop(CropRow cropRow){

    }

    @Override
    public void eat(Edible edible) {

    }

    @Override
    public void makeNoise() {
        System.out.println("YeeHaw");
    }

}
