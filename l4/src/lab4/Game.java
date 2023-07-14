package lab4;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
	        System.out.print("Welcome to the Dungeon! What is your character's name? (Input name then press enter): ");
	        String playerName = input.nextLine();
	        //Create instance of PlayableCharacter with inputed name
	        PlayableCharacter pc = new PlayableCharacter(playerName);
	        System.out.println("Hello, " + pc.getName());
	        
	        /*
	         * Enemy class constructor has 3 arguments.
	         * Argument 1: String name
	         * Argument 2: int locationX
	         * Argument 3: int locationY
	         */
	        Enemy zombie = new Enemy("Zombie 1", 2, 3); //zombie One
	        Enemy zombiee = new Enemy("Zombie 2", 2, 3); //zombie Two
	        
	        //
	        //GAME LOOP START
	        //
	        
	        while (!(pc.getLocationX() == 6 && pc.getLocationY() == 6) && pc.getCurrentHitPoints() > 0) {
	        	 System.out.print(pc);
	        	 //Zombies appearing in console
	             if (zombie.getCurrentHitPoints() > 0) System.out.print(zombie);
	             if (zombiee.getCurrentHitPoints() > 0) System.out.print(zombiee);
	             
	             //Player's turn
	             System.out.println("Where to move? u for up, d for down, l for left, r for right. Any other key will skip the turn.");
	             String in = input.nextLine();
	             switch (in) {
	             	 case "d":
                     pc.setLocationY(pc.getLocationY() - 1);
                     break;
	             	 case "l":
                     pc.setLocationY(pc.getLocationY() - 1);
                     break;
	                 case "u":
	                     pc.setLocationY(pc.getLocationY() + 1);
	                     break;
	                 case "r":
	                     pc.setLocationX(pc.getLocationX() + 1);
	                     break;
	                 default:
	                     System.out.println("Turn Skipped. u for up, d for down, l for left, r for right. Any other key will skip the turn.");
	                     
	             
	            } 	
	             if (pc.getLocationX() == zombie.getLocationX() && pc.getLocationY() == zombie.getLocationY() && zombie.getCurrentHitPoints() > 0) {
	                 System.out.printf("%s attacked %s\n", pc.getName(), zombie.getName());
	                 pc.attackEnemy(zombie);
	                 if (zombie.getCurrentHitPoints() <= 0) {
	                     System.out.printf("%s defeated %s\n", pc.getName(), zombie.getName());
	                     

	                 }
	                 if (pc.getLocationX() == zombiee.getLocationX() && pc.getLocationY() == zombiee.getLocationY() && zombiee.getCurrentHitPoints() > 0) {
	                	 System.out.printf("%s attacked %s\n", pc.getName(), zombiee.getName());
		                 pc.attackEnemy(zombiee);
		                 if (zombiee.getCurrentHitPoints() <= 0) {
		                     System.out.printf("%s defeated %s\n", pc.getName(), zombiee.getName()); 
		                    	
		                    }
	                 }
	                
	             } 
	             
	             
	             Random rand = new Random();
	             
	             if (zombie.getCurrentHitPoints() > 0) {
	            	if (zombiee.getCurrentHitPoints() > 0) {
	          
	            		//Zomibe 1 and Zombie 2 Location
	                 int direction = rand.nextInt(4);
	                 switch (direction) {
	                 case 0:
	                     zombie.setLocationY(zombie.getLocationY() + 1);
	                     zombiee.setLocationY(zombiee.getLocationY() + 1);
	                     break;
	                 case 1:
	                     zombie.setLocationY(zombie.getLocationY() - 1);
	                     zombiee.setLocationY(zombiee.getLocationY() - 1);
	                     break;
	                 case 2:
	                     zombie.setLocationX(zombie.getLocationX() - 1);
	                     zombiee.setLocationY(zombiee.getLocationY() - 1);
	                     break;
	                 case 3:
	                     zombie.setLocationX(zombie.getLocationX() + 1);
	                     zombiee.setLocationY(zombiee.getLocationY() + 1);
	                     break;
	                 }
	                 if (pc.getLocationX() == zombie.getLocationX() && pc.getLocationY() == zombie.getLocationY() && pc.getCurrentHitPoints() > 0){
	                     System.out.printf("%s attacked %s\n", zombie.getName(), pc.getName());
	                     zombie.attackPlayableCharacter(pc);
	                     if (pc.getLocationX() == zombiee.getLocationX() && pc.getLocationY() == zombiee.getLocationY() && pc.getCurrentHitPoints() > 0)
	                    	 System.out.printf("%s attacked %s\n", zombiee.getName(), pc.getName());
	                     zombiee.attackPlayableCharacter(pc);
	                     if (pc.getCurrentHitPoints() <= 0) {
	                         System.out.printf("%s defeated %s\n", zombie.getName(), pc.getName());
	                         
	                     
	                   
                         }
	                 }
	             }

	        }
	        
	      }
	}

}
