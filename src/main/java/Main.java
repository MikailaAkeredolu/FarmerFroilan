import containers.CropRow;
import containers.Farm;
import containers.Field;
import persons.Farmer;
import persons.Person;
import persons.Pilot;
import vehicle.CropDuster;
import vehicle.Tractor;
import crops.*;

public class Main {
public static void main(String[] args) {
	Farmer froilan = new Farmer();
	Farm farm  = new Farm(froilan);
	Field field = new Field();

	// generate crop rows in the field
	field.cropRows.add(new CropRow());
	field.cropRows.add(new CropRow());
	field.cropRows.add(new CropRow());
	field.cropRows.add(new CropRow());
	field.cropRows.add(new CropRow());

	//generate crops in each of those crop rows
	//Even number rows get corn, odd rows get tomato
	//20 crops per row
	for (int i = 0; i < field.cropRows.size(); i++){
		if (i % 2 == 0) {
			for (int j=0; j < 20; j++){
				field.cropRows.get(i).crops.add(new CornStalk());
			}
		} else {
			for (int j=0; j < 20; j++){
				field.cropRows.get(i).crops.add(new TomatoPlant());
			}
		}
	}
	Pilot froilanda = new Pilot();
	CropDuster cropDuster = new CropDuster(froilanda);
	Tractor tractor = new Tractor(froilan);

	System.out.println("Farmer said Yeehaw");
	}
}
