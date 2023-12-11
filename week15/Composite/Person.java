package Composite;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String birthDate = "null";
    private String sex;
    private boolean married;
    private Person spouse;
    private List<Person> children;

    public Person() {

    }

    public Person(String name, String sex, boolean married) {
        this.name = name;
        this.sex = sex;
        this.married = married;
        this.spouse = new Person();
        this.children = new ArrayList<>();
    }

    public Person(String name, String birthDate, String sex, boolean married) {
        this.name = name;
        this.birthDate = birthDate;
        this.sex = sex;
        this.married = married;
        this.spouse = new Person();
        this.children = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public boolean isMarried() {
        return this.married;
    }

    public void setSpouse(Person spouse) {
        if(this.married) {
            this.spouse = spouse;
        }
    }

    public Person getSpouse() {
        return this.spouse;
    }

    public String getSpouseName() {
        return this.spouse.getName();
    }

    public List<Person> getChildren() {
        return children;
    }

    public String toString() {
        return "Name: " + name + ", Date of birth: " + birthDate + ", Sex: " + sex;
    }
}