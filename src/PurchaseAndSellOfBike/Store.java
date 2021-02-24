package PurchaseAndSellOfBike;
import Interface.Movable;
import PurchaseAndSellOfBike.ModelOfBike.ModelCityBike;
import PurchaseAndSellOfBike.ModelOfBike.ModelHybridBike;
import java.util.List;
import java.util.Objects;

public class Store<T extends Movable> {

    private static double amountOfMoney = 1000;
    private final List<T> listAllModelBike;

    public Store(List<T> listAllModelBike) {
        this.listAllModelBike = listAllModelBike;
    }


    public void printProductCityBike() {
        System.out.println("_______");
        System.out.println("Список городских велосипедов имеющихся в продаже:");
        for (int i = 0; i < listAllModelBike.size(); i++) {
            System.out.println(i + "." + listAllModelBike.get(i));
        }
    }

    public void printProductHybridBike() {
        System.out.println("_______");
        System.out.println("Список гибридных велосипедов имеющихся в продаже:");
        for (int i = 0; i < listAllModelBike.size(); i++) {
            System.out.println(i + "." + listAllModelBike.get(i));
        }
    }


    public void purchaseCityBike(int NumberOfProduct, ModelCityBike modelCityBike, double pay_the_required_amount_of_money) {
        System.out.println("_______");
        if (pay_the_required_amount_of_money < modelCityBike.getPrice()) {
            System.out.println("Внесенной суммы не достаточно для покупки городского велосипеда под номером " + NumberOfProduct);
            System.out.println("Сумма денег в кассе - " + amountOfMoney);
            return;
        }

        if (pay_the_required_amount_of_money == modelCityBike.getPrice()) {
            amountOfMoney += pay_the_required_amount_of_money;
            System.out.println("Велосипед " + modelCityBike + " был продан.");
            listAllModelBike.remove(NumberOfProduct);
            System.out.println("Список оставшихся товаров :");
            for (int j = 0; j < listAllModelBike.size(); j++) {
                System.out.println(j + "." + listAllModelBike.get(j));
            }
            System.out.println("Количество денег в кассе после продажи очередного товара - " + amountOfMoney);
        }

        if (pay_the_required_amount_of_money > modelCityBike.getPrice()) {
            System.out.println("Велосипед " + modelCityBike + " был продан.");
            double change = pay_the_required_amount_of_money - modelCityBike.getPrice();
            System.out.println("Сдача составила - " + change);
            double a = pay_the_required_amount_of_money - change;
            amountOfMoney += a;
            listAllModelBike.remove(NumberOfProduct);
            System.out.println("Список оставшихся товаров :");
            for (int j = 0; j < listAllModelBike.size(); j++) {
                System.out.println(j + "." + listAllModelBike.get(j));
            }
            System.out.println("Количество денег в кассе увеличилось на " + a + " и составляет - " + amountOfMoney);
        }
    }

    public void purchaseHybridBike(int NumberOfProduct, ModelHybridBike modelHybridBike, double pay_the_required_amount_of_money) {
        System.out.println("_______");
        if (pay_the_required_amount_of_money < modelHybridBike.getPrice()) {
            System.out.println("Внесенной суммы не достаточно для покупки гибридного велосипеда под номером " + NumberOfProduct);
            System.out.println("Сумма денег в кассе - " + amountOfMoney);
            return;
        }

        if (pay_the_required_amount_of_money == modelHybridBike.getPrice()) {
            amountOfMoney += pay_the_required_amount_of_money;

            System.out.println("Велосипед " + modelHybridBike + " был продан.");
            listAllModelBike.remove(NumberOfProduct);
            System.out.println("Список оставшихся товаров :");
            for (int j = 0; j < listAllModelBike.size(); j++) {
                System.out.println(j + "." + listAllModelBike.get(j));
            }
            System.out.println("Количество денег в кассе после продажи очередного товара - " + amountOfMoney);
        }
        if (pay_the_required_amount_of_money > modelHybridBike.getPrice()) {
            System.out.println("Велосипед " + modelHybridBike + " был продан.");
            double change = pay_the_required_amount_of_money - modelHybridBike.getPrice();
            System.out.println("Сдача составила - " + change);
            double a = pay_the_required_amount_of_money - change;
            amountOfMoney += a;
            listAllModelBike.remove(NumberOfProduct);
            System.out.println("Список оставшихся товаров :");
            for (int j = 0; j < listAllModelBike.size(); j++) {
                System.out.println(j + "." + listAllModelBike.get(j));

            }
            System.out.println("Количество денег в кассе увеличилось на " + a + " и составляет - " + amountOfMoney);
        }

    }

    public void sellCityBike(ModelCityBike modelCityBike, T modelBike, double pay_the_required_amount_of_money) {

        if (amountOfMoney < pay_the_required_amount_of_money) {
            System.out.println("В кассе не достаточно денег для покупки нового велосипеда на заводе");
            System.out.println("Внесите в кассу недостающую сумму - " + (pay_the_required_amount_of_money - amountOfMoney));
            return;
        }

        System.out.println("_______");
        if (pay_the_required_amount_of_money < modelCityBike.getPrice()) {
            System.out.println("Внесенной суммы не достаточно для покупки в наш магазин на заводе данной модели велосипеда " + modelCityBike);
            System.out.println("Сумма денег в кассе - " + amountOfMoney);
            return;
        }

        if (pay_the_required_amount_of_money == modelCityBike.getPrice()) {
            amountOfMoney -= pay_the_required_amount_of_money;
            System.out.println("Велосипед " + modelCityBike + " был куплен на заводе и добавлен на склад нашего магазина.");
            listAllModelBike.add(modelBike);
            System.out.println("Обновленный список городских моделей после покупки в наш магазин на заводе нового велосипеда :");
            for (int j = 0; j < listAllModelBike.size(); j++) {
                System.out.println(j + "." + listAllModelBike.get(j));
            }
            System.out.println("Количество денег в кассе после покупки на заводе нового товара - " + amountOfMoney);

        }

        if (pay_the_required_amount_of_money > modelCityBike.getPrice()) {
            System.out.println("Велосипед " + modelCityBike + " был куплен на заводе и добавлен на склад нашего магазина.");
            double change = pay_the_required_amount_of_money - modelCityBike.getPrice();
            System.out.println("Вам вернули излишне уплаченные деньги, в количестве - " + change);
            double a = pay_the_required_amount_of_money - change;
            amountOfMoney += a;
            listAllModelBike.add(modelBike);
            System.out.println("Обновленный список городских моделей после покупки в наш магазин на заводе нового велосипеда :");
            for (int j = 0; j < listAllModelBike.size(); j++) {
                System.out.println(j + "." + listAllModelBike.get(j));

            }
            System.out.println("Количество денег в кассе после покупки на заводе нового товара - " + amountOfMoney);

        }
    }

    public void sellHybridBike(ModelHybridBike modelHybridBike, T modelBike, double pay_the_required_amount_of_money) {

        if (amountOfMoney < pay_the_required_amount_of_money) {
            System.out.println("В кассе не достаточно денег для покупки нового велосипеда на заводе");
            System.out.println("Внесите в кассу недостающую сумму - " + (pay_the_required_amount_of_money - amountOfMoney));
            return;
        }

        System.out.println("_______");
        if (pay_the_required_amount_of_money < modelHybridBike.getPrice()) {
            System.out.println("Внесенной суммы не достаточно для покупки в наш магазин на заводе данной модели велосипеда " + modelHybridBike);
            System.out.println("Сумма денег в кассе - " + amountOfMoney);
            return;
        }

        if (pay_the_required_amount_of_money == modelHybridBike.getPrice()) {
            amountOfMoney -= pay_the_required_amount_of_money;
            System.out.println("Велосипед " + modelHybridBike + " был куплен на заводе и добавлен на склад нашего магазина.");
            listAllModelBike.add(modelBike);
            System.out.println("Обновленный список гибридных моделей после покупки в наш магазин на заводе нового велосипеда :");
            for (int j = 0; j < listAllModelBike.size(); j++) {
                System.out.println(j + "." + listAllModelBike.get(j));
            }
            System.out.println("Количество денег в кассе после покупки на заводе нового товара - " + amountOfMoney);

        }

        if (pay_the_required_amount_of_money > modelHybridBike.getPrice()) {
            System.out.println("Велосипед " + modelHybridBike + " был куплен на заводе и добавлен на склад нашего магазина.");
            double change = pay_the_required_amount_of_money - modelHybridBike.getPrice();
            System.out.println("Вам вернули излишне уплаченные деньги, в количестве - " + change);
            double a = pay_the_required_amount_of_money - change;
            amountOfMoney += a;
            listAllModelBike.add(modelBike);
            System.out.println("Обновленный список гибридных моделей после покупки в наш магазин на заводе нового велосипеда :");
            for (int j = 0; j < listAllModelBike.size(); j++) {
                System.out.println(j + "." + listAllModelBike.get(j));

            }
            System.out.println("Количество денег в кассе после покупки на заводе нового товара - " + amountOfMoney);

        }
    }

    public void addMoneyToTheCashier(double money) {
        amountOfMoney += money;
        System.out.println("В кассу добавлено " + money);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Store)) return false;
        Store<?> store = (Store<?>) o;
        return Objects.equals(listAllModelBike, store.listAllModelBike);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listAllModelBike);
    }

    @Override
    public String toString() {
        return "Store{" +
                "listAllModelBike=" + listAllModelBike +
                '}';
    }
}

