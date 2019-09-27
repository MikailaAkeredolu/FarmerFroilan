package interfaces;

public interface Eater {
	boolean hasEatenToday = false;
	boolean isFull = false;

	void eat(Edible edible);
}
