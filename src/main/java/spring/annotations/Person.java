package spring.annotations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

//@MyAnnotation(message = "I person num one",flag = true)
@RequiredArgsConstructor

public class Person {
    private final String name;
    private int age;
    public boolean isGood = true;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isGood=" + isGood +
                '}';
    }
}
