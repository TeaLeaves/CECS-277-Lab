public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        //YOUR CODE to add toppings: "Diced onion", "Sliced mushrooms",  and "Sliced red pepper".
        toppings.add("Diced Onion");
        toppings.add("Sliced mushrooms");
        toppings.add("Sliced red pepper");
    }

    @Override
    public void prepare() {
        //Display the following output: "Add Pepporonie !!"
        System.out.println("Add Pepporonie!!");
    }

    @Override
    public void bake() {
        //Display the following output: "Bake Pepporonie Pizza !!"
        System.out.println("Bake Pepporonie Pizza !!");
    }

    public String toString() {  //display the following output: name, dough, sauce and toppings
        //Using StringBuffer
        StringBuffer strb = new StringBuffer();
        strb.append(name + "," + dough + "," + sauce + "," + toppings);
        return strb.toString();
    }
}