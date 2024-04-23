package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main implements Comparator<Topping> {

    @Override
    public int compare(Topping topping1, Topping topping2) {
        if (topping2.getCost() - topping1.getCost() < 0) {
            return -1;
        } else if (topping2.getCost() - topping1.getCost() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();
//        Comparator comparator = new FlavorComparator();

//        flavors.sort(comparator);

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        flavors.sort(new FlavorComparator());
//        flavors.forEach((f) ->System.out.println(f.getName()));
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        cones.sort(new ConeComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        for (Flavor flavor: flavors){
            System.out.println(flavor.getName());
        }
        System.out.println();
        for (Cone cone: cones){
            System.out.println(cone.getName() + ": " + cone.getCost());
        }
        System.out.println();

        //Toppings
        toppings.sort(new Main());
        for (Topping topping: toppings){
            System.out.println(topping.getName() + ": " + topping.getCost());
        }
    }


}