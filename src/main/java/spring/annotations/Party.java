package spring.annotations;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Party {
    @SneakyThrows
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Person person = new Person("Dmitriy");
        System.out.println(person);

//        System.out.println("person.getClass() = " + person.getClass());
        final Class<?> clazzPerson = Class.forName("spring.annotations.Person");

        Field fieldIsGood = clazzPerson.getField("isGood");
//        System.out.println("fieldIsGood = " + fieldIsGood);

        Constructor constructorPerson = clazzPerson.getConstructor(String.class);
        Person person1 = (Person) constructorPerson.newInstance("Dima");
        System.out.println(person1);

        Field fieldAge = clazzPerson.getDeclaredField("age");
        fieldAge.setAccessible(true);
        fieldAge.setInt(person1, 26);

        System.out.println(person1);

//        MyAnnotation annotation = clazzPerson.getAnnotation(MyAnnotation.class);
//        if (annotation != null) {
//            if (annotation.flag()) {
//                System.out.println("annotation.message() = " + annotation.message());
//            }
//        }


        if (Person.class.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = clazzPerson.getAnnotation(MyAnnotation.class);
            if (annotation.flag()) {
                System.out.println("annotation.message() = " + annotation.message());
            }
        }


    }
}
