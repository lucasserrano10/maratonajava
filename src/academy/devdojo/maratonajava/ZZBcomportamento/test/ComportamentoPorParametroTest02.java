package academy.devdojo.maratonajava.ZZBcomportamento.test;

import academy.devdojo.maratonajava.ZZBcomportamento.domain.Car;
import academy.devdojo.maratonajava.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(
            new Car("Black", 2003),
            new Car("Blue", 2025),
            new Car("Purple", 2012)
    );

    public static void main(String[] args) {
//        List<Car> blackCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equalsIgnoreCase("black");
//            }
//        });
//        System.out.println(blackCars);

        List<Car> blackCars = filter(cars,car -> car.getColor().equalsIgnoreCase("black"));
        System.out.println(blackCars);

    }


    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> carrosFiltrados = new ArrayList<>();
        for(Car car : cars){
            if(carPredicate.test(car)){
                carrosFiltrados.add(car);
            }
        }
        return carrosFiltrados;
    }
}
