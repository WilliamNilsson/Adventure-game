package monsters;

public class Ogre extends Monster implements IMonster{

	public Ogre(String name, int damage, int strength, int healthpoints) {
		super(name, damage, strength, healthpoints);
		System.out.println("you encounter a gruesome Ogre\n");
	}
}

