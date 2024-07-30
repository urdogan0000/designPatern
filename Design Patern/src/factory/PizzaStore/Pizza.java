package factory.PizzaStore;

public abstract class Pizza {

    protected String name;

    protected String dough;

    protected String sauce;

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();




}
