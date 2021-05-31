package application;

import data.MyData;

import java.util.Arrays;
import java.util.Comparator;

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class CobaComprator {
    public static void main(String[] args) {
        Person[] person = {
                new Person("feri",1),
                new Person("sadil",2),
                new Person("xavier",3)
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getId(),o1.getId());
            }
        };

        Arrays.sort(person,comparator);
        System.out.println(Arrays.toString(person));



    }
}
