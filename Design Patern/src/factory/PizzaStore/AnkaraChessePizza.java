package factory.PizzaStore;

public class AnkaraChessePizza  extends Pizza{
    public AnkaraChessePizza() {
        this.name = "Ankara Chesse Pizza";
        this.dough="Ankara chesse pizza dougn";
        this.sauce="Ankara chesse pizza sauce";
    }
    @Override
    public void prepare() {
        System.out.println("Preparing Ankara Chesse Pizza");
        System.out.println("Name: " + name);
        System.out.println("Dough: " + dough);
        System.out.println("Sauce: " + sauce);


    }

    @Override
    public void bake() {
System.out.println("Baking Ankara Chesse Pizza");
    }

    @Override
    public void cut() {
System.out.println("Cutting Ankara Chesse Pizza");
    }

    @Override
    public void box() {
System.out.println("Boxing Ankara Chesse Pizza");
    }
}
