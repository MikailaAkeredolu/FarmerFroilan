package crops;

import interfaces.Edible;
import produce.Tomato;

public class TomatoPlant extends Crop {
    @Override
    public Edible yield() {
        return new Tomato();
    }
}
