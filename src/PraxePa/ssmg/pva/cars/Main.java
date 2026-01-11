package PraxePa.ssmg.pva.cars;

import PraxePa.ssmg.pva.cars.model.Car;
import PraxePa.ssmg.pva.cars.model.ServiceBook;
import PraxePa.ssmg.pva.cars.data.TimeSpan;

public class Main {

    public static void main(String[] args)
    {
        Car car1 = new Car("Volkswagen", "Polo", 2010, "");
        System.out.println(car1);
        System.out.println("Počet aut: " + Car.getNumberOfExistingCars());
        Car car2 = new Car("Chevrolet", "Corvette", 1980, "");
        System.out.println(car2);
        System.out.println("Počet aut: " + Car.getNumberOfExistingCars());

        System.out.println();
        System.out.println();
        System.out.println();

        ServiceBook serviceBook1 = new ServiceBook(car1);
        serviceBook1.addRecord("První servisní prohlídka.");
        System.out.println(car1);
        System.out.println("Počet aut: " + Car.getNumberOfExistingCars());
        System.out.printf("Servisní záznamy %s %s:\n%s\n", car1.getManufacturer(), car1.getModelName(), car1.getServiceBook());
        ServiceBook serviceBook2 = new ServiceBook(car2);
        serviceBook2.addRecord("První servisní prohlídka.");
        serviceBook2.addRecord("Porucha motoru.");
        System.out.println(car2);
        System.out.println("Počet aut: " + Car.getNumberOfExistingCars());
        System.out.printf("Servisní záznamy %s %s:\n%s\n", car2.getManufacturer(), car2.getModelName(), car2.getServiceBook());

        System.out.println();
        System.out.println();
        System.out.println();

        TimeSpan t1 = new TimeSpan(0, 0, 130);
        System.out.println("T1: " + t1);
        t1 = new TimeSpan(130);
        System.out.println("T1: " + t1);
        TimeSpan t2 = new TimeSpan(t1).add(70);
        System.out.println("T1: " + t1);
        System.out.println("T2: " + t2);
        System.out.printf("Časy se %s.\n", t1.equals(t2) ? "rovnají" : "nerovnají");
        t1 = t1.add(70);
        System.out.println("T1: " + t1);
        System.out.println("T2: " + t2);
        System.out.printf("Časy se %s.\n", t1.equals(t2) ? "rovnají" : "nerovnají");


    }
}
