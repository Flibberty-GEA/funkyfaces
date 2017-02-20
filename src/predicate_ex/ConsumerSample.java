package predicate_ex;

import java.util.function.Consumer;

/**
 * Created by yevgen on 20.02.17.
 */
public class ConsumerSample {
    public static void main(String[] args) {
//        List<Person> names = new ArrayList<>();
//        names.add(new Person("Richard", "Dawkins"));
//        names.add(new Person("Richard", "Feynman"));
//        names.add(new Person("Douglas", "Hofstadter"));
//        names.add(new Person("Martin", "Odersky"));

        System.out.println("Use accept:");
        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.getFirstName());
        greeter.accept(new Person("Douglas", "Hofstadter"));

        System.out.println("Use andThen:");
        Consumer<Person> hello = p -> System.out.print("Hello, ");
        Consumer<Person> c = (x) -> System.out.println(x.getFirstName().toUpperCase());
        hello.andThen(c).accept(new Person("Douglas", "Hofstadter"));
    }
}
