package academy.devdojo.maratonajava.ZZBcomportamento.test;

import academy.devdojo.maratonajava.ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(
            new Car("Black", 2003),
            new Car("Blue", 2025),
            new Car("Purple", 2012)
    );

    public static void main(String[] args) {
        System.out.println(filterCarByColor(cars,"Blue"));
        System.out.println(filterCarByYear(cars,2013));
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color){
        List<Car> carrosFiltrados = new ArrayList<>();
        for(Car car : cars){
            if(car.getColor().equals(color)){
                carrosFiltrados.add(car);
            }
        }
        return carrosFiltrados;
    }

    private static List<Car> filterCarByYear(List<Car> cars, int year){
        List<Car> carrosFiltrados = new ArrayList<>();
        for(Car car : cars){
            if(car.getYear() < year){
                carrosFiltrados.add(car);
            }
        }
        return carrosFiltrados;
    }
}
