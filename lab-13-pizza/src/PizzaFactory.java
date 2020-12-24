public class PizzaFactory {
    public static Pizza orderPizza(String type) {
        Pizza pizza = null;
        //create a pizza based on the type
        if(type.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza();
        }
        else{
            pizza = new PepperoniPizza();
        }

        pizza.pizzaPrepare();
        return pizza;
    }
}