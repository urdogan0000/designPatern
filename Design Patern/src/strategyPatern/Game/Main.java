package strategyPatern.Game;

public class Main {
    public static void main(String[] args) {
        Character queen= new Queen(new AxeBehavior());
        queen.move();
        queen.fight();
        WeaponBehavior knife = new KnifeBehavior();
        queen.setWeaponBehavior(knife);
        queen.fight();


    }
}