public class Main {
    public static void main(String[] args){
        Character Cecilia = new Character("Evta",2,80);
        System.out.println("Nama karakter: " + Cecilia.getName());
        Cecilia.setName("Cecilia");

        System.out.println("Nama karakter setelah diubah: " + Cecilia.getName());

        System.out.println("Level karakter: " + Cecilia.getLevel());
        
        System.out.println("Health Points karakter: " + Cecilia.getHealthPoints());

        System.out.println("karakter Kena Damage: " + Cecilia.takeDamage(30));
        Cecilia.showinfo();

        System.out.println("karakter Disembuhkan: " + Cecilia.heal(20));
        Cecilia.showinfo();

        System.out.println("Level karakter setelah naik: " + Cecilia.levelUp());
        Cecilia.showinfo();

    }
}