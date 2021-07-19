package pl.camp.it.generics;

import pl.camp.it.anonymous.Car;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String s = "abc";

        Box<String> box = new Box();
        box.setObject(s);

        String s2 = box.getObject();

        Pair<Integer, Double> pair = new Pair<>();

        pair.setFirst(5);
        pair.setSecond(3.5);

        pair.getFirst();
        pair.getSecond();

        Pair<String, Box> pair2 = new Pair<>();

        pair2.setFirst("dsfgsddfg");
        pair2.setSecond(box);

        pair2.getFirst();
        pair2.getSecond();

        RESTResponse<String> restResponse = new RESTResponse<>();
        restResponse.setO("kasjhdgfka");
        restResponse.setMessage("message");
        restResponse.setCode(200);

        RESTResponse<Car> restResponse1 = new RESTResponse<>();
        restResponse1.setO(new Car("adsf", "asddfg", 234));
        restResponse1.setMessage("asdf");
        restResponse1.setCode(300);

        Box<?> b = metoda1(1);

        //metoda2(new Box<Car>());
        metoda2(new Box<Figure>());
        metoda2(new Box<Circle>());
        metoda2(new Box<Square>());

        metoda3(new Box<Figure>());
        //metoda3(new Box<Circle>());
        metoda3(new Box<Object>());

        Figure f = new Circle();
        //Box<Figure> figureBox = new Box<Circle>();
    }

    public static Box metoda1(int a) {
        switch (a) {
            case 1:
                return new Box<Circle>();
            case 2:
                return new Box<Square>();
            default:
                return null;
        }
    }

    public static void metoda2(Box<? extends Figure> pudelko) {
        //....
    }

    public static void metoda3(Box<? super Figure> pudelko) {
        //...
    }
}
