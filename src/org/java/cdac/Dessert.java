package org.java.cdac;

 public class Dessert {
    private String name;
    private String size;

    public Dessert(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public Dessert(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public double getCost() {
        double cost = 0;
        switch (getName().toLowerCase()) {
            case "choco-lava":
                cost += 99;
                break;
            case "brownie":
                cost += 119;
                break;

        }
        return cost;
    }

    @Override
    public String toString() {
        return "Dessert - " + name + " - " + String.format("%.2f", getCost());
    }
}
