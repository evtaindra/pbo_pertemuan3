public class Main {

    public static void main(String[] args){
       Player Player1 = new Player("Alice", 100, 0, 0, 0, 1);
      // Mob zombie = new Mob("Zombie", 50, 10, 5, 2, true);

       Player1.displayStatus();
        Item sword = new Item("Sword", 100);
        Item shield = new Item("Shield", 150);
        Item potion = new Item("Health Potion", 1);
        

       Player1.addItem(sword);
       Player1.addItem(shield);
       Player1.addItem(potion);


        Player1.showInventory();


      // Player1.levelUp();
       //Player1.move(5, 10,9);

     //  zombie.displayStatus();
       //zombie.takeDamage(15);
      // zombie.aggro();
      // zombie.move(3, 4,7);

    //    Entity[] entities = {Player1, zombie};
    //    for (Entity entity : entities) {
    //        entity.displayStatus();
    //        System.out.println("------------");
    //    }
    }
}