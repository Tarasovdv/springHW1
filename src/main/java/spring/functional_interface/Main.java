package spring.functional_interface;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i < 0;

        System.out.println("predicate = " + predicate.test(5));
        System.out.println("predicate = " + predicate.test(-4));
        System.out.println("predicate = " + predicate.test(0));

        Supplier<String> stringSupplier = () -> "Ola";
        System.out.println("stringSupplier.get() = " + stringSupplier.get());

        Consumer<String> stringConsumer = i -> System.out.println("i = " + i);
        stringConsumer.accept("Hi");

        FuncInterface functionInterface = s -> System.out.println(s);
        functionInterface.hello("HELLO");

        Integer integer = null;
//        Integer integer = null;
        Optional.ofNullable(integer).ifPresent(System.out::println);

        Integer intFromOptional =  Optional.ofNullable(integer).orElse(6);
        System.out.println(intFromOptional);







    }
}
