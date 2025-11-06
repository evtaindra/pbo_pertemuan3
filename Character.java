//Buat nama Class sesuai dengan nama file
public class Character {

    //atribut = variabel = property
    private String name;
    private int level;
    private int healthPoints;

    //constructor
    public Character(String xname,int xlevel,int xhealthPoints){
        this.name = xname;
        this.level = xlevel;
        this.healthPoints = xhealthPoints;
    }
    //setter dan getter
    public void setName(String xname){
        this.name = xname;
    }
    public String getName(){
        return this.name;
    }    
    public void setLevel(int xlevel){
        this.level = xlevel;
    }
    public int getLevel(){
        return this.level;
    }
    public void setHealthPoints(int xhealthPoints){
        this.healthPoints = xhealthPoints;
    }
    public int getHealthPoints(){
        return this.healthPoints;
    }

    public void showinfo(){
        System.out.println("-----------------------");
        System.out.println("Nama karakter: " + this.name);
        System.out.println("Level karakter: " + this.level);
        System.out.println("Health Points karakter: " + this.healthPoints);
        System.out.println("-----------------------\n");
    }

   public int levelUp(){
        return this.level += 1;
   }
    public int takeDamage(int damage){
        return this.healthPoints -= damage;
    }
    public int heal(int healAmount){
        return this.healthPoints += healAmount;
    }

}