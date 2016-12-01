package main;
import java.util.Scanner;
import monsters.IMonster;
import monsters.Monster;
import monsters.Orc;
import monsters.Skaven;
import monsters.Ogre;
public class Game{
	private static Scanner sc = new Scanner(System.in);
	private static boolean lostGame = false;
	private static boolean wonGame = false;
	private static Player player;
	private static String name;
	public void gameStart(){	
		
		welcomeScreen();
				
		player = new Player(name, true, 20, 3, 3, 1, 0, 4, 20);
		setPlayerName();

		mainMenu();	
	}
	


	private static void welcomeScreen(){
		System.out.println("************************");
		System.out.println("* Welcome to the game! *");
		System.out.println("************************");
		System.out.println("Enter your name: ");
	}
	
	public static void goAdventure(){ // the adventuring method
		if(RandomHelper.getBigChance()){ // Randomgenerator
			Monster randomMonster = newRandomMonster();
			battle(randomMonster);
			}
			else{
			nothingHappens();
				}
			}
	
		public static Monster newRandomMonster() {
			int playerLevel = player.getLevel();
			int x = RandomHelper.getIntMonster(1, 3);
			if(playerLevel <=3){
				switch (x) {
				case 1:
					return new Orc("Orc", 3, 2, 15);
				
				case 2:
					return new Skaven("Skaven", 2, 2, 10);
					
				case 3:
					return new Ogre("Ogre", 4, 2, 20);
				}
			}
				else if((playerLevel >=4) && (playerLevel <=6)){
					switch (x) {
					case 1:
						return new Orc("Orc", 4, 4, 30);
					
					case 2:
						return new Skaven("Skaven", 3, 3, 15);
						
					case 3:
						return new Ogre("Ogre", 5, 4, 40);
					}
				}
					else if((playerLevel > 6) && (playerLevel <=9)){
						switch (x) {
						case 1:
							return new Orc("Orc", 9, 5, 40);
						
						case 2:
							return new Skaven("Skaven", 7, 4, 25);
							
						case 3:
							return new Ogre("Ogre", 10, 6, 45);
						}
					}
					
			
		return null;
	}



		private static void nothingHappens() {
			System.out.println("Nothing Exciting happens on your travels.");
			mainMenu();
			return;
		}
	/*public static void findBattle(){
		Scanner ns = new Scanner(System.in);
		while(player.isAlive()){
			System.out.println("Press any key to continue:");
			System.out.println("> ");
			ns.next();
			if(RandomHelper.oneInTwo()){
				Monster ShortSkaven= new Skaven(name, 10, 2, 0);
					System.out.println("You encountered a filthy Skaven!");
			}
			else{
				Monster thisOrc= new Orc(name, 20, 3, 0);
				System.out.println("You encountered a brutish Orc"); 
				}
			}
		} */
	private static void battle(Monster monster){
		while (player.isAlive() && monster.isAlive()){
			System.out.println("Flee or fight?");
			System.out.println("1. fight");
			System.out.println("2. flee");
			int i;
			i = sc.nextInt();
			switch(i){
			case 1:
				System.out.println("");
				System.out.println(player.getName() + " chose to fight the " + monster.getName() + "!");
				System.out.println("");
				monster.takeDamage(player.Attack());
				System.out.println(player.getName() + " hit " + monster.getName() + " for " + player.Attack() + " damage");
				player.takeDamage(monster.Attack());
				System.out.println(monster.getName() + " hit " + player.getName() + " for " + monster.Attack() + " damage\n");
				System.out.println(player.getName() + " has " + player.getHp() + " HP left.\n");
				System.out.println(monster.getName() + " has " + monster.getHealthpoints() + " HP left.\n");
				break;
			case 2:
				System.out.println("You fled to fight another day.\n");
				mainMenu();
				break;
			}
			
		}
		if(player.getHp() <= 0){
			lostGame = true;
			System.exit(0);
		}
		else if(monster.getHealthpoints() <= 0 && player.isAlive()){
			System.out.println(player.getName() + " slayed the " + monster.getName() + "!");
			player.setXp(10);
			player.levelUp();
			if(player.getLevel() == 10){
				wonGame = true;
				System.out.println("Congratulations, you have reached level 10 and won the game");
				System.exit(0);
			}
			}
			mainMenu();
		}
		
	
	private static String setPlayerName(){
		@SuppressWarnings("resource")
		Scanner pName = new Scanner(System.in);
		player.setName(pName.next());
		return name;
		
	}
	private static void mainMenu(){
		System.out.println("What would you like to do " + player.getName() + "?");
		System.out.println("1. Go adventuring"); // alternative to go adventuring
		System.out.println("2. Show details about your character"); // alternative to inpect players stats
		System.out.println("3. Exit game"); // alternative to exit the game

		if(player.isAlive() && (!wonGame && !lostGame)){
		int ms; //MenuChoice
		ms = sc.nextInt();  // the Scanner
		switch (ms){ //the switch for the menu
			case 1: 
				
				goAdventure(); // alterntive 1
				break;
			case 2: 
				
				player.showStats(); // alternative 2
				System.out.println("");
				mainMenu();
				break;
			case 3: 
				System.out.println("Exiting game.");  // alternative 3
				lostGame = true;
				System.exit(ms);
				break;
			default:
				System.out.println("Error. No valid alternative selected.");
				System.out.println("Try Again.");
				break;
			}
		}
		sc.close();
	}

}

