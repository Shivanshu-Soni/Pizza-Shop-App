package org.cdac.main;

import org.java.cdac.*;

import java.text.SimpleDateFormat;
import java.util.*;

public class PizzaShop {
    public Drink[] getDrink() {
        // Scanner sc = new Scanner(System.in);
        Drink[] arr = new Drink[4];
        arr[0] = new Drink("coke", 59);
        arr[1] = new Drink("pepsi", 49);
        arr[2] = new Drink("limca", 40);
        arr[3] = new Drink("mirinda", 39);
        return arr;

    }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("================================================================================================================================");
        System.out.println("|                                **********Welcome to Donimos!**********                                                       |");
        System.out.println("|                                                                                    Donimos pizza Shop                        |");
        System.out.println("|                                                                                    3/98 Kharghar                             |");
        System.out.println("|                                                                                    Opposite Metro Walk                       |");
        System.out.println("| GSTIN: 03AWBPP8756K592                                                             Contact:(+91) 9988876XXX                  |");
        System.out.println("================================================================================================================================");
        System.out.println("Please select your option:");
        System.out.println("1. Add your details");
        System.out.println("2. Add pizza to order");
        System.out.println("3. Add drink to order");
        System.out.println("4. Add side to order");
        System.out.println("5. Add dessert to order");
        System.out.println("6. View order details");
        System.out.println("7. Checkout and exit");
        int choice = scanner.nextInt();
        Order order = new Order();//instance creation
        while (choice != 7) {
            // System.out.println("Enter your choice :");
            switch (choice) {
                case 1:
                    try {
                        scanner.nextLine();
                        System.out.println("Enter your name:");
                        String customerName = scanner.nextLine();
                        scanner.nextLine();
                        System.out.println("Enter your phone:");
                        String phn = scanner.nextLine();
                        System.out.println("Enter your email:");
                        String email = scanner.nextLine();
                        order.addCustomer(new Customer(customerName, phn, email));
                        System.out.println("Customer added ");
                        break;
                    } catch (InputMismatchException | NullPointerException e) {
                        e.printStackTrace();
                    }
                case 2:
                    try {
                        System.out.println("Please enter the name of the pizza:");
                        String name = scanner.next();
                        scanner.nextLine();
                        System.out.println("Please enter the size of the pizza (Small/Medium/Large):");
                        String size = scanner.next();
                        System.out.println("Please enter the toppings (comma separated):");
                        System.out.println("options available are(cheese burst/paneer/mushroom/double cheese)");
                        String toppings = scanner.next();
                        // scanner.next();
                        System.out.println("Would you like to add any extras to your pizza? (Y/N)");
                        String extraOption = scanner.next();
                        List<String> extras = new ArrayList<>();//upcasting
                        while (extraOption.equalsIgnoreCase("Y")) {
                            System.out.println("Please enter the extra:");
                            String extra = scanner.next();
                            extras.add(extra);
                            System.out.println("Would you like to add another extra? (Y/N)");
                            extraOption = scanner.next();
                        }
                        order.addPizza(new Pizza(name, size, toppings, extras));
                        System.out.println("Pizza added to order.");
                        break;
                    } catch (InputMismatchException | NullPointerException e) {
                        e.printStackTrace();
                    }

                case 3:
                    try {
                        System.out.println("Please enter the name of the drink(coke/pepsi):");
                        String drink = scanner.next();
                        if ((drink.equalsIgnoreCase("coke")) || (drink.equalsIgnoreCase("pepsi"))) {
                            System.out.println("Please enter the size of the drink (Small/Large):");
                            String drinkSize = scanner.next();
                            order.addDrink(new Drink(drink, drinkSize));
                            System.out.println("Drink added to order.");
                            break;
                        } else {
                            System.out.println("Drink is not available");
                        }
                    } catch (InputMismatchException | NullPointerException e) {
                        e.printStackTrace();

                    }


                case 4:
                    try {
                        System.out.println("Please enter the name of the side(garlic-bread/stuffed-garlic-bread):");
                        String side = scanner.next();
                        if ((side.equalsIgnoreCase("garlic-bread")) || (side.equalsIgnoreCase("stuffed-garlic-bread"))) {
                            order.addSide(new Side(side));

                            System.out.println("Side added to order.");
                            break;
                        }
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                case 5:
                    try {
                        System.out.println("Please enter the name of the dessert(choco-lava/brownie):");
                        String dessert = scanner.next();
                        if ((dessert.equalsIgnoreCase("choco-lava")) || (dessert.equalsIgnoreCase("brownie")))
                        {
                            order.addDessert(new Dessert(dessert));
                            System.out.println("Dessert added to order.");
                            break;
                        }
                        }
                        catch(Exception e){
                            e.printStackTrace();

                        }

                        case 6:
                            System.out.println(order.getOrderDetails());
                            break;
                        default:
                            System.out.println("Invalid option selected.");
                            break;
                    }
                    try {

                        System.out.println("Please select your next option:");
                        System.out.println("2. Add pizza to order");
                        System.out.println("3. Add drink to order");
                        System.out.println("4. Add side to order");
                        System.out.println("5. Add dessert to order");
                        System.out.println("6. View order details");
                        System.out.println("7. Checkout and exit");

                        choice = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        e.printStackTrace();
                    }
            }
            System.out.println("================================================================================================================================");
            System.out.println("|                           -----------------------Invoice-------------------                                                  |");
            System.out.println("|                                                                                   Donimos pizza Shop                         |");
            System.out.println("|                                                                                   3/98 Kharghar                              |");
            System.out.println("|                                                                                   Opposite Metro Walk                        |");
            System.out.println("GSTIN: 03AWBPP8756K592                                                              Contact:(+91) 9988876XXX                   |");
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date mydate = new Date();
            Calendar calendar1 = Calendar.getInstance();
            String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            System.out.println("Date: " + formatter.format(mydate) + "  " + days[calendar1.get(Calendar.DAY_OF_WEEK) - 1] /*+ "\t\t\t\t\t\t "*/);
            System.out.println("================================================================================================================================");
            if(order.getCustomerDetails()!=null) {
                System.out.println(order.getCustomerDetails());
                System.out.println(order.getOrderDetails());
            }else{
                System.out.println("Please add your details");
            }
            System.out.println("Total cost in Rs : " + order.getTotalCost());
            //System.out.println("");
            System.out.println("=========================================Thank you for visiting Donimos!========================================================");


        }
    }

















