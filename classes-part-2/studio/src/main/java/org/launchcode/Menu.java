package org.launchcode;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Menu {
    //fields
    private LocalDateTime lastUpdated;
    private ArrayList<MenuItem> items;
    //constructors
    public String toString(){
        return "\n" + items;
    }
    public Menu(LocalDateTime localDateTime, ArrayList<MenuItem> itemList) {
        this.lastUpdated = localDateTime;
        this.items = itemList;
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
    public void addItem (MenuItem item){
        items.add(item);
    }

    public void printItems(){
        System.out.println("Menu:");
        for (MenuItem menuItems: items){
            System.out.println(menuItems);
        }
        System.out.println();
    }
}


