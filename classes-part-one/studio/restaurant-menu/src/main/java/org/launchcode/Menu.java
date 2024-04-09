package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {
    private ArrayList<MenuItem> appetizers = new ArrayList<>();
    private ArrayList<MenuItem> mainCourses = new ArrayList<>();
    private ArrayList<MenuItem> desserts = new ArrayList<>();
    private Date lastUpdated = new Date();


    MenuItem potatoSoup = new MenuItem("Potato Soup",4.50, "Creamy potato soup", "appetizer");
    MenuItem salad = new MenuItem("Cobb Salad", 4.75, "Cobb salad", "appetizer", true);
    MenuItem meatloaf = new MenuItem("Meatloaf",8.50, "Homemade meatloaf", "main course");
    MenuItem chocolatePudding= new MenuItem("Chocolate Pudding",5.0, "Classic chocolate pudding", "dessert");

    public void addMenuItem (MenuItem item) {
        if (Objects.equals(item.getCategory(), "appetizer")) {
            appetizers.add(item);
        }else if (Objects.equals(item.getCategory(), "main course")) {
            mainCourses.add(item);
        }else if (Objects.equals(item.getCategory(),"dessert")){
            desserts.add(item);
        }
    }

    public ArrayList<MenuItem> getAppetizers() {
        return appetizers;
    }

    public void setAppetizers(ArrayList<MenuItem> appetizers) {
        this.appetizers = appetizers;
    }

    public ArrayList<MenuItem> getMainCourses() {
        return mainCourses;
    }

    public void setMainCourses(ArrayList<MenuItem> mainCourses) {
        this.mainCourses = mainCourses;
    }

    public ArrayList<MenuItem> getDesserts() {
        return desserts;
    }

    public void setDesserts(ArrayList<MenuItem> desserts) {
        this.desserts = desserts;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
