package crops;
import interfaces.Edible;
import produce.EarCorn;

public class CornStalk extends Crop {
    @Override
    public Edible yield() {
        return new EarCorn();
    }
}
