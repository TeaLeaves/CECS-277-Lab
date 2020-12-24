public class ExtraCheese extends PizzaDecorator
{
    public ExtraCheese(PizzaInt decoratedPizza)
    {
        super(decoratedPizza);
    }

    public void makePizza()
    {
        decoratedPizza.makePizza();
        System.out.println("Add Extra Cheese");
    }
}
