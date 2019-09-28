package vehicle;

import persons.Pilot;

public class CropDuster extends vehicle implements AirCraft{
  
    private Pilot pilot;

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
}

