package monsters;

public abstract class Monster implements IMonster{

	private String name;
	private int damage;
	private int strength;
	private int healthpoints;
	
	
	public Monster(String name, int damage, int strength, int healthpoints){
		this.name = name;
		this.damage = damage;
		this.strength = strength;
		this.healthpoints = healthpoints;
	}
	
	@Override
	public String getName(){
		return this.name;
	}
	
	@Override
	public int getDamage(){
		return this.damage;
	}
	
	@Override
	public int getStrength(){
		return this.strength;
	}
	
	public int getHealthpoints(){
		return this.healthpoints;
	}
	
	@Override
	public void takeDamage(int damage){
		this.healthpoints -= (damage - this.strength);
	}
	
	@Override
	public int Attack() {
		return (this.damage + this.strength);
	}
	
	@Override
	public boolean isAlive(){
		if(this.healthpoints <= 0)
			return false;
		else
			return true;
		}
	}















 /*protected int Hp;
protected int Damage;

public static ArrayList<Monster> monsterList= new ArrayList<Monster>();


Monster Skaven= new Skaven(10, 4);
Monster Orc= new Orc (20, 6);
Monster Ogre= new Ogre (30, 10);

public Monster(){
	monsterList.add(Skaven);
	monsterList.add(Orc);
	monsterList.add(Ogre);
} 

public int attack(){
	if(dodge()){
		System.out.println("miss!");
	}
	return Damage;	
	}

public boolean dodge() {
	Random random = new Random();
		int i = random.nextInt(4);
			if(i == 0){
					return true;
				}
				else
						return false;			
						}

public boolean isAlive() {
	if(Hp <= 0){
		return false;
		
	}
	else{
		return true;
	}
}

public int Attack(int damage) {
	// TODO Auto-generated method stub
	return 0;
}
*/