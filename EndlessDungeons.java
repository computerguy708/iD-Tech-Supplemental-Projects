
import java.util.*;
public class EndlessDungeons {

	public static void main(String[] args) {
	Random generator = new Random ();
	int playerHealth = 75;
	int enemyHealth = 75;
	int playerDamage, enemyDamage;
	while (playerHealth > 0 && enemyHealth > 0)
	{
		System.out.println("You have " + playerHealth + " health.");
		System.out.println("The orc has " + enemyHealth + " health");
		playerDamage = generator.nextInt(20) + 1;
		enemyDamage = generator.nextInt(50) + 1;
		playerHealth -= enemyDamage;
		enemyHealth -= playerDamage;
		System.out.println("You attack the enemy using a broadsword for " + playerDamage + " damage");
		System.out.println("The orc attacks you using a morning star for " + enemyDamage + " damage");
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Attack");
		System.out.println("2. Heal");
		int playerChoice = scan.nextInt(); 
		if(playerChoice == 2)
		{
			healing(enemyHealth, playerHealth);
		}
		else if (playerChoice == 1)
		{
			attack(enemyHealth, playerHealth);
		}
		if (enemyHealth >= playerHealth)
		{
			System.out.println("The orc has mauled you to death");
		}
		else
		
			System.out.println("You have sliced the orc's head off");
		}
	} 
	
	public static void healing(int enemyHealth, int playerHealth) 
	{
		Random generator = new Random ();
		
		
		int playerDamage, enemyDamage;
		System.out.println("You have " + playerHealth + " health.");
		System.out.println("The orc has " + enemyHealth + " health");
		playerDamage = generator.nextInt(20) + 1;
		enemyDamage = generator.nextInt(50) + 1;
		//playerHealth -= enemyDamage;
		playerHealth += 15;
		System.out.println("You healed yourself 15 points using a health potion");
		//System.out.println("The orc attacks you using a morning star for " + enemyDamage + " damage");
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Attack");
		System.out.println("2. Heal");
		int playerChoice = scan.nextInt(); 
		if(playerChoice == 2)
		{
			healing(enemyHealth, playerHealth);
		}
		else if (playerChoice == 1)
		{
			attack(enemyHealth, playerHealth);
		}
	}
	
	public static void attack(int enemyHealth, int playerHealth)
	{
	Random generator = new Random ();
	
	
	
	int playerDamage, enemyDamage;
	System.out.println("You have " + playerHealth + " health.");
	System.out.println("The orc has " + enemyHealth + " health");
	playerDamage = generator.nextInt(20) + 1;
	enemyDamage = generator.nextInt(50) + 1;
	playerHealth -= enemyDamage;
	enemyHealth -= playerDamage;
	System.out.println("You attack the enemy using a broadsword for " + playerDamage + " damage");
	System.out.println("The orc attacks you using a morning star for " + enemyDamage + " damage");
	Scanner scan = new Scanner(System.in);
	System.out.println("1. Attack");
	System.out.println("2. Heal");
	int playerChoice = scan.nextInt();
	if(playerChoice == 2)
	{
		healing(enemyHealth, playerHealth);
	}
	else if (playerChoice == 1)
	{
		attack(enemyHealth, playerHealth);
	}
	
	if (enemyHealth >= playerHealth)
	{
		System.out.println("The orc has mauled you to death");
	}
	else
	
		System.out.println("You have sliced the orc's head off");
	}
	}