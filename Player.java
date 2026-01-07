import java.util.ArrayList;
public class Player extends Entity{
    private int level;
    //private int inventoryCount;    
    private ArrayList<Item> inventory;

    public Player(String nm, int health, int x, int y, int z, int level) {
        super(nm, health, x, y, z);
        this.level = level;
        this.inventory = new ArrayList<>(); // Initialize inventory as an empty list
        //this.inventoryCount = 0;
    }

    //tambahkan item kedalam Inventory
    public void addItem(Item item) {
       // this.inventoryCount++;
       inventory.add(item);
        System.out.println(this.getName() + " Inventory items: " + item.getName());
        System.out.println("Inventory Size: " + inventory.size());
    }

    public void removeItem(int index) {
       if(index >=0 && index < inventory.size()){
        Item removed = inventory.remove(index);
        System.out.println(this.getName() + " removed item: " + removed.getName());
       }
         else{
          System.out.println("Invalid index. Cannot remove item.");
         }
    }

    public void showInventory(){
        System.out.println("\n==="+ this.getName() + "'s Inventory == ");
        if(inventory.isEmpty()){
            System.out.println("Inventory is empty.");
        } else{
            for(int i=0; i< inventory.size(); i++){
                System.out.println((i+1) + ". " + inventory.get(i).toString());
            }
        }
    }

    @Override
    public void displayStatus() {
        super.displayStatus();// Pangil dulu fungsi dari induknya/parent
        System.out.println("Level: " + this.level);
        //System.out.println("Inventory Count: " + this.inventoryCount);
        System.out.println("Item :" + inventory.size() + " items in Inventory");
    }

    public void levelUp() {
        this.level++;
        setHealth(getHealth() + 20);
        System.out.println(this.getName() + " leveled up to Level " + this.level);
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }
   
}
