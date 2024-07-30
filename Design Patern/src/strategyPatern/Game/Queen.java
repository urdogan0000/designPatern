package strategyPatern.Game;

public class Queen extends Character{


    Queen(){
        weaponBehavior=new KnifeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
