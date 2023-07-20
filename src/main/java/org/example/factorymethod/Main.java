package org.example.factorymethod;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = CarFactory.create(CarFactory.CarType.BMW);
        System.out.println(vehicle1);

        Vehicle vehicle2 = CarFactory.create(CarFactory.CarType.AUDI);
        System.out.println(vehicle2);
    }
}
