public class Entity {
    //property
    private String name;
    private int health;
    private int x,y,z;
    
    public Entity(String nm, int health, int x, int y, int z) {
        this.name = nm;
        this.health = health;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //setter and getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = Math.max(0, health); //pastikan Health tidak negatif
    }
    public void takeDamage(int damage) {
       if(damage > 0) {
           setHealth(this.health - damage);
           System.out.println(this.name + " Mendapatkan " + damage + " damage. Remaining health: " + this.health);
       }
    }
    public boolean isAlive() {
        return this.health > 0;
    }

    public void displayStatus() {
        System.out.println("======= Name: " + this.name+" =======");
        System.out.println("Health: " + this.health);
        System.out.println("Position: (" + this.x + ", " + this.y + ", " + this.z + ")");
        System.out.println("Status: " + (isAlive() ? "Alive" : "Dead"));
        System.out.println("Type: " + this.getClass().getSimpleName());
    }

    public void move(int newX, int newY, int newZ) {
        this.x += newX;
        this.y += newY;
        this.z += newZ;
        System.out.println(this.name + 
            " moved to position:(" + this.x + ", " + this.y + ", " + this.z + ")");
    }

}
