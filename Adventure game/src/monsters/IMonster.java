package monsters;

public interface IMonster {
	
	public String getName();
	
	public int getDamage();
	
	public int getStrength();
	
	public int getHealthpoints();
	
	public int Attack();
		
	public boolean isAlive();

	void takeDamage(int damage);
	
}
