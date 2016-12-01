package monsters;

public class Orc extends Monster implements IMonster{

	public Orc(String name, int damage, int strength, int healthpoints) {
		super(name, damage, strength, healthpoints);
		System.out.println("you encounter a savage orc\n");
	}
}
