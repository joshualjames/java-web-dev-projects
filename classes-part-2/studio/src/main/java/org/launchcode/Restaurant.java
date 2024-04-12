package org.launchcode;


import java.time.LocalDateTime;

import static org.launchcode.Menu.addItem;

public class Restaurant {

    public static void main(String[] args) {
        // write your code here
        LocalDateTime lastUpdate = LocalDateTime.now();
        System.out.print(lastUpdate+"\n");

        MenuItem potatoSoup = new MenuItem("Potato Soup",4.50, "Creamy potato soup", "appetizer", true);
//        MenuItem salad = new MenuItem("Cobb Salad", 4.75, "Cobb salad", "appetizer", true);
//        MenuItem meatloaf = new MenuItem("Meatloaf",8.50, "Homemade meatloaf", "main course", false);
//        MenuItem chocolatePudding= new MenuItem("Chocolate Pudding",5.0, "Classic chocolate pudding", "dessert", false);
//        Menu menu = new Menu(lastUpdate, potatoSoup);

        addItem(potatoSoup);
//        menu.addItem(salad);
//        menu.addItem(meatloaf);
//        menu.addItem(chocolatePudding);
//        System.out.println(menu.getLastUpdated());
        System.out.println("hi");


    }
}
