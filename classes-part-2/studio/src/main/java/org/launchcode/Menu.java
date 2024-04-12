package org.launchcode;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Menu {
    //fields
    private LocalDateTime lastUpdated;
    private static ArrayList<MenuItem> items;
    //constructors
    public Menu(LocalDateTime localDateTime, ArrayList<MenuItem> item) {
        this.lastUpdated = localDateTime;
        this.items = item;
    }
    public Menu(LocalDateTime localDateTime){
        this.lastUpdated = localDateTime;
    }
    //getters and setters
    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    //methods
    public static void addItem (MenuItem item){
        items.add(item);
        System.out.println(item.toString());
    }
}


