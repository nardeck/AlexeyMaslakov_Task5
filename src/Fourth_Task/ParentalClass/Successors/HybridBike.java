package Fourth_Task.ParentalClass.Successors;

import Interface.Movable;
import PurchaseAndSellOfBike.ModelOfBike.ModelHybridBike;

import java.util.Objects;

public class HybridBike implements Movable {

    public final String TIPEOFBIKE = "Hybrid";
    protected ModelHybridBike modelHybridBike;
    private String materialOfFrame;
    private double weighOfBike;
    private double mileAge;
    private double chainLengthening;

    public HybridBike() {
    }

    public HybridBike(ModelHybridBike modelHybridBike) {
        this.modelHybridBike = modelHybridBike;

    }

    public void chainWear() {
        Chain chain = new Chain();
        chain.showWear();
    }

    public void setMileAge(double mileAge) {
        this.mileAge = mileAge;
    }

    @Override
    public void move() {
        System.out.println("I can  move on this bike on the mountain and road");
    }

    public String getMaterialOfFrame() {
        return materialOfFrame;
    }

    public void setMaterialOfFrame(String materialOfFrame) {
        this.materialOfFrame = materialOfFrame;
    }

    public double getWeighOfBike() {
        return weighOfBike;
    }

    public void setWeighOfBike(double weighOfBike) {
        this.weighOfBike = weighOfBike;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HybridBike)) return false;
        HybridBike that = (HybridBike) o;
        return Double.compare(that.getWeighOfBike(), getWeighOfBike()) == 0 && Double.compare(that.mileAge, mileAge) == 0 && Double.compare(that.chainLengthening, chainLengthening) == 0 && Objects.equals(TIPEOFBIKE, that.TIPEOFBIKE) && modelHybridBike == that.modelHybridBike && Objects.equals(getMaterialOfFrame(), that.getMaterialOfFrame());
    }

    @Override
    public int hashCode() {
        return Objects.hash(TIPEOFBIKE, modelHybridBike, getMaterialOfFrame(), getWeighOfBike(), mileAge, chainLengthening);
    }

    @Override
    public String toString() {
        return "HybridBike{" +
                "" + modelHybridBike +
                '}';
    }

    class Chain {

        void showWear() {
            System.out.println("_____");
            chainLengthening = mileAge / 2000;
            if (chainLengthening < 0.5) {
                System.out.println("Цепь гибридного велосипеда находится в нормальном состоянии");
            }
            if (0.5 < chainLengthening && chainLengthening < 0.75) {
                System.out.println("Цепь гибридного велосипеда изношена и ее необходимо заменить");
            }
            if (chainLengthening > 0.75) {
                System.out.println("Цепь гибридного велосипеда сильно изношена,небходимо заменить цепь и проверить состояние задней кассеты");
            }

        }
    }
}


