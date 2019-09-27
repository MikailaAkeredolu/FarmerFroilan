package containers;

import crops.TomatoPlant;

import java.util.ArrayList;
import crops.*;

public class CropRow {
	ArrayList<Crop> crops = new ArrayList<Crop>();
    public CropRow(String typeOfCrop, int numOfCrop) {
        if (typeOfCrop.equals("CornStalk")){
            for (int i=0; i<numOfCrop; i++){
                crops.add(new CornStalk());
            }
        } else if (typeOfCrop.equals("TomatoPlant")){
            for (int i=0; i<numOfCrop; i++){
                crops.add(new TomatoPlant());
            }
        }
    }
}
