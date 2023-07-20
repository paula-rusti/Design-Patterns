package org.example.abstract_factory;

public interface VehicleFactory {

    public Vehicle create();

    public static VehicleFactory create(VehicleType vehicleType) {
        return switch (vehicleType) {
            case CAR -> new CarFactory();
            case MOTORBIKE -> new MotorbikeFactory();
            default -> throw new IllegalArgumentException("Vehicle type not supported.");
        };

    }

    enum VehicleType {
        CAR,
        MOTORBIKE
    }
}
