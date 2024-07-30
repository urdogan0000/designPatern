package strategyPatern.Game;

public class Queen extends Character{


    Queen(WeaponBehavior weaponBehavior){
        super(weaponBehavior);

    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}
