package predicate_ex;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Created by yevgen on 20.02.17.
 */
public class PredicateSamples {

    public static void main(String[] args) {

//        Predicate<String> predicate = (s) -> s.length() > 0;
//        Predicate<String> predicate2 = (s) -> s.length() > 0 && s.contains("S");
//
//        out.println(predicate.test("foo"));             // true
//        out.println(predicate.negate().test("foo"));     // false
//
//        out.println(predicate.and((s) -> s.contains("S")).test("Soo"));
//        out.println(predicate.and((s) -> s.contains("Z")).test("Soo"));
//        out.println(predicate2.test("Soo"));

//        Predicate<Boolean> nonNull = Objects::nonNull;
//        Predicate<Boolean> isNull = Objects::isNull;
//
//        Predicate<String> isEmpty = String::isEmpty;
//        Predicate<String> isNotEmpty = isEmpty.negate();


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Predicate<Integer> predicateForAll = n -> true;

        System.out.println("Print all numbers with loop:");

        for (Integer n : list) {
            if (predicateForAll.test(n)) {
                System.out.println(n + " ");
            }
        }

        System.out.println("Print all numbers without loop:");

        list.stream()
                .filter(predicateForAll)
                .forEach(s -> System.out.println(s));

        Predicate<Integer> predicateForEvenNumbers = n -> n % 2 == 0;

        System.out.println("Print even numbers:");

        list.stream()
                .filter(predicateForEvenNumbers)
                .forEach(s -> System.out.println(s));

        Predicate<Integer> predicateGreaterThanFive = n -> n > 5;

        System.out.println("Print even numbers greater than 5:");

        eval(list, predicateForEvenNumbers.and(predicateGreaterThanFive));
        eval(list, n -> n % 2 == 0 && n > 5);
        eval(list, new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 == 0 && integer > 5) return true;
                else return false;
            }
        });
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        list.stream()
                .filter(predicate)
                .forEach(s -> System.out.println(s));
    }
}
