import animals.Chicken;
import animals.Horse;
import containers.*;
import persons.Farmer;
import persons.Person;
import persons.Pilot;
import vehicle.CropDuster;
import vehicle.Tractor;
import crops.*;

import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
	Farmer froilan = new Farmer();
	FarmHouse farmHouse = new FarmHouse();
	Farm farm  = new Farm(froilan, farmHouse);
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

	addChickens(farm);
	addHorses(farm);

	Pilot froilanda = new Pilot();
	CropDuster cropDuster = new CropDuster(froilanda);
	Tractor tractor = new Tractor(froilan);

	System.out.println("Farmer said Yeehaw");
	}

	public static void addChickens(Farm f){
		ArrayList<ChickenCoop> coops = new ArrayList<>();
		for(int x = 0; x < 4; x++)
		{
			ChickenCoop coop = new ChickenCoop();

			ArrayList<Chicken> chickens = new ArrayList<>();
			for(int i = 0; i < 15; i++)
				chickens.add(new Chicken());

			coop.setChickens(chickens);
			coops.add(coop);
		}
		f.setChickenCoops(coops);
	}

    public static void addHorses(Farm f){
        ArrayList<Stable> stables = new ArrayList<>();
        for(int x = 0; x < 3; x++)
        {
            Stable stable = new Stable();

            ArrayList<Horse> horses = new ArrayList<>();
            for(int i = 0; i < 10; i++)
                horses.add(new Horse());

            stable.setHorses(horses);
            stables.add(stable);
        }
        f.setStables(stables);
    }
}
