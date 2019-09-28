package vehicle;
import persons.Farmer;
public class Tractor extends vehicle implements FarmVehicle{

    private Farmer farmer;

    public Tractor(Farmer farmer){
        this.farmer = farmer;
    }
    public static void harvest(String crops){

    }

    @Override
    public void makeNoise() {
        System.out.println("I'm tractoring!");
    }
}
