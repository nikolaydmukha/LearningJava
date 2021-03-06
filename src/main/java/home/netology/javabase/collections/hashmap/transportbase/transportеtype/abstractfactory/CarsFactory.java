package home.netology.javabase.collections.hashmap.transportbase.transportеtype.abstractfactory;

import home.netology.javabase.collections.hashmap.transportbase.transportеtype.Car;
import home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.EngineTypes;

public class CarsFactory implements TransportFactory{

    public Car createTransport(String number, String model, String color, EngineTypes engineType) {
        return new Car(number, model, color, engineType);
    }
}
