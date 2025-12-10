public class Player extends Entity{
    private int level;
    private int inventoryCount;

    public Player(String nm, int health, int x, int y, int z, int level) {
        super(nm, health, x, y, z);
        this.level = level;
        this.inventoryCount = 0;
    }

    //tambahkan item kedalam Inventory
    public void addItem() {
        this.inventoryCount++;
        System.out.println(this.getName() + " Inventory items: " + this.inventoryCount);
    }

    @Override
    public void displayStatus() {
        super.displayStatus();// Pangil dulu fungsi dari induknya/parent
        System.out.println("Level: " + this.level);
        System.out.println("Inventory Count: " + this.inventoryCount);
    }

    public void levelUp() {
        this.level++;
        setHealth(getHealth() + 20);
        System.out.println(this.getName() + " leveled up to Level " + this.level);
    }

}
