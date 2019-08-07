package finalProject;

import java.util.LinkedList;
import java.util.List;

public class Execution {
	
	/**
	 * Find all animals in a linked list with a provided name
	 * @param animals
	 * @param name
	 * @return
	 */
	public static List<Animal> findByName(List<Animal> animals, String name) {
		List<Animal> sameName = new LinkedList<>();
		for (Animal animal: animals)
			if (animal.name.contentEquals(name)) sameName.add(animal);
		return sameName;
	}

	public static void main(String[] args) {

		List<Animal> animals = new LinkedList<>();
		Hamster h1 = new Hamster("Antanas");
		h1.setColour("Ruda");
		h1.setTailLength(1);
		Hamster h2 = new Hamster("Juozas");
		h2.setColour("Balta");
		h2.setTailLength(1);
		Fish f1 = new Fish("Auksė");
		f1.setFinNumber(8);
		Fish f2 = new Fish("Juozas");
		f2.setFinNumber(10);
		animals.add(h2);
		animals.add(f1);
		animals.add(h1);
		animals.add(f2);		
		System.out.println(animals);
		
		animals.sort(null);
		System.out.println(animals);

		System.out.println(findByName(animals, "Auksė"));
		System.out.println(findByName(animals, "Juozas"));
		System.out.println(findByName(animals, "85"));
		
	}

}
