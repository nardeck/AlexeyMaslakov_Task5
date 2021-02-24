package Fourth_Task.ParentalClass.Successors;
import Interface.Movable;
import java.util.Objects;

public class RoadBike implements Movable {


    public final String TIPEOFBIKE = "Road";

    private String materialOfFrame;
    private double weighOfBike;
    private double price;

    public RoadBike() {
    }

    public RoadBike(double weighOfBike) {
        this.weighOfBike = weighOfBike;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void move() {
        System.out.println("I can only move on this bike on the road");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoadBike)) return false;
        RoadBike roadBike = (RoadBike) o;
        return Double.compare(roadBike.weighOfBike, weighOfBike) == 0 && Objects.equals(getMaterialOfFrame(), roadBike.getMaterialOfFrame());
    }

    @Override
    public int hashCode() {
        return Objects.hash(TIPEOFBIKE, getMaterialOfFrame(), weighOfBike);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder("RoadBike{TIPEOFBIKE='");
        stringBuilder.append(TIPEOFBIKE).append(", materialOfFrame='").append(materialOfFrame).append(", weighOfBike=").append(weighOfBike).append('}');
        System.out.println(stringBuilder);
        return "";
    }
}



