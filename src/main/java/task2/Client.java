package task2;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

enum Sex {
    MALE, FEMALE
}

@Builder @Getter @Setter
public class Client {
    private static int count = 0;
    private int id;
    private int age;
    private String name;
    private String email;
    private Sex sex;

    public Client(int age, String name,String email, Sex sex) {
        this.id = ++count;
        this.age = age;
        this.name = name;
        this.email = email;
        this.sex = sex;
    }
}
