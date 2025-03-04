import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String choice = "";

        while (true) {
            System.out.print("Pick your Choice 'Pizza' or 'Cheese Burst Pizza': ");
            choice = scanner.next().trim();

            if (choice.equalsIgnoreCase("x")) {
                System.out.println("Exiting the program.");
                break;  // Exit the loop and terminate the program
            }
            if (choice.equalsIgnoreCase("Pizza")
                    || choice.equalsIgnoreCase("CheeseBurstPizza"))
            {

                System.out.print("Pizza Type 'Veg'' or 'Non-Veg' : ");
                String input = scanner.next().trim();
                boolean pizzaType = input.equalsIgnoreCase("Veg");

                System.out.print("Extra Cheese 'Yes' or 'No' : ");
                String extraCheese = scanner.next().trim();
                boolean isExtraCheeseAdded = extraCheese.equalsIgnoreCase("Yes");

                System.out.print("Addons 'Yes' or 'No' : ");
                String addOns = scanner.next().trim();
                boolean isAddOnsAdded = addOns.equalsIgnoreCase("Yes");

                System.out.print("Door Delivery 'Yes' or 'No' : ");
                String doorDelivery = scanner.next().trim();
                boolean isDeliveryChargesIncluded = doorDelivery.equalsIgnoreCase("Yes");

                if (choice.equalsIgnoreCase("Pizza")) {

                    Pizza pizza = new Pizza(pizzaType);
                    pizza.extraCheese(isExtraCheeseAdded);
                    pizza.addOns(isAddOnsAdded);
                    pizza.doorDelivery(isDeliveryChargesIncluded);
                    pizza.bill();
                } else if (choice.equalsIgnoreCase("Cheese Burst Pizza")) {

                    cheeseBurstPizza cheeseBurstPizza = new cheeseBurstPizza(pizzaType);
                    cheeseBurstPizza.extraCheese(isExtraCheeseAdded);
                    cheeseBurstPizza.addOns(isAddOnsAdded);
                    cheeseBurstPizza.bill();
                }
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
