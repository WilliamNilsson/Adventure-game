package main;
import java.util.Random;

import monsters.Monster;
import monsters.Ogre;
import monsters.Orc;
import monsters.Skaven;
public class RandomHelper extends Game{
	public RandomHelper(){
		
	}
	public static boolean oneInTwo(){
		Random chance = new Random();
		boolean i = (chance.nextDouble()<0.1);
		if(i){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean getBigChance(){
		
		Random chance = new Random();
		boolean i = (chance.nextDouble()<0.9);
		if(i)
		return true;
		
		else
			return false;
		
		
		}
		public static int oneInThree(){
		Random random = new Random();
		int i = random.nextInt(8);
		if(i <= 2){
			//monsterList.get(Skaven);
			//Monster Skaven= new Skaven(10, 4);
		}
		if(i>=3 && i <= 5){
			//Monster Orc= new Orc (20, 6);
		}
		if(i>=6 && i <= 8){
			//Monster Ogre= new Ogre (30, 10);
		}

		return i;
		
		
	} 
		public static int getIntMonster(int low, int high){
			Random random = new Random();
			return low + random.nextInt((high +1) - low);
		}

}
