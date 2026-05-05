package decorator;

public class PizzaSimples implements Pizza {

    @Override
    public double getPreco() {
        return 20.0;
    }

    @Override
    public String getDescricao() {
        return "Pizza simples";
    }
}