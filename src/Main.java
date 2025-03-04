import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

       Pizza pizza = new Pizza(pizzaType);
       pizza.extraCheese(isExtraCheeseAdded);
       pizza.addOns(isAddOnsAdded);
       pizza.doorDelivery(isDeliveryChargesIncluded);
       pizza.bill();

    }
}
