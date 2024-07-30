package factory.PizzaStore;

public class AnkaraPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
    Pizza pizza = null;

    if(type.equalsIgnoreCase("cheese")){
        pizza=new AnkaraChessePizza();

    }

    return pizza;


    }

    @Override
    public void orderPizza(String type) {

        Pizza pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();



    }
}
