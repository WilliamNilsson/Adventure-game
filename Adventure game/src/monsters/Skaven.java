package monsters;

public class Skaven extends Monster implements IMonster{

	public Skaven(String name, int damage, int strength, int healthpoints) {
		super(name, damage, strength, healthpoints);
		System.out.println("you encounter a skittish Skaven\n");
	}
}
