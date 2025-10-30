//Buat nama Class sesuai dengan nama file
public class Character {

    //atribut = variabel = property
    private String name;
    private int level;
    private int healthPoints;

    //method = function
    public void showLevel(){
        System.out.println("Level: " +this.level);
    }
    public void upLevel(){
        this.level +=1;
    }
    public void downLevel(){
        this.level -=1;
    }
    public void showName(){    
        System.out.println("Name: " +this.name);  
    }

    public void showHealthPoints(){
        System.out.println("Health Points: " +this.healthPoints);
    }

    public void upheal(int healthPoints){
        this.healthPoints += healthPoints;
        if(this.healthPoints > 100)
        {
            this.healthPoints = 100;
        }
    }
    public int uphealReturn(int healthPoints){
        this.healthPoints += healthPoints;
        if(this.healthPoints > 100)
        {
            this.healthPoints = 100;
        }
        return this.healthPoints;
    }
    public void up20Health(){
        this.healthPoints += 20;
        if(this.healthPoints > 100)
        {
            this.healthPoints = 100;
        }
    }
    public void downHealth(int healthPoints){
        this.healthPoints -= healthPoints;
        if(this.healthPoints < 0)
        {
            this.healthPoints = 0;
        }
    }

    public void changeName(String newName){
        this.name = newName;
    }

    //constructor
    public Character(String xname,int xlevel,int xhealthPoints){
        this.name = xname;
        this.level = xlevel;
        this.healthPoints = xhealthPoints;
    }
}