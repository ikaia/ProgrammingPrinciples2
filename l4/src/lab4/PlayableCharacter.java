package lab4;

public class PlayableCharacter {

	//class fields
    private String name;
    private int currentHitPoints = 10;
    private int weaponDamage = 5;
    private int locationX = 0;
    private int locationY = 0;
     
	String getName() {
		return name;
	}
	int getCurrentHitPoints() {
		return currentHitPoints;
	}
	private int getWeaponDamage() {
		return weaponDamage;
	}
	int getLocationX() {
		return locationX;
	}
	int getLocationY() {
		return locationY;
	}
	private void setName(String name) {
		this.name = name;
	}
	private void setCurrentHitPoints(int currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
	}
	private void setWeaponDamage(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}
	void setLocationX(int locationX) {
		this.locationX = locationX;
	}
	void setLocationY(int locationY) {
		this.locationY = locationY;
	}
	
	 //Lower our current hitpoints by the damageTaken argument
    public void receiveDamage(int damageTaken) {
        this.currentHitPoints -= damageTaken;
    }
    //Object interaction. The parameter is an Enemy object
    //We call the enemy's receiveDamage method within this attackEnemy method
    public void attackEnemy(Enemy enemy) {
        enemy.receiveDamage(this.weaponDamage);
    }
    public String toString() {
        //%s means String
        //%d means decimal number (integer)
        return String.format("%s location: %d, %d. HitPoints: %d\n", this.getName(), this.getLocationX(), this.getLocationY(), this.getCurrentHitPoints());
    }
    public boolean equals(Object other) {
        //Cast the Object parameter to a PlayableCharacter so we can access its name
        //If the name of the current PlayableCharacter equals the other PlayableCharacter being passed as a parameter, return true. Else, return false.
        PlayableCharacter tempCast = (PlayableCharacter)other;
        if (this.name.equals(tempCast.getName())){ 
            return true;
        }
        else {
            return false;
        }
    }
    
    public PlayableCharacter(String name) {
        this.name = name; //Alternatively, you could have used setName to set the name
    }
    
    
}
