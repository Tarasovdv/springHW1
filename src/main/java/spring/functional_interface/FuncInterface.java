package spring.functional_interface;

@FunctionalInterface

public interface FuncInterface {
    void  hello (String input);

    default void  bye(){
        System.out.println("Bye");

    }

}
