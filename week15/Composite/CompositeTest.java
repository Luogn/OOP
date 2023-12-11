package Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeTest {
    public void getAllPeople(List<Person> people, Person person) {
        people.add(person);
        if(person.isMarried()) {
            people.add(person.getSpouse());
            for(int i=0;i<person.getChildren().size();i++) {
                getAllPeople(people, person.getChildren().get(i));
            }
        }
    }
    public static void main(String[] args) {
        CompositeTest test = new CompositeTest();

        Person james = new Person("James", "Male", true);
        Person hana = new Person("Hana", "Female", true);
        Person ryan = new Person("Ryan", "Male", false);
        Person kai = new Person("Kai", "Male", true);
        Person jeny = new Person("Jenny", "Female", true);

        james.setSpouse(hana);
        hana.setSpouse(james);
        james.addChild(ryan);
        james.addChild(kai);

        Person k1 = new Person("k1", "Female", true);
        Person k_1 = new Person("k_1", "Male", true);
        Person k2 = new Person("k2", "Female", false);
        Person k3 = new Person("k3", "Male", false);
        Person k4 = new Person("k4", "Male", false);

        kai.setSpouse(jeny);
        jeny.setSpouse(kai);
        kai.addChild(k1);
        kai.addChild(k2);
        kai.addChild(k3);
        kai.addChild(k4);

        Person k12 = new Person("k12", "Female", true);
        Person k22 = new Person("k22", "Female", false);
    
        k1.setSpouse(k_1);
        k1.addChild(k12);
        k1.addChild(k22);


        List<Person> listPersonNotMarried = new ArrayList<>();
        List<String> listFamilyHasTwoChildren = new ArrayList<>();
        List<Person> listPersonOfTheLastGeneration = new ArrayList<>();

        List<Person> listPerson = new ArrayList<>();
        List<Integer> listCheck = new ArrayList<>();

        test.getAllPeople(listPerson, james);
        for(int i=0;i < listPerson.size();i++) {
            if(!(listPerson.get(i).isMarried())) {
                listPersonNotMarried.add(listPerson.get(i));
                
            } else {
                if(listPerson.get(i).getChildren().size() == 2) {
                    listFamilyHasTwoChildren.add(listPerson.get(i).getName() + "-" + listPerson.get(i).getSpouseName());
                }

            }
        }


        System.out.println("Person who is not married:");
        for (Person person : listPersonNotMarried) System.out.println("\t" + person);

        System.out.println("\nFamily with two kids:");
        for (String family : listFamilyHasTwoChildren) System.out.println("\t" + family);

        System.out.println("\nYoungest generation:");
        for (Person person : listPersonOfTheLastGeneration) System.out.println("\t" + person);
    
    }
}
