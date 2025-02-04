package academy.devdojo.maratonajava.ZZBcomportamento.test;

import academy.devdojo.maratonajava.ZZBcomportamento.domain.Car;
import academy.devdojo.maratonajava.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(
            new Car("Black", 2003),
            new Car("Blue", 2025),
            new Car("Purple", 2012)
    );

    public static void main(String[] args) {
        List<Car> blackCars = filter(cars,car -> car.getColor().equalsIgnoreCase("black"));
        System.out.println(blackCars);
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(nums, num -> num % 2 ==0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for(T e:list){
            if(predicate.test(e)){
                filteredList.add(e);;
            }
        }
        return filteredList;
    }
}
