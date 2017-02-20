package predicate_ex;

/**
 * Created by yevgen on 20.02.17.
 */
public class Person {
    private String firstName;
    private String lastName;

    public Person() {
        this.firstName = "No name";
        this.lastName = "No last name";
    }

    public Person(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
