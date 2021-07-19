package pl.camp.it.generics;

public class Main2 {
    public static void main(String[] args) {
        LIFOQueue<Integer> lifoQueue = new LIFOQueue<>();

        lifoQueue.push(4);
        System.out.println(lifoQueue.pop());

        lifoQueue.push(8);
        lifoQueue.push(5);
        lifoQueue.push(3);

        System.out.println(lifoQueue.pop());
        System.out.println(lifoQueue.pop());
        System.out.println(lifoQueue.pop());
        System.out.println(lifoQueue.pop());
        System.out.println(lifoQueue.pop());
    }
}
