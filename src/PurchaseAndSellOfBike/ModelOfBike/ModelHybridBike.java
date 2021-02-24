package PurchaseAndSellOfBike.ModelOfBike;

public enum ModelHybridBike {

    Absolut_1_3("Fuji", "Absolut_1_3", 1200),
    Quick_3("Cannondale", "Quick_3", 850),
    GradeFlateBarElite("GT", "GradeFlateBarElite", 2500),
    Transeo_4("GT", "Transeo_4", 840),
    CrossWay_100("Merida", "CrossWay_100", 1300),
    CrossWay_40_D("Merida", "CrossWay_40_D", 1250);


    private final String model;
    private final double price;
    private String brandHybridBike;

    ModelHybridBike(String brandHybridBike, String model, double price) {
        this.brandHybridBike = brandHybridBike;
        this.model = model;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getBrandHybridBike() {
        return brandHybridBike;
    }

    public void setBrandHybridBike(String brandHybridBike) {
        this.brandHybridBike = brandHybridBike;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "" +
                "brandHybridBike='" + brandHybridBike + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
