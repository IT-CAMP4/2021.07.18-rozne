package pl.camp.it.anonymous;

public interface IService {
    void cos();
    int add(int a, int b);
    default double divide(double a, double b) {
        return a/b;
    }
}
