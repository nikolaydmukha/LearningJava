package home.netology.javabase.OOP.polymorphism.game.weapon;

public class PM extends Weapon {

    public PM(String name) {
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println("PM shoot");
    }
}
