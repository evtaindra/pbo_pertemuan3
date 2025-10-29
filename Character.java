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

    //constructor
    public Character(String xname,int xlevel,int xhealthPoints){
        this.name = xname;
        this.level = xlevel;
        this.healthPoints = xhealthPoints;
    }
}