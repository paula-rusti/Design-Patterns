package org.example.abstract_factory;

public class MotorbikeFactory implements VehicleFactory{

    public Vehicle create(){
        return new Motorbike();
    }
}
