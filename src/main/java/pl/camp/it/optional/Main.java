package pl.camp.it.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<User> userBox = getUser();

        User u = userBox.orElse(new User());
        u.getLogin();

        /*User u = userBox.orElseGet(() -> new User());
        userBox.orElseThrow(() -> new IllegalArgumentException());
        userBox.orElse(new User());*/
        /*if(userBox.isPresent()) {
            User u = userBox.get();
            System.out.println("Coś robimy !!");
        }*/
    }

    public static Optional<User> getUser() {
        //wyciąganie usera z bazy
        //User user = new User();

        return Optional.empty();
    }
}
