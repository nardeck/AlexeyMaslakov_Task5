package Fourth_Task.ParentalClass.Successors;

import Fourth_Task.BrandBike;
import Fourth_Task.ParentalClass.Bike;
import Interface.Movable;
import PurchaseAndSellOfBike.ModelOfBike.ModelCityBike;

import java.util.Date;
import java.util.Objects;

public class CityBike extends Bike implements Movable {

    protected double speed;
    protected double diameterOfWheels;
    protected ModelCityBike modelCityBike;
    private double mileAge;
    private double chainLengthening;


    public CityBike(ModelCityBike modelCityBike) {
        this.modelCityBike = modelCityBike;

    }

    public CityBike() {

    }

    public CityBike(String color, String nameOfTheOwner, BrandBike brandBike, int numberOfSpeeds, boolean moving, double diameterOfWheels, Date dateOfRelease) {
        super(color, nameOfTheOwner, brandBike, numberOfSpeeds, moving, dateOfRelease);
        this.diameterOfWheels = diameterOfWheels;
    }

    public void methodOfDriving() {
        System.out.println(numberOfSpeeds <= 11 ? "Sitting position" : "Standing position");
    }

    public void move() {
        System.out.println(numberOfSpeeds > 1 ? "I can move on this Bike2" : "I stopped the Bike2");
    }

    public void stopMoving(int i) {
        if (i == 1) {
            System.out.println("CityBike тормозит задним колесом");
        } else if (i == 2) {
            System.out.println("CityBike тормозит передним колесом");
        } else if (i == 3) {
            System.out.println("CityBike тормозит обоими колесами");
        } else System.out.println("Выбирите один из один из трех вариантов : 1,2 или 3");
    }

    void speedBike(double wayOfTime) {
        double way = wayOfTime * speed;
        speed = numberOfSpeeds * 2.3;
        System.out.println("средняя скорость CityBike на данной передаче равна -  " + speed + "км/ч");
        System.out.println("пройденный путь  CityBike за указанное время равен - " + way + "км");
    }

    public void greaseAchain() {
        System.out.println("цепь смазана");

    }

    public void setMileAge(double mileAge) {
        this.mileAge = mileAge;
    }

    public void chainWear() {
        Chain chain = new Chain();
        chain.showWear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CityBike)) return false;
        if (!super.equals(o)) return false;
        CityBike cityBike = (CityBike) o;
        return Double.compare(cityBike.speed, speed) == 0 && Double.compare(cityBike.diameterOfWheels, diameterOfWheels) == 0 && Double.compare(cityBike.mileAge, mileAge) == 0 && Double.compare(cityBike.chainLengthening, chainLengthening) == 0 && modelCityBike == cityBike.modelCityBike;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, diameterOfWheels, modelCityBike, mileAge, chainLengthening);
    }

    class Chain {

        void showWear() {
            System.out.println("_____");
            chainLengthening = mileAge / 2500;
            if (chainLengthening < 0.5) {
                System.out.println("Цепь городского велосипеда находится в нормальном состоянии");
            }
            if (0.5 < chainLengthening && chainLengthening < 0.75) {
                System.out.println("Цепь городского велосипеда изношена и ее необходимо заменить");
            }
            if (chainLengthening > 0.75) {
                System.out.println("Цепь городского велосипеда сильно изношена,небходимо заменить цепь и проверить состояние задней кассеты");
            }

        }

        @Override
        public String toString() {
            return "CityBike{" +
                    "" + modelCityBike +
                    '}';
        }
    }
}

