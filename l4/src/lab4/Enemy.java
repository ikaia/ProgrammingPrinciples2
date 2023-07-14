package lab4;

public class Enemy {

	//class fields
    private String name;
    private int currentHitPoints = 4;
    private int weaponDamage = 2;
    private int locationX = 0;
    private int locationY = 0;
    
    //Enemy Constructor with paramenters of string name, locationX, and locationY
    public Enemy(String name, int locationX, int locationY) {
        this.name = name;
        this.locationX = locationX;
        this.locationY = locationY;
    }
  
  //Enemy Object
    public Enemy(String name) {
        this(name, 2, 3);
    }
   
	//Getters and Setters
	String getName() {
		return name;
	}
	public int getCurrentHitPoints() {
		return currentHitPoints;
	}
	public int getWeaponDamage() {
		return weaponDamage;
	}
	public int getLocationX() {
		return locationX;
	}
	public int getLocationY() {
		return locationY;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCurrentHitPoints(int currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
	}
	public void setWeaponDamage(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}
	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}
	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}
    
	 public void receiveDamage(int damageTaken) {
		 this.currentHitPoints -= damageTaken;
	    }
	    public void attackPlayableCharacter(PlayableCharacter player) {
	    	player.receiveDamage(this.weaponDamage);
	    }
	   public String toString() {
		 //%s means String
	        //%d means decimal number (integer)
	        return String.format("%s location: %d, %d. HitPoints: %d\n", this.getName(), this.getLocationX(), this.getLocationY(), this.getCurrentHitPoints());
	    }   
	    public boolean equals(Object other) {
	    	//Cast the Object parameter to a PlayableCharacter so we can access its name
	        //If the name of the current PlayableCharacter equals the other PlayableCharacter being passed as a parameter, return true. Else, return false.
	        Enemy tempCast = (Enemy)other;
	        if (this.name.equals(tempCast.getName())){ 
	            return true;
	        }
	        else {
	            return false;
	        }
	        
	         
	    }
	    }


