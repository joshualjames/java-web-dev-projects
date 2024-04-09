package org.launchcode;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean isNew;

    public MenuItem(String name, Double price, String description, String category, Boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public MenuItem(String name, Double price, String description, String category) {
        this(name, price, description, category, false);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }
}
