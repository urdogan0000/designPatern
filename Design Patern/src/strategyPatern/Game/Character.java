package strategyPatern.Game;

public abstract class Character {
    WeaponBehavior weaponBehavior;



    public abstract void fight();

    public  void move(){
        System.out.println("Move Character");
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
