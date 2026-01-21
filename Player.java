import java.util.ArrayList;
import java.util.HashMap;  // tambah import ini kalau belum
public class Player extends Entity{
    private int level;
    //private int inventoryCount;    
    private ArrayList<Item> inventory;

    // BARU: Equipment slots pake HashMap
    private HashMap<String, Item> equipment;

    public Player(String nm, int health, int x, int y, int z, int level) {
        super(nm, health, x, y, z);
        this.level = level;
        this.inventory = new ArrayList<>(); // Initialize inventory as an empty list
        this.equipment = new HashMap<>();  // init HashMap kosong
        //this.inventoryCount = 0;
    }

    // Method equip item ke slot tertentu
    public void equipItem(String slot, Item item) {
        // Optional: cek kalau slot valid (bisa ditambah validasi nanti)
        if (slot == null || slot.trim().isEmpty()) {
            System.out.println("Slot nama gak boleh kosong bro!");
            return;
        }
        
        // Kalau slot udah ada item, "lepas" dulu ke inventory (opsional)
        if (equipment.containsKey(slot)) {
            Item oldItem = equipment.get(slot);
            inventory.add(oldItem);
            System.out.println("Old " + oldItem.getName() + " moved to inventory.");
        }        
        equipment.put(slot, item);
        System.out.println(getName() + " equipped " + item.getName() + " to " + slot + "!");
    }
    // Method lepas item dari slot → balik ke inventory
    public void unequipItem(String slot) {
        if (equipment.containsKey(slot)) {
            Item removed = equipment.remove(slot);
            inventory.add(removed);
            System.out.println(getName() + " unequipped " + removed.getName() + " → added to inventory.");
        } else {
            System.out.println("No item in " + slot + " slot!");
        }
    }
    // Tampilkan equipment
    public void showEquipment() {
        System.out.println("\n=== " + getName() + "'s Equipment ===");
        if (equipment.isEmpty()) {
            System.out.println("No gear equipped yet... naked mode on!");
        } else {
            for (String slot : equipment.keySet()) {
                Item item = equipment.get(slot);
                System.out.println(slot.toUpperCase() + ": " + item);
            }
        }
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
    
    // Update displayStatus biar tampilkan equipment count juga
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Level       : " + level);
        System.out.println("Inventory   : " + inventory.size() + " items");
        System.out.println("Equipped    : " + equipment.size() + " pieces");
    }

    // Getter kalau butuh (misal buat combat nanti)
    public HashMap<String, Item> getEquipment() {
        return equipment;
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
