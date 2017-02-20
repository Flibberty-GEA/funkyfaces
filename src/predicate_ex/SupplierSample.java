package predicate_ex;

import java.util.function.Supplier;

/**
 * Created by yevgen on 20.02.17.
 */
public class SupplierSample {
    public static void main(String[] args) {
        Supplier<Person> personSupplier = Person::new;
        System.out.println(personSupplier.get().toString());
        Person person = personSupplier.get();
        person.setFirstName("Wade");
        person.setLastName("Wilson");
        System.out.println(person.toString());
    }
}
