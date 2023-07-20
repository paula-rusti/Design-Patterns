package org.example.abstract_factory;

public class CarFactory implements VehicleFactory{

    public Vehicle create(){
        return new Car();
    }
}
