package persons;

import interfaces.Botanist;
import interfaces.Rider;
import interfaces.Ridable;
import containers.CropRow;

public class Farmer extends Person implements Rider, Botanist {
    public void mount(Ridable ride){

    };
    public void dismount(Ridable ride){

    };
    public void ride(Ridable ride){

    };

    public void plantCrop(CropRow cropRow){

    }
}
