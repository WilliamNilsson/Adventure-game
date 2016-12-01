package main;

public interface IPlayer {

	public boolean isAlive();
	
	public String getName();
	
	public int getStrength();
	
	public int getHp();
	
	public int setHp();

	public int getDefence();
	
	public int getLevel();
	
	public int getXp();
	
	public int takeDamage(int damage);
	
	public String showStats();

	public void setAlive(boolean alive);

	public void setName(String name);

	public void setXp(int xp);

	void setLevel(int level);

	int getDamage();

	void setDamage(int damage);

	void setDefence(int defence);

	void setStrength(int strength);

	public int Attack();

	
	
	
	
	
}
