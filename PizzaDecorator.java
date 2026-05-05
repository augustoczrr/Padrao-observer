package decorator;

public abstract class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPreco() {
        return pizza.getPreco();
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao();
    }
}