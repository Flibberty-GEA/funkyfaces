package predicate_ex;

import java.util.function.Function;

/**
 * Created by yevgen on 20.02.17.
 */
public class FunctionSample {
    public static void main(String[] args) {
        System.out.println("This Function return Integer from String:");
        Function<String, Integer> toInteger = str -> Integer.valueOf(str);
        System.out.println(toInteger.apply("123").getClass().getTypeName());

        System.out.println("This Function parse String to Integer " +
                "and then call method andThen() and return String from Integer:");
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        System.out.println(backToString.apply("123").getClass().getTypeName());

        Function<Integer,String> converter = (i)-> Integer.toString(i);
        Function<String, Integer> reverse = (s)-> Integer.parseInt(s);

        System.out.println("This Function use compose:");
        System.out.println(converter.apply(3).length());
        System.out.println(converter.compose(reverse).apply("30").length());

        System.out.println("This Function use andThen:");
        System.out.println(converter.apply(3).length());
        System.out.println(converter.andThen(reverse).apply(30));

        Function<Integer,Integer> id = Function.identity();
        System.out.println("Function identity returns a function that always returns its input argument:");
        System.out.println(id.apply(3));
    }
}
