package vehicle;
import interfaces.FarmVehicle;
import persons.Farmer;
public class Tractor extends vehicle implements FarmVehicle {

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

    @Override
    public void operate() {

    }

    @Override
    public void isFarmTaskCompleted(boolean status) {

    }
}
