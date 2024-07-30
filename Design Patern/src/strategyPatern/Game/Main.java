package strategyPatern.Game;

public class Main {
    public static void main(String[] args) {
        Character queen= new Queen();
        queen.move();
        queen.fight();
        WeaponBehavior axe = new AxeBehavior();
        queen.setWeaponBehavior(axe);
        queen.fight();


    }
}