package pl.camp.it.anonymous;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", "3", 300000));
        cars.add(new Car("Toyota", "Corolla", 130000));
        cars.add(new Car("Audi", "A7", 500000));
        cars.add(new Car("Skoda", "Fabia", 70000));

        System.out.println(cars);

        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

        System.out.println(cars);

        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });

        System.out.println(cars);

        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getModel().compareTo(o2.getModel());
            }
        });

        System.out.println(cars);

        IService service = new IService() {
            @Override
            public void cos() {
                System.out.println("Cos");
            }

            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
    }
}
