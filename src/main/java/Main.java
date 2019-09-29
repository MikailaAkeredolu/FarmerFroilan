import animals.Chicken;
import animals.Dragon;
import animals.Horse;
import animals.Unicorn;
import containers.*;
import persons.Baker;
import persons.Farmer;
import persons.Pilot;
import produce.Cupcake;
import produce.EarCorn;
import vehicle.CropDuster;
import vehicle.Tractor;
import crops.*;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	Farmer froilan = new Farmer("Froilan");
	FarmHouse farmHouse = new FarmHouse();
	Farm farm  = new Farm(froilan, farmHouse);
	Field field = new Field();

	// generate crop rows in the field
	addCropRows(field, 5);

	//generate crops in each of those crop rows
	//Even number rows get corn, odd rows get tomato
	//20 crops per row
	for (int i = 0; i < field.getCropRows().size(); i++){
		if (i % 2 == 0) {
			for (int j=0; j < 20; j++){
				field.addCrops(i, new CornStalk());
			}
		} else {
			for (int j=0; j < 20; j++){
				field.addCrops(i, new TomatoPlant());
			}
		}
	}

	addChickens(farm);
	addHorses(farm);

	System.out.println("Farmer said Yeehaw");

	// some testing of shit to make sure it works
	Pilot froilanda = new Pilot("Froilanda");
	CropDuster cropDuster = new CropDuster(froilanda);
	Tractor tractor = new Tractor(froilan);

	tractor.makeNoise();
	froilan.mount(tractor);
	froilan.ride(tractor);
	froilan.makeNoise();

	cropDuster.makeNoise();
	froilanda.mount(cropDuster);
	froilanda.ride(cropDuster);
	cropDuster.fly();
	froilanda.makeNoise();

		// for spacing
		System.out.println();
		// testing mystical animals
		Baker joe = new Baker("Joe");
		Cupcake cupcake = joe.bakeCupcake();
		Chicken randomChicken = new Chicken();
		EarCorn corn = new EarCorn();

		Dragon sephira = new Dragon("Sephira");
		sephira.eat(randomChicken);
		sephira.fly();
		sephira.makeNoise();
		System.out.print(sephira.getName() + " ");
		sephira.usePower();

		Unicorn unicorn = new Unicorn("Xenia");
		unicorn.eat(cupcake);
		unicorn.makeNoise();
		System.out.print(unicorn.getName() + " ");
		unicorn.usePower();
	}

	public static void addChickens(Farm f){
		int chickenCount = 15;
		ArrayList<ChickenCoop> coops = new ArrayList<>();
		for(int x = 0; x < 4; x++)
		{
			ChickenCoop coop = new ChickenCoop();
			int addChic = (x==3) ? chickenCount : 1 + (int)(Math.random()*(((chickenCount-(4-(x+1))) - 1 ) + 1));

			ArrayList<Chicken> chickens = new ArrayList<>();
			for(int i = 0; i < addChic; i++)
			{
				chickens.add(new Chicken());
				chickenCount--;
			}

			coop.setChickens(chickens);
			coops.add(coop);
		}
		f.setChickenCoops(coops);
	}

    public static void addHorses(Farm f){
		int horseCount = 10;
        ArrayList<Stable> stables = new ArrayList<>();
        for(int x = 0; x < 3; x++)
        {
            Stable stable = new Stable();
			int addHorse = (x==2) ? horseCount : 1 + (int)(Math.random()*(((horseCount-(3-(x+1))) - 1 ) + 1));

            ArrayList<Horse> horses = new ArrayList<>();
            for(int i = 0; i < addHorse; i++)
			{
				horses.add(new Horse());
				horseCount--;
			}

            stable.setHorses(horses);
            stables.add(stable);
        }
        f.setStables(stables);
    }

    public static void addCropRows(Field field, int numOfCropRows){
		for (int i=0; i<numOfCropRows; i++){
			field.addCropRow(new CropRow());
		}
	}
}
