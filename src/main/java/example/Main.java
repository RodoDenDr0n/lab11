package example;

import lombok.Builder;
import lombok.experimental.SuperBuilder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().name("Oles").build();
    }
}

@SuperBuilder
class Human {
    private String name;
}

@SuperBuilder
class User extends Human {
    private int age;
}
