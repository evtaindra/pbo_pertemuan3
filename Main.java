public class Main {

    public static void main(String[] args){
       Player alex = new Player("Alex", 100, 10, 70, 5, 5);

        alex.displayStatus();

        Item diamondHelm = new Item("Diamond Helmet", 363);
        Item netheriteChest = new Item("Netherite Chestplate", 592);

        alex.equipItem("helmet", diamondHelm);
        alex.equipItem("chestplate", netheriteChest);

        alex.showEquipment();

        alex.unequipItem("helmet");

        alex.showEquipment();
        alex.showInventory();  // helm seharusnya balik ke inventory

        alex.displayStatus();
    }
}