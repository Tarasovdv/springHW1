package spring.annotations.myjunit;

import lombok.SneakyThrows;

import java.lang.reflect.Method;

public class MyJUnitRunner {
    @SneakyThrows
    public static void main(String[] args) {

        int passed = 0;
        int failed = 0;


        final Class<?> clazzTest = Class.forName("spring.annotations.myjunit.MyBeautifulTest");
        Method[] methods = clazzTest.getMethods();
        MyBeautifulTest test = new MyBeautifulTest();
        for (Method method : methods) {
            try {
                if (method.isAnnotationPresent(Test.class)) {
                    method.invoke(test);
                    passed++;
                    System.out.println(method.getName() + " Прошел");
                }

            } catch (Throwable throwable) {
                System.err.println(method.getName() + " Упал");
                failed++;
            }
        }

        System.out.println("___________\n Количество пройденых тестов: " + passed +
                "\n Количество упавших тестов: " + failed + "\n___________");


    }
}
