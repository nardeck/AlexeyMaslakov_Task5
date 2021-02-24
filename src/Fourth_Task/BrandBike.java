package Fourth_Task;
public enum BrandBike {
    RIZER("Phantom 3.0", "Switzerland", 2015),
    GT("Avalanche", "USA", 2020),
    CANNONDALE("QUICK CX 4", "USA", 2019),
    AIST("PRIME", "Belarus", 2016),
    STELS("Adrenalin MD - 510", "Russian", 2020),
    FUJI("Inari", "Japan", 2020),
    LTD("Crossfire 840", "Germany", 2021);

    private String model;
    private String countryOfManufacture;
    private int yearOfRelease;


    BrandBike(String model, String countryOfManufacture, int yearOfRelease) {
        this.model = model;
        this.countryOfManufacture = countryOfManufacture;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder("BrandBike{");
        stringBuilder.append("name='").append(model).append('\'').append(", countryOfManufacture='").append(countryOfManufacture).append('\'').append(", yearOfRelease=").append(yearOfRelease).append('}');
        System.out.println(stringBuilder);
        return "";
    }

    public String getName() {
        return model;
    }

    public void setName(String name) {
        this.model = name;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;

    }

    public int getDate() {
        return yearOfRelease;
    }

    public void setDate(int date) {
        this.yearOfRelease = date;
    }
}

