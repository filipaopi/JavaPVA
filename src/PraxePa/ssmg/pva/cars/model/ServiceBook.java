package PraxePa.ssmg.pva.cars.model;

import java.util.ArrayList;

public class ServiceBook// extends Car
{

    private ArrayList<String> serviceBook = new ArrayList<>();
    private final Car car;

    public ServiceBook(Car car) {
        this.car = car;
        car.setServiceBook(this);
    }

    public void addRecord(String s) {
        serviceBook.add(s);
    }

    public String getRecords() {
        StringBuilder sb = new StringBuilder();
        for (String record : serviceBook) {
            sb.append(record).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return getRecords();
    }
}