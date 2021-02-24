import Fourth_Task.BrandBike;
import Fourth_Task.ParentalClass.Bike;
import Fourth_Task.ParentalClass.Successors.CityBike;
import Fourth_Task.ParentalClass.Successors.HybridBike;
import Fourth_Task.ParentalClass.Successors.MountainBike;
import Fourth_Task.ParentalClass.Successors.RoadBike;
import Interface.Movable;
import PurchaseAndSellOfBike.ModelOfBike.ModelCityBike;
import PurchaseAndSellOfBike.ModelOfBike.ModelHybridBike;
import PurchaseAndSellOfBike.Store;

import java.text.SimpleDateFormat;
import java.util.*;


public class Main {


    public static void main(String[] args) {


        System.out.println();
        Calendar calendar1 = new GregorianCalendar(2015, Calendar.JANUARY, 1);// ввести дату релиза

        Date dayOfRelease1 = calendar1.getTime();

        Bike myBike = new MountainBike("red", "Alexey", BrandBike.RIZER, 27, true, 27, dayOfRelease1);

        SimpleDateFormat formattedCalendar1 = new SimpleDateFormat();
        formattedCalendar1.applyPattern("dd.MM.yyyy");
        System.out.println("День релиза myBike - " + formattedCalendar1.format(dayOfRelease1));
        System.out.println(myBike.toString());
        System.out.println();

        myBike.methodOfDriving();
        myBike.move();
        System.out.println();

        myBike.stopMoving(1);

        Movable myBikeMovable = new MountainBike();
        myBikeMovable.move();
        System.out.println();

        System.out.println();
        Calendar calendar2 = new GregorianCalendar(2016, Calendar.FEBRUARY, 14);// ввести дату релиза
        Date dayOfRelease2 = calendar2.getTime();

        Bike herBike = new CityBike("green", "Alena", BrandBike.AIST, 1, true, 30, dayOfRelease2);

        SimpleDateFormat formattedCalendar2 = new SimpleDateFormat();
        formattedCalendar1.applyPattern("dd.MM.yyyy");
        System.out.println("День релиза herBike - " + formattedCalendar2.format(dayOfRelease2));
        System.out.println(herBike.toString());

        herBike.methodOfDriving();
        herBike.move();
        System.out.println();

        herBike.stopMoving(3);

        Movable herBikeMovable = new CityBike();
        herBikeMovable.move();
        System.out.println();

        HybridBike bike3 = new HybridBike();

        Movable bike3Move = new HybridBike();
        bike3Move.move();
        System.out.println(bike3Move.toString());

        bike3.setWeighOfBike(22);
        bike3.setMaterialOfFrame("Aluminum");
        System.out.println(bike3.toString());

        RoadBike bike4 = new RoadBike();

        Movable bike4Move = new RoadBike();
        bike4Move.move();
        System.out.println(bike4Move.toString());

        bike4.setWeighOfBike(11);
        bike4.setMaterialOfFrame("Carbon");
        System.out.println(bike4.toString());

        CityBike navigator650 = new CityBike(ModelCityBike.Navigator650);
        CityBike miss6000 = new CityBike(ModelCityBike.Miss_6000);
        CityBike cargo = new CityBike(ModelCityBike.Cargo);
        CityBike swing = new CityBike(ModelCityBike.SWING);
        CityBike crossFire840 = new CityBike(ModelCityBike.CrossFire_840);
        CityBike viaTess840 = new CityBike(ModelCityBike.ViaTess_840);

        HybridBike absolut1_3 = new HybridBike(ModelHybridBike.Absolut_1_3);
        HybridBike quick_3 = new HybridBike(ModelHybridBike.Quick_3);
        HybridBike gradeFlateBarElite = new HybridBike(ModelHybridBike.GradeFlateBarElite);
        HybridBike transeo_4 = new HybridBike(ModelHybridBike.Transeo_4);
        HybridBike crossWay_40D = new HybridBike(ModelHybridBike.CrossWay_40_D);
        HybridBike crossWay_100 = new HybridBike(ModelHybridBike.CrossWay_100);


        List<CityBike> listAllModelCityBike = new ArrayList<>();

        listAllModelCityBike.add(0, navigator650);
        listAllModelCityBike.add(1, miss6000);
        listAllModelCityBike.add(2, cargo);
        listAllModelCityBike.add(3, swing);
        listAllModelCityBike.add(4, crossFire840);
        listAllModelCityBike.add(5, viaTess840);

        List<HybridBike> listAllModelHybridBike = new ArrayList<>();

        listAllModelHybridBike.add(0, absolut1_3);
        listAllModelHybridBike.add(1, quick_3);
        listAllModelHybridBike.add(2, gradeFlateBarElite);
        listAllModelHybridBike.add(3, transeo_4);
        listAllModelHybridBike.add(4, crossWay_40D);
        listAllModelHybridBike.add(5, crossWay_100);


        Store<CityBike> allModelCityBike = new Store<>(listAllModelCityBike);
        Store<HybridBike> allModelHybridBike = new Store<>(listAllModelHybridBike);

        allModelCityBike.printProductCityBike();
        allModelCityBike.purchaseCityBike(2, ModelCityBike.Cargo, 100);// поступившей суммы не достаточно
        allModelCityBike.purchaseCityBike(0, ModelCityBike.Navigator650, 600);// поступившая сумма равна стоимости товара

        allModelCityBike.printProductCityBike();
        allModelCityBike.purchaseCityBike(4, ModelCityBike.ViaTess_840, 900);// поступившая сумма больше стоимости товара
        allModelCityBike.printProductCityBike();

        allModelHybridBike.printProductHybridBike();
        allModelHybridBike.purchaseHybridBike(1, ModelHybridBike.CrossWay_100, 300);// поступившей суммы не достаточно
        allModelHybridBike.purchaseHybridBike(3, ModelHybridBike.Transeo_4, 840);// поступившая сумма равна стоимости товара
        allModelHybridBike.purchaseHybridBike(4, ModelHybridBike.CrossWay_100, 1600);// поступившая сумма больше стоимости товара

        allModelCityBike.purchaseCityBike(2, ModelCityBike.SWING, 780);


        allModelCityBike.sellCityBike(ModelCityBike.Navigator650, new CityBike(ModelCityBike.Navigator650), 590);
        allModelCityBike.sellCityBike(ModelCityBike.ViaTess_840, new CityBike(ModelCityBike.ViaTess_840), 790);
        allModelCityBike.sellCityBike(ModelCityBike.SWING, new CityBike(ModelCityBike.SWING), 2000);

        //Закупим на заводе на все деньги, что есть в кассе модель Navigator650
        allModelCityBike.sellCityBike(ModelCityBike.Navigator650, new CityBike(ModelCityBike.Navigator650), 600);
        allModelCityBike.sellCityBike(ModelCityBike.Navigator650, new CityBike(ModelCityBike.Navigator650), 600);
        allModelCityBike.sellCityBike(ModelCityBike.Navigator650, new CityBike(ModelCityBike.Navigator650), 600);
        allModelCityBike.sellCityBike(ModelCityBike.Navigator650, new CityBike(ModelCityBike.Navigator650), 600);
        allModelCityBike.sellCityBike(ModelCityBike.Navigator650, new CityBike(ModelCityBike.Navigator650), 600);
        allModelCityBike.sellCityBike(ModelCityBike.Navigator650, new CityBike(ModelCityBike.Navigator650), 600);
        allModelCityBike.sellCityBike(ModelCityBike.Navigator650, new CityBike(ModelCityBike.Navigator650), 600);
        allModelCityBike.sellCityBike(ModelCityBike.Navigator650, new CityBike(ModelCityBike.Navigator650), 600);
        allModelCityBike.sellCityBike(ModelCityBike.Navigator650, new CityBike(ModelCityBike.Navigator650), 600);
        // Вносим недостающую сумму
        allModelCityBike.addMoneyToTheCashier(100);
        allModelCityBike.sellCityBike(ModelCityBike.Navigator650, new CityBike(ModelCityBike.Navigator650), 600);
        // Продадим 5 городских велосипедов модели  Navigator650 и закупим 3 гибридных велосипеда CrossWay_100
        allModelCityBike.purchaseCityBike(5, ModelCityBike.Navigator650, 600);
        allModelCityBike.purchaseCityBike(5, ModelCityBike.Navigator650, 600);
        allModelCityBike.purchaseCityBike(5, ModelCityBike.Navigator650, 600);
        allModelCityBike.purchaseCityBike(5, ModelCityBike.Navigator650, 600);
        allModelCityBike.purchaseCityBike(5, ModelCityBike.Navigator650, 600);

        allModelHybridBike.sellHybridBike(ModelHybridBike.CrossWay_100, new HybridBike(ModelHybridBike.CrossWay_100), 1300);
        allModelHybridBike.sellHybridBike(ModelHybridBike.CrossWay_100, new HybridBike(ModelHybridBike.CrossWay_100), 1300);

        // проверим состояние цепи гибридного байка при пройденом километраже в 1200 км

        HybridBike chainConditionHybridBike = new HybridBike();
        chainConditionHybridBike.setMileAge(1200);
        chainConditionHybridBike.chainWear();

        // проверим состояние цепи городского байка при том же километраже

        CityBike chainConditionCityBike = new CityBike();
        chainConditionCityBike.setMileAge(1200);
        chainConditionCityBike.chainWear();

    }
}

