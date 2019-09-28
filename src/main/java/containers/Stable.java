package containers;

import java.util.ArrayList;
import animals.Horse;

public class Stable {
	ArrayList<Horse> horses = new ArrayList<>();

	public ArrayList<Horse> getHorses() {
		return horses;
	}

	public void setHorses(ArrayList<Horse> horses) {
		this.horses = horses;
	}
}
