package containers;

import java.util.ArrayList;

public class Field {
	ArrayList<CropRow> cropRows = new ArrayList<>();
	public Field() {
		cropRows.add(new CropRow("CornStalk", 20));
		cropRows.add(new CropRow("TomatoPlant", 20));
		cropRows.add(new CropRow("CornStalk", 20));
		cropRows.add(new CropRow("TomatoPlant", 20));
		cropRows.add(new CropRow("CornStalk", 20));
	}
}
