package Fourth_Task.ParentalClass.Successors;
import Fourth_Task.BrandBike;
import Fourth_Task.ParentalClass.Bike;
import Interface.Movable;
import java.util.Date;
import java.util.Objects;

    public class MountainBike extends Bike implements Movable  {

    protected double diameterOfWheels;
    protected double speed;
    private double price;

    public MountainBike() {
    }

    public MountainBike(String color, String nameOfTheOwner, BrandBike brand, int numberOfSpeeds, boolean moving,
                        double diameterOfWheels, Date dayOfRelease) {
        super(color, nameOfTheOwner, brand, numberOfSpeeds, moving, dayOfRelease);

        if (numberOfSpeeds > 27) {
            System.out.println("для данного байка количество передач не должно превышать 27");
        }
        if (numberOfSpeeds < 0) {
            System.out.println("номер передачи не может быть отрицательным");
        }
        this.diameterOfWheels = diameterOfWheels;

    }

    public void move() {
        if (numberOfSpeeds > 0) {
            System.out.println("I can move");
        } else System.out.println("I stopped the MountainBike");
    }

   public void methodOfDriving() {
        if (numberOfSpeeds <= 16) {
            System.out.println("Sitting position");
        } else System.out.println("Standing position");
    }

   public void stopMoving(int i) {
        if (i == 1)
            System.out.println("MountainBike тормозит задним колесом");
        if (i == 2)
            System.out.println("MountainBike тормозит передним колесом");
        if (i == 3)
            System.out.println("MountainBike тормозит обоими колесами");
        if (i <= 0 || i > 3) {
            System.out.println("Выбирите один из один из трех вариантов : 1,2 или 3");
        }
    }

    void speedBike() {
        speed = numberOfSpeeds * 1.7;
        System.out.println("средняя скорость MountainBike на данной передаче равна -  " + speed + "км/ч");
    }

    public void greaseAchain(double tyrePressure) {
        System.out.println("цепь смазана");
        if (tyrePressure < 3.5) {
            System.out.println("давление в камере колеса ниже минимального значения, накачайте колесо до 3.5 Bar");
        } else if (tyrePressure > 4.7) {
            System.out.println("давление в камере колеса выше максимально допустимого значения, стравите лишний воздух до 3.5 Bar");
        } else System.out.println("давление воздуха в камере колеса находится в норме");
    }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof MountainBike)) return false;
            if (!super.equals(o)) return false;
            MountainBike that = (MountainBike) o;
            return Double.compare(that.diameterOfWheels, diameterOfWheels) == 0 && Double.compare(that.speed, speed) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), diameterOfWheels, speed);
        }

    public String toString() {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder("MountainBike{");
        stringBuilder.append("color='").append(color).append(", nameOfTheOwner='").append(nameOfTheOwner).append(", numberOfSpeeds=").append(numberOfSpeeds).append(", moving=").append(moving).append(", diameterOfWheels=").append(diameterOfWheels);
        System.out.println(stringBuilder);
        return "";
    }

    }

