package PurchaseAndSellOfBike.ModelOfBike;
public enum ModelCityBike {

    Navigator650("STELS", "Navigator650",600),
    Miss_6000("STELS", "Miss_6000",900),
    Cargo("AIST", "Cargo",1000),
    SWING("AIST","SWING",780),
    CrossFire_840("LTD", "CrossFire_840",1230),
    ViaTess_840("LTD", "ViaTess_840",790);


    protected String brandCityBike;
    protected String model;
    protected double price;

    ModelCityBike(String brandCityBike, String model, double price) {
        this.brandCityBike = brandCityBike;
        this.model = model;
        this.price=price;
    }

    public String getBrandCityBike() {
        return brandCityBike;
    }

    public void setBrandCityBike(String brandCityBike) {
        this.brandCityBike = brandCityBike;
    }



    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "" +
                "brandCityBike='" + brandCityBike + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
