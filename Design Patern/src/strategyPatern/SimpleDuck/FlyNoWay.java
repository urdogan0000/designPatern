package strategyPatern.SimpleDuck;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}
