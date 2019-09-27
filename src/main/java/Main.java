import containers.Farm;
import containers.Field;
import persons.Farmer;
import persons.Person;
import persons.Pilot;
import vehicle.CropDuster;
import vehicle.Tractor;

public class Main {
public static void main(String[] args) {
	Farmer froilan = new Farmer();
	Farm farm  = new Farm(froilan);
	Pilot froilanda = new Pilot();
	CropDuster cropDuster = new CropDuster(froilanda);
	Tractor tractor = new Tractor(froilan);
    
    	Field field = new Field();
    
    	System.out.println("Farmer said Yeehaw");
	}
}
