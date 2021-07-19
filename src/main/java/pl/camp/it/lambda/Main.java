package pl.camp.it.lambda;

import pl.camp.it.anonymous.Car;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = new Function<Integer, Integer> () {

            @Override
            public Integer apply(Integer integer) {
                return integer * 7;
            }
        };

        int i = f1.apply(5);

        System.out.println(i);

        Function<Integer, Integer> f2 = (x) -> x*7;

        System.out.println(f2.apply(4));

        BiFunction<Integer, Integer, Double> f3 = (x, y) -> (double) x / (double) y;

        System.out.println(f3.apply(5,8));

        UnaryOperator<Integer> f4 = (x) -> x*7;

        System.out.println(f4.apply(10));

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "3", 300000));
        cars.add(new Car("Toyota", "Corolla", 130000));
        cars.add(new Car("Audi", "A7", 500000));
        cars.add(new Car("Skoda", "Fabia", 70000));

        System.out.println(cars);

        cars.sort((c1, c2) -> c1.getModel().compareTo(c2.getModel()));

        System.out.println(cars);

        Predicate<String> predicate = x -> x.equals("ok");

        System.out.println(predicate.test("ok"));

        Supplier<Car> supplier = () -> new Car("Audi", "A5", 400000);

        System.out.println(supplier.get());

        Consumer<String> consumer = s -> {
            s = s + "cos";
            StringBuilder sb = new StringBuilder();
            sb.append(s).append(" ").append("cos2");
            System.out.println(sb.toString());
        };

        consumer.accept("");
    }
}
