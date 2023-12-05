package org.java.cdac;

import java.util.List;

public class Pizza {
    private String name;
    private String size;
    private String toppings;
    private List<String> extras;

    public Pizza(String name, String size, String toppings, List<String> extras) {
        this.name = name;
        this.size = size;
        this.toppings = toppings;
        this.extras = extras;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getToppings() {
        return toppings;
    }

    public List<String> getExtras() {
        return extras;
    }

    public double getCost() {
        double cost = 0;
        switch (size.toLowerCase()) {
            case "small":
                cost += 399;
                break;
            case "medium":
                cost += 599;
                break;
            case "large":
                cost += 799;
                break;
            default:
                cost += 349;
                break;
        }
        String[] toppingList = toppings.split(",");

        for (String topping : toppingList) {
            cost += (toppingList.length * 25);
            for (String extra : extras) {
                switch (extra.toLowerCase()) {
                    case "cheese burst":
                        cost += 79;
                        break;
                    case "paneer":
                        cost += 89;
                        break;
                    case "mushrooms":
                        cost += 99;
                        break;
                    case "double cheese ":
                        cost += 119;
                        break;
                    default:
                        break;
                }
            }

        } return cost;
    }




    public String toString () {
        String pizzaDetails = "Pizza - " + name + " (" + size + ") - " + String.format("%.2f", getCost());
        pizzaDetails += "\nToppings: " + toppings;
        if (extras.size()>0) {
            pizzaDetails += "\nExtras: " + extras;
        }
        return pizzaDetails;
    }
}
