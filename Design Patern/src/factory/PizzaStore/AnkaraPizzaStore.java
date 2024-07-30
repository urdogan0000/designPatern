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

}
