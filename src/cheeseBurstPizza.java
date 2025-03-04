public class cheeseBurstPizza extends Pizza{
    public cheeseBurstPizza(boolean veg) {
        super(veg);
        this.setPrice ((veg) ? 500 : 800);
        System.out.println("Cheese Burst Pizza Price: " + this.getPrice());
    }

    @Override
    public void extraCheese(boolean isExtraCheeseAdded) {
        if (isExtraCheeseAdded) {
            this.setExtraCheese(125);
        } else this.setExtraCheese(0);
        this.setPrice(this.getPrice() + this.getExtraCheese());
        System.out.println("Extra Cheese(Cheese Burst): " + this.getExtraCheese());

    }

    @Override
    public void addOns(boolean isAddOnsAdded) {
        if (isAddOnsAdded) {
            this.setAddOns(130);
        } else this.setAddOns(0);
        this.setPrice(this.getPrice() + this.getAddOns());
        System.out.println("AddOns(Cheese Burst): " + this.getAddOns());
    }
    }

