package org.launchcode;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public static void main(String[] args) {
        // write your code here
        LocalDateTime lastUpdate = LocalDateTime.now();
        System.out.print(lastUpdate+"\n");

        MenuItem potatoSoup = new MenuItem("Potato Soup",4.50, "Creamy potato soup", "appetizer", true);
        MenuItem salad = new MenuItem("Cobb Salad", 4.75, "Cobb salad", "appetizer", true);
        MenuItem meatloaf = new MenuItem("Meatloaf",8.50, "Homemade meatloaf", "main course", false);
        MenuItem chocolatePudding= new MenuItem("Chocolate Pudding",5.0, "Classic chocolate pudding", "dessert", false);

        ArrayList<MenuItem> unorgFullMenu = new ArrayList<>(Arrays.asList(potatoSoup, salad, meatloaf, chocolatePudding));

        ArrayList<MenuItem> appetizers = new ArrayList<>();
        ArrayList<MenuItem> entrees = new ArrayList<>();
        ArrayList<MenuItem> desserts = new ArrayList<>();

            for(MenuItem item: unorgFullMenu){
                if (item.getCategory() == "appetizer"){
                    appetizers.add(item);
                } else if (item.getCategory() == "main course") {
                    entrees.add(item);
                } else if (item.getCategory() == "dessert"){
                    desserts.add(item);
                }
            }

//        System.out.println(appetizers);
        Menu menuApps = new Menu(lastUpdate, appetizers);
        Menu menuEntrees = new Menu (lastUpdate, entrees);
        Menu menuDesserts = new Menu (lastUpdate, desserts);

        System.out.println("Menu: \n Appetizers: \n" + menuApps + "\n Entrees: \n" + menuEntrees
        + "\n Desserts: \n" + menuDesserts);

        menuApps.printItems();

    }
}
