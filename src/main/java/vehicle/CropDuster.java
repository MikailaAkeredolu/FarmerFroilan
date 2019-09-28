package vehicle;

import interfaces.AirCraft;
import interfaces.FarmVehicle;
import persons.Pilot;

public class CropDuster extends vehicle implements AirCraft, FarmVehicle {
  
    private Pilot pilot;
    private boolean isTaskComplete;

    public CropDuster(Pilot pilot){
        this.pilot = pilot;
    }
    
    public static void fertilize(String tmp){

    }

    @Override
    public void fly() {
        System.out.println("Let's get high! in the sky");
    }

    @Override
    public void makeNoise() {
        // sound a crop duster makes when dusting  crop rows
        System.out.println("woooosh tatatatata wooosh tatatata");
    }

    @Override
    public void operate() {

    }

    @Override
    public void isFarmTaskCompleted(boolean status) {
        this.isTaskComplete = status;
    }
}

