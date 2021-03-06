package containers;

import persons.Farmer;

import java.util.ArrayList;

public class Farm {
	private Farmer farmer;
	private FarmHouse farmhouse;
	private ArrayList<Stable> stables = new ArrayList<>();
	private ArrayList<ChickenCoop> chickenCoops = new ArrayList<>();

	public Farm(Farmer farmer, FarmHouse farmHouse){
		this.farmer = farmer;
		this.farmhouse = farmHouse;
	}

	public void addStable(Stable stable){
		this.stables.add(stable);
	}

	public void removeStable(Stable stable){
		this.stables.remove(stable);
	}

	public void addChickenCoop(ChickenCoop coop) {
		this.chickenCoops.add(coop);
	}

	public void removeChickenCoop(ChickenCoop coop){
		this.chickenCoops.remove(coop);
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

	public FarmHouse getFarmhouse() {
		return farmhouse;
	}

	public void setFarmhouse(FarmHouse farmhouse) {
		this.farmhouse = farmhouse;
	}

	public ArrayList<Stable> getStables() {
		return stables;
	}

	public void setStables(ArrayList<Stable> stables) {
		this.stables = stables;
	}

	public ArrayList<ChickenCoop> getChickenCoops() {
		return chickenCoops;
	}

	public void setChickenCoops(ArrayList<ChickenCoop> chickenCoops) {
		this.chickenCoops = chickenCoops;
	}
}
