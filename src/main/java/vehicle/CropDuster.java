package vehicle;

import persons.Pilot;

public class CropDuster extends vehicle implements AirCraft{
  
    private Pilot pilot;

    public CropDuster(Pilot pilot){
        this.pilot = pilot;
    }
    
    public static void fertilize(String tmp){

    }
}

