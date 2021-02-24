package Fourth_Task.ParentalClass;
import Fourth_Task.BrandBike;
import Interface.Movable;
import java.util.Date;
import java.util.Objects;

    public abstract class Bike implements Movable {

        protected String color;
        protected String nameOfTheOwner;
        protected BrandBike brandBike;
        protected int numberOfSpeeds;
        protected boolean moving;
        protected Date dayOfRelease;

        public Bike() {
        }

        public Bike(String color, String nameOfTheOwner, BrandBike brandBike, int numberOfSpeeds, boolean moving, Date dayOfRelease) {

            this.color = color;
            this.nameOfTheOwner = nameOfTheOwner;
            this.brandBike = brandBike;
            this.numberOfSpeeds = numberOfSpeeds;
            this.moving = moving;
            this.dayOfRelease = dayOfRelease;

        }

        public abstract void methodOfDriving();

       public void stopMoving(int i) {
            switch (i) {
                case 1 -> System.out.println("Bike тормозит задним колесом");
                case 2 -> System.out.println("Bike тормозит передним колесом");
                case 3 -> System.out.println("Bike тормозит обоими колесами");
                default -> System.out.println("Выбирите один из один из трех вариантов : 1,2 или 3");
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Bike)) return false;
            Bike bike = (Bike) o;
            return numberOfSpeeds == bike.numberOfSpeeds && moving == bike.moving && Objects.equals(color, bike.color) && Objects.equals(nameOfTheOwner, bike.nameOfTheOwner) && brandBike == bike.brandBike && Objects.equals(dayOfRelease, bike.dayOfRelease);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color, nameOfTheOwner, brandBike, numberOfSpeeds, moving, dayOfRelease);
        }


        @Override
        public String toString() {
            StringBuilder stringBuilder;
            stringBuilder = new StringBuilder("Bike{");
            stringBuilder.append("color='").append(color).append('\'').append(", nameOfTheOwner='").append(nameOfTheOwner).append('\'').append(", brand=").append(brandBike).append(", numberOfSpeeds=").append(numberOfSpeeds).append(", moving=").append(moving).append(", dayOfRelease=").append(dayOfRelease).append('}');
            System.out.println(stringBuilder);
            return "";
        }
    }


