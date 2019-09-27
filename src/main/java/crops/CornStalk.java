package crops;
import interfaces.Edible;
import produce.Corn;

public class CornStalk extends Crop {
    @Override
    public Edible yield() {
        return new EarCorn();
    }
}
