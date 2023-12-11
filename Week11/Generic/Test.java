import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Nguyen A", 20, null);
        Person person2 = new Person("Nguyen A", 22, null);
        Person person3 = new Person("Le B", 20, null);
        Person person4 = new Person("Le B", 22, null);
        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        List<Person> list2 = Week11.sortGeneric(list);
        for(Person p : list2) {
            System.out.println(p.name + " " + p.age);
        }
    }
}
