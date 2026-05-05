package decorator;

public class Bacon extends PizzaDecorator {

    public Bacon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPreco() {
        return pizza.getPreco() + 8.0;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", bacon";
    }
}