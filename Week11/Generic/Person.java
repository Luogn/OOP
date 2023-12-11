import java.util.Objects;

public class Person implements Comparable<Person>  {
    protected String name;
    protected int age;
    protected String address;

    public Person() {}

    /**
     * Constructor.
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Compare.
     */
    public int compareTo(Person p) {
        if (this.equals(p)) {
            return Integer.compare(this.age, p.getAge());
        } else {
            return this.name.compareTo(p.getName());
        }
    }

    /**
     * Check equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Person p = (Person) obj;
        return Objects.equals(this.name, p.name);
    }
}
