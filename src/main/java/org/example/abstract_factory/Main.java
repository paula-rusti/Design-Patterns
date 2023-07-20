package org.example.abstract_factory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory  = VehicleFactory.create(VehicleFactory.VehicleType.CAR);
        Vehicle vehicle1 = factory.create();
        System.out.println(vehicle1.getClass());

        VehicleFactory factory2  = VehicleFactory.create(VehicleFactory.VehicleType.MOTORBIKE);
        Vehicle vehicle2 = factory2.create();
        System.out.println(vehicle2.getClass());
    }
}
