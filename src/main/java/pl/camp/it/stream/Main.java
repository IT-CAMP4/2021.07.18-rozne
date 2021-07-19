package pl.camp.it.stream;

import pl.camp.it.anonymous.Car;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "3", 300000));
        cars.add(new Car("Toyota", "Corolla", 130000));
        cars.add(new Car("Audi", "A7", 500000));
        cars.add(new Car("Skoda", "Fabia", 70000));

        List<Car> marki = cars.stream().limit(2).collect(Collectors.toList());

        System.out.println(marki);

        IntStream.range(0, 101).map(x -> 100 - x).forEach(x -> System.out.println(x));

        IntStream.range(0, 101)
                .filter(x -> x > 10)
                .filter(x -> x < 20)
                .limit(5)
                .forEach(x -> System.out.println(x));

        List<String> names = new ArrayList<>();
        names.add("Mateusz");
        names.add("Janusz");
        names.add("Artur");
        names.add("Karol");
        names.add("Mateusz");
        names.add("Janusz");
        names.add("Mateusz");

        Map<String, Long> collect = names.stream()
                .filter(n -> n.contains("u"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

        Map<String, Integer> sums = new HashMap<>();

        for(String name : names) {
            if(sums.containsKey(name)) {
                sums.put(name, sums.get(name) + 1);
            } else {
                sums.put(name, 1);
            }
        }

        System.out.println(sums);
    }
}
