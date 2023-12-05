package org.java.cdac;

public class Drink {
    private String name;
    private String size;
   private float price;

    public Drink(String name,float price) {
        this.name = name;

        this.price = price;
    }

    public Drink(String name, String size ) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public double getCost() {
        double cost = 0;
        switch (size.toLowerCase()) {
            case "small":
                cost += 59;
                break;
            case "large":
                cost += 99;
                break;
            default:
                cost += 79;
                break;
        }
        return cost;
    }

    @Override
    public String toString() {
        String drinkDetails = "Drink - " + name + " (" + size + ") - " + String.format("%.2f", getCost());
        return drinkDetails;
    }

}