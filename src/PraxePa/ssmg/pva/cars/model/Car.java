package PraxePa.ssmg.pva.cars.model;

import java.util.UUID;

public class Car {

    private final String manufacturer;
    private final String modelName;
    private final int year;
    private final String vinCode;
    private final String engineType;
    private ServiceBook carRecords;
    private static int carCount;

    public Car(String manufacturer, String modelName, int year, String engineType) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.year = year;
        this.vinCode = UUID.randomUUID().toString();
        this.engineType = engineType;
    //    this.carRecords = new ServiceBook(this);
        carCount++;
    }

    public static String getNumberOfExistingCars(){
        return String.valueOf(carCount);
    }

    public void setServiceBook(ServiceBook serviceBook){
        this.carRecords = serviceBook;
    }

    @Override
    public String toString() {
        return manufacturer + " " + modelName + " year " + year + " VIN: " + vinCode;
    }

    public String getServiceBook() {
        return carRecords.getRecords();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelName() {
        return modelName;
    }


    //    @Override
//    public boolean equals(String vinCode) {
//        return this.vinCode.super.equals(vinCode);
//    }
}
