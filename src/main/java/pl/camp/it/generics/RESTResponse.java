package pl.camp.it.generics;

public class RESTResponse<T> {
    T o;
    String message;
    int code;

    public T getO() {
        return o;
    }

    public void setO(T o) {
        this.o = o;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
