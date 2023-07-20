package org.example.factory;

public class CarFactory{

    public static Vehicle create(CarType carType) {
        return switch (carType) {
            case BMW -> new BMW();
            case AUDI -> new Audi();
            default -> throw new IllegalArgumentException("Unknown car type: " + carType);
        };
    }

    public enum CarType {
        BMW, AUDI;
    }
}
