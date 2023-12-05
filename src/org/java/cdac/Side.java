package org.java.cdac;

 public class Side {
    private String name;
    private double cost;

     public Side(double cost) {
         this.cost = cost;
     }

     public Side(String name) {
        this.name = name;
        //this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return 129;
    }
     public void setCost(double cost) {
         this.cost = cost;
     }
    @Override
    public String toString() {
        String sideDetails = "Side - " + name + " - " + String.format("%.2f", getCost());
        return sideDetails;
    }


 }