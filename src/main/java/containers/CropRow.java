package containers;

import java.util.ArrayList;
import crops.*;

public class CropRow {
	private ArrayList<Crop> crops = new ArrayList<Crop>();

	public void addCrop(Crop crop) {
		this.crops.add(crop);
	}
}
