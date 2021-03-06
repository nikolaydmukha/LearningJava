package home.javarush.javaSyntax.task18.task1821;

import java.util.Optional;
import java.util.stream.Stream;

/* 
Самый дешевый автомобиль
*/

public class Solution {

    public static void main(String[] args) {
        var tesla = Stream.of(
                new Car("Model S", 94_490),
                new Car("Model 3", 50_690),
                new Car("Model X", 99_690),
                new Car("Model Y", 65_000)
        );

        var bmw = Stream.of(
                new Car("X5", 110_000),
                new Car("X3", 54_000),
                new Car("X1", 40_000),
                new Car("X6", 125_000)
        );

        Optional<Car> cheapestCar = getCheapestCar(tesla);
        cheapestCar.ifPresent(System.out::println);

        Optional<Car> cheaperCar = cheapestCar.flatMap(car -> getCheaperCar(bmw, car));
        cheaperCar.ifPresent(System.out::println);
    }

    public static Optional<Car> getCheapestCar(Stream<Car> cars) {
        //напишите тут ваш код
        return cars.min((item1, item2) -> item1.compareTo(item2));
    }

    public static Optional<Car> getCheaperCar(Stream<Car> cars, Car cheapestCar) {
        //напишите тут ваш код
        return cars.filter(item -> item.getPrice() < cheapestCar.getPrice()).findFirst();
    }
}

class Car implements  Comparable<Car>{
    private String name;
    private Integer price;

    public Car(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Автомобиль " + name + ", цена - " + price + " USD";
    }

    @Override
    public int compareTo(Car o) {
        if (this.price > o.price){
            return 1;
        }else if (this.price < o.price) {
            return -1;
        }else {
            return 0;
        }
    }
}
