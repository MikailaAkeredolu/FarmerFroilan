package containers;

import java.util.ArrayList;
import animals.Chicken;

public class ChickenCoop {
	ArrayList<Chicken> chickens = new ArrayList<>();

	public ArrayList<Chicken> getChickens() {
		return chickens;
	}

	public void setChickens(ArrayList<Chicken> chickens) {
		this.chickens = chickens;
	}
}
