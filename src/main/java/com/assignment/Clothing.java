package com.assignment;

public class Clothing extends Thing {

    private String size;
    private double priceModifier = 1;

    // Vi instansierar enum-objektet category av typen ClothingCategory
    // (här med väntevärdet STANDARD)
    private ClothingCategory category = ClothingCategory.STANDARD;

    // Konstruktorn kan ta emot enum (ClothingCategory category) som parameter
    public Clothing(String name, double price, ClothingCategory category) {
        this(name, price);
        this.category = category;

        // Vi kan använda enum i en vanlig if-sats...
        if (category == ClothingCategory.DEMO_PRODUCT) {
            priceModifier = 0.8;
        }

        // Men ofta kan det vara mer överskådligt att använda switch!
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

    // Vi överskuggar getPrice från Thing för att få skild prisuträkning för Clothing-objekt
    @Override
    public double getPrice() {
        return price * priceModifier;
    }

    // Vi överskuggar getName för att få med info om hur priset räknats ut
    @Override
    public String getName() {
        String addInfo = "";

        if (priceModifier != 1) {
            // addinfo t.ex. " (DEMO_PRODUCT -20 %)"
            // (eller med den avancerade enum-varianten (Provexemplar -20 %)
            addInfo = String.format(" (%s %+.0f %%)",
                    category,
                    (priceModifier-1)*100
            );
        }

        return super.getName() + addInfo;
    }

}
