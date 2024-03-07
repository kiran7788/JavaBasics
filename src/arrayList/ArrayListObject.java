package arrayList;

import java.util.ArrayList;

public class ArrayListObject {

    public static void main(String[] args) {
        ArrayList<Person> alPerson = new ArrayList<Person>();

        Person p1 = new Person("Ranjithkumar", "male", 50);
        Person p2 = new Person("Guru", "Male", 46);
        Person p3 = new Person("Rithika", "Female", 36);

        Person p4 = new Person(); // Creating a new Person object
        p4.setName("RaviKumar");
        p4.setGender("Male");
        p4.setAge(43);

        alPerson.add(p1);
        alPerson.add(p2);
        alPerson.add(p3);
        alPerson.add(p4);
        alPerson.add(new Person("Ranjana", "Female", 25)); // Creating and adding a new Person object
    
    
        System.out.println("from traditional for loop");
        for (int i = 0; i < per.size(); i++) {
            PersonId person = per.get(i);

            System.out.println("---------");
            System.out.println("name: " + person.getName());
            System.out.println("male: " + person.getGender());
            System.out.println("age: " + person.getAge());
        }System.out.println();

        System.out.println("from for");
        for (PersonId person : per) {
            System.out.println("---------");
            System.out.println("name: " + person.getName());
            System.out.println("male: " + person.getGender());
            System.out.println("age: " + person.getAge());
        }System.out.println();

        System.out.println("from Each");
        per.forEach(person -> {
            System.out.println("---------");
            System.out.println("name: " + person.getName());
            System.out.println("male: " + person.getGender());
            System.out.println("age: " + person.getAge());
        }
    }

}
