package factory.PizzaStore;

public abstract class PizzaStore {

    public abstract Pizza createPizza(String type);

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("Sorry, we don't have that type of pizza.");
        }
    }
}
