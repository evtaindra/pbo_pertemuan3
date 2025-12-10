public class Mob extends Entity{
    private boolean isHostile;

    public Mob(String nm, int health, int x, int y, int z, boolean isHostile) {
        super(nm, health, x, y, z);
        this.isHostile = isHostile;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Is Hostile: " + this.isHostile);
    }
    //Mob spesifik method
    public void aggro() {
        if(isHostile){
            System.out.println(this.getName() + " is now Hostile and attacks you!");
        } 
    }
}