package main.java.home.netology.javabase.OOP.inheritance.cars.fueltype;

import main.java.home.netology.javabase.OOP.inheritance.cars.VehicleTypeEnum;

public class Hybrid extends VehicleTypeByFuelTypes {

    public Hybrid() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }


}