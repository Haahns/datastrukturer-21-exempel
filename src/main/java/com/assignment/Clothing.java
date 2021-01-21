package com.assignment;

public class Clothing extends Thing {

    private String size;

    private ClothingCategory category = ClothingCategory.STANDARD;

    private double priceModifier = 1;


    public Clothing(String name, double price, ClothingCategory category) {
        this(name, price);
        this.category = category;

        /*if (category == ClothingCategory.DEMO_PRODUCT) {
            priceModifier = 0.8;
        }*/

        switch (category) {
            case DEMO_PRODUCT:
                priceModifier = 0.8;
                break;

            case CUSTOMIZED:
                priceModifier = 1.1;
                break;

            default:
                break;
        }

    }
    public Clothing(String name, double price) {
        super(name);

        super.price = price;
    }

    @Override
    public double getPrice() {
        return price * priceModifier;
    }

    public String getName() {
        String addInfo = "";

        if (priceModifier != 1) {
            addInfo = String.format(" (%s: %+.0f %%)",
                    category,
                    (priceModifier-1)*100
            );
        }

        return super.getName() + addInfo;
    }

}
