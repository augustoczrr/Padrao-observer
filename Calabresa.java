package decorator;

public class Calabresa extends PizzaDecorator {

    public Calabresa(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPreco() {
        return pizza.getPreco() + 7.0;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", calabresa";
    }
}