package animals;

public abstract class MysticalAnimal extends Animal {
	private String name;

	MysticalAnimal(String name){
		this.name = name;
	}

	public void usePower(){ }

	public String getName() {
		return name;
	}
}
