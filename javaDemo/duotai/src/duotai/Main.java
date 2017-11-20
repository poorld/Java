package duotai;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		animalShout(dog);
		animalShout(cat);

	}
	
	public static void animalShout(Animal animal){
		animal.shout();
	}
}
