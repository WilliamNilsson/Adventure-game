package main;
public class Player implements IPlayer{
	
private String Name;
private int Strength;
private int Hp;
private int Defence;
private int PlayerLevel;
private int Xp;
private int Damage;
@SuppressWarnings("unused")
private boolean Alive;
private int XpToNextLevel;

		public Player(String Name, boolean Alive, int Hp, int Strength, int Defence, int Level, int Xp, int Damage, int XpToNextLevel){
			this.Name = Name;
			this.Alive = Alive;
			this.Hp = Hp;
			this.Defence = Defence;
			this.PlayerLevel = Level;
			this.Xp = Xp;
			this.Damage = Damage;
			this.XpToNextLevel = XpToNextLevel;
		}
		
		@Override
		public String showStats(){
			System.out.println(Name + " is " + (isAlive() ? "Alive" : "Dead") + ", has " + getHp() + " Hp and is Level "  + getLevel());
			return null;
		}
		
		public void levelUp(){
			if(this.Xp >= XpToNextLevel){
				this.PlayerLevel += 1;
				this.Hp += 20;
				this.Strength += 2;
				this.Defence += 1;
				this.Damage += 1;
				this.XpToNextLevel += 20;
			}
			
		}
		
		public int Attack() {
			return (this.getDamage() + this.getStrength());
		}
		
		public int takeDamage(int damage){
			return this.Hp -= (damage - this.Defence);
		}
		
		public boolean isAlive() {
			if(Hp <= 0){
				System.out.println(getName() + " is dead. Better luck next time.");
				return false;
			}
			else{
			//	System.out.println(getName() + " is still alive with " + getHp() + "healthpoints");
				return true; 
			}
		}
		
		@Override
		public void setAlive(boolean alive) {
			Alive = alive;
		}
		@Override
		public void setName(String name) {
			this.Name = name;
		}
		@Override
		public String getName() {
			return this.Name;
		}
		@Override
		public int getStrength() {
			return this.Strength;
		}
		@Override
		public void setStrength(int strength) {
			Strength = strength;
		}
		@Override
		public int getDefence() {
			return this.Defence;
		}
		@Override
		public void setDefence(int defence) {
			Defence = defence;
		}
		@Override
		public int getDamage() {
			return this.Damage;
		}
		@Override
		public void setDamage(int damage) {
			Damage = damage;
		}
		public int getLevel() {
			return this.PlayerLevel;
		}
		@Override
		public void setLevel(int level) {
			PlayerLevel = level;
		}
		@Override
		public int getXp() {
			return this.Xp;
		}
		@Override
		public void setXp(int xp) {
			this.Xp += xp;
		}
		@Override
		public int getHp() {
			return this.Hp;
		}
		@Override
		public int setHp() {
			return Hp;
		}

		
		
		/*
			private boolean dodge() {
						Random random = new Random();
							int i = random.nextInt(4);
								if(i == 0){
										return true;
									}
									else
											return false;			
											}

*/
		




}
