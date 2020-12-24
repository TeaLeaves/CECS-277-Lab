public class Sausage extends PizzaDecorator
{
    public Sausage(PizzaInt decoratedPizza)
    {
        super(decoratedPizza);
    }

    public void makePizza()
    {
        decoratedPizza.makePizza();
        System.out.println("Add Sausage");
    }
}
