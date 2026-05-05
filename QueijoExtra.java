package decorator;

public class QueijoExtra extends PizzaDecorator {

    public QueijoExtra(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPreco() {
        return pizza.getPreco() + 5.0;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + ", queijo extra";
    }
}