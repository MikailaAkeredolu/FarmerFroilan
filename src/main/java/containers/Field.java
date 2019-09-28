package containers;

import crops.Crop;

import java.util.ArrayList;

public class Field {
	private ArrayList<CropRow> cropRows = new ArrayList<>();

	public ArrayList<CropRow> getCropRows() {
		return cropRows;
	}

	public void addCropRow(CropRow cropRow){
		this.cropRows.add(cropRow);
	}

	public void addCrops(int indexOfCropRow, Crop cropToAdd){
		this.cropRows.get(indexOfCropRow).addCrop(cropToAdd);
	}
}
