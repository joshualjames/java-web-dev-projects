package org.launchcode;

import java.util.ArrayList;

public class Topping extends Ingredient{
    //fields
    private String topping;

    //Constructors
    public Topping(String aName, double aCost, ArrayList<String> someAllergens, String someTopping) {
        super(aName, aCost, someAllergens);
        topping = someTopping;
    }

    //Getters and Setters


    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    //Methods
    @Override
    public String toString() {
        return "Name: " + this.getName() + "\n" +
                "Cost: $" + this.getCost() + "\n" +
                "Allergens: " + this.getAllergens() + "\n" +
                "topping: " + topping + "\n";
    }
}
