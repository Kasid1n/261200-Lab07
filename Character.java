public class Character {
    private int health;
    private int stamina;
    private int maxHealth;
    private int maxStamina;

    public Character(int health, int stamina){
        this.maxHealth = health;
        this.maxStamina = stamina;
        this.stamina = stamina;
        this.health = health;
        System.out.println("Character created with "+this.maxHealth+" health and "+this.maxStamina+" stamina.");
    }

    public void displayStatus(){
        System.out.println("Character's health: "+this.health+", stamina: "+this.stamina+".");
    }



    public void swingSword(){
        this.stamina-=10;
        if(this.stamina <= 0){
          this.stamina = 0;
          System.out.println("Character swings the sword. Stamina is now 0.");
          System.out.println("Your character needs to cool down.");
        }
        else{
            System.out.println("Character swings the sword. Stamina is now "+this.stamina+".");
        }
    }

    public void takeDamage(int dmg){
        this.health-=dmg;
        if(this.health <= 0){
            this.health = 0;
            System.out.println("Character takes "+dmg+" damage. Health is now 0.");
            System.out.println("Character is dead.");
        }
        else{
            System.out.println("Character takes "+dmg+" damage. Health is now "+this.health+".");
        }
    }
    public void rest(){
        this.health = this.maxHealth;
        this.stamina = this.maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }
}
