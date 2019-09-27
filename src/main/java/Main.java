import containers.Farm;
import persons.Farmer;
import persons.Person;
import persons.Pilot;
import vehicle.CropDuster;

public class Main {
	public static void main(String[] args) {
		Farmer froiland = new Farmer();
		Farm farm  = new Farm(froiland);
		Pilot froilanda = new Pilot();
		CropDuster cropDuster = new CropDuster(froilanda);
    
    System.out.println("Farmer said Yeehaw");
    }
}
