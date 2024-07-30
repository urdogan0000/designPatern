package strategyPatern;

public class Main {
    public static void main(String[] args) {
       Duck mallard= new MallardDuck();
       mallard.performQuack();
       mallard.performFly();
       FlyBehavior noFly=new FlyNoWay();
       mallard.setFlyBehavior(noFly);
       mallard.performFly();

    }
}