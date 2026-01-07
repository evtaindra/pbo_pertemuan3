public class Item {
    public String name;
    public int durabilty;

    public Item(String name, int durabilty) {
        this.name = name;
        this.durabilty = durabilty;
    }
    // getter
    public String getName() {
        return name;
    }
    public int getDurabilty() {
        return durabilty;
    }
    @Override
    public String toString() {
        return name + " (Durability: " + durabilty + ")";
    }

}
