package spring.hw.hw1;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Main_HW1 {
    public static void main(String[] args) throws IOException {
        List<String> intCollection = new ArrayList<>();
        intCollection.add("a");
        intCollection.add("b");
        intCollection.add("c");
        intCollection.add("d");
        intCollection.add("e");


        intCollection.stream()
                .forEach(System.out::print);
        System.out.println();

        IntStream.iterate(1, n -> n + 1)
                .limit(3)
                .forEach(System.out::print);
        System.out.println();

        Optional reduced = intCollection.stream()
                .reduce((i1, i2) -> i1 + " " + i2 + "!!!");
        reduced.ifPresent(System.out::print);

        IntStream sumInt = IntStream.of(1, 52, 85, 96, 77, 8);
        System.out.println("\nsumInt.asDoubleStream().sum() = " + sumInt.asDoubleStream().sum());
//        System.out.println("\nsumInt.sum() = " + sumInt.sum());

        File file = new File("src/main/resources/note.txt");

        Files.lines(Paths.get(file.getAbsolutePath()))
                .limit(2)
                .forEach(System.out::println);




    }
}
