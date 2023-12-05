package org.java.cdac;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

 public class Order {
    private List<Pizza> pizzas;
    private List<Drink> drinks;
    private List<Side> sides;
    private List<Dessert> desserts;
    private List<Customer> customers;

    public Order() {
        this.pizzas = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.sides = new ArrayList<>();
        this.desserts = new ArrayList<>();
        this.customers = new ArrayList<>();

    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addSide(Side side) {
        sides.add(side);
    }

    public void addDessert(Dessert dessert) {
        desserts.add(dessert);
    }

    public void addCustomer(Customer customer) {

        customers.add(customer);
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Pizza pizza : pizzas) {
            totalCost += pizza.getCost();
        }
        for (Drink drink : drinks) {
            totalCost += drink.getCost();
        }
        for (Side side : sides) {
            totalCost += side.getCost();
        }
        for (Dessert dessert : desserts) {
            totalCost += dessert.getCost();
        }
        return totalCost;
    }


    public String getOrderDetails() {
      // StringBuilder orderDetail = new StringBuilder("Customer details\n");
        if (!customers.isEmpty()) {
          /*  orderDetail.append("Customer:\n");
            for (Customer customer : customers) {
                orderDetail.append(customer.getName()).append(customer.getPhoneNumber()).append(customer.getEmail()).append("\n");
            }*/
            //System.out.println("Your total bill is :");
          /*  Date date = new Date();
             StringBuilder  dateDetail = new StringBuilder("Date :\n");
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

           try {
               dateDetail.append("Date: ").append(formatter.format(date));
               dateDetail.append("\n");
           }catch(IllegalArgumentException e){
               e.printStackTrace();
           }*/

            StringBuilder orderDetails = new StringBuilder("Order Details:\n");
            if (!pizzas.isEmpty()) {
                orderDetails.append("Pizzas: \n");
                for (Pizza pizza : pizzas) {
                    orderDetails.append("- ").append(pizza.getName()).append(" (").append(pizza.getSize()).append("): ").append(pizza.getToppings()).append(" :").append(pizza.getCost()).append("\n");
                    List<String> extras = pizza.getExtras();
                    if (!extras.isEmpty()) {
                        orderDetails.append("  - Extras: \n");
                        for (String extra : extras) {
                            orderDetails.append("    - ").append(extra).append("\n");
                        }
                    }
                }
            }
            if (!drinks.isEmpty()) {

                orderDetails.append("Drinks:\n");
                for (Drink drink : drinks) {
                    orderDetails.append("- ").append(drink.getName()).append(" (").append(drink.getSize()).append("): ").append(drink.getCost()).append("\n");
                }
            }
            if (!sides.isEmpty()) {
                orderDetails.append("Sides:\n");
                for (Side side : sides) {
                    orderDetails.append("- ").append(side.getName()).append(": ").append(side.getCost()).append("\n");
                }
            }
            if (!desserts.isEmpty()) {
                orderDetails.append("Desserts: \n");
                for (Dessert dessert : desserts) {
                    orderDetails.append("- ").append(dessert.getName()).append(": ").append(dessert.getCost()).append("\n");
                }
            }
            // System.out.println("=============================ThankYou for visiting Donimos!=============================");

            return orderDetails.toString();

        }
        return "No such order exist";
    }


    public String getCustomerDetails() {
        if (!customers.isEmpty()) {
            StringBuilder customerDetails = new StringBuilder("Customer details : ");
           // customerDetails.append("Customer:\n");
            for (Customer customer : customers) {
                customerDetails.append(customer.getName()).append(" ,").append(customer.getPhoneNumber()).append(" ,").append(customer.getEmail()).append("\n");
            }return customerDetails.toString();

        }
        return "No customer exists";

    }



}