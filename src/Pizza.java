public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheese;
    private int addOns = 150;
    private int doorDelivery = 75;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded;
    private boolean isAddOnsAdded;
    private boolean isDoorDeliveryOpted;

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public Pizza(boolean veg) {
        this.veg = veg;
        this.price = (veg) ? 300 : 500;
        basePizzaPrice = this.price;
    }

    public void extraCheese(boolean isExtraCheeseAdded) {
        if (isExtraCheeseAdded) {
            this.extraCheese = 100;
        } else this.extraCheese = 0;
        this.price += extraCheese;
        System.out.println("Extra Cheese: " + extraCheese);

    }

    public void addOns(boolean isAddOnsAdded){
        if (isAddOnsAdded) {
        this.addOns = 150;
    } else this.addOns = 0;
        this.price += addOns;
        System.out.println("Addons: " + addOns);

}

public void doorDelivery(boolean isDoorDeliveryOpted) {
    if (isDoorDeliveryOpted) {
        this.doorDelivery = 75;
    } else this.doorDelivery = 0;
    this.price += doorDelivery;
    System.out.println("Delivery Charges: " + doorDelivery);

}

    public void bill() {
        System.out.println("Total Bill:" + this.price);
    }
}
