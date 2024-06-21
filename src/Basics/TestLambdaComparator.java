package Basics;

import java.util.ArrayList;
import java.util.List;

class Developer{
    String name;
    int id;
    int age;

    public Developer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Developer(String mkyong, int i, int age) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class TestLambdaComparator {

    public static void main(String[] args) {

        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        System.out.println("After Sort");

        //lambda here!
        listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());

        //java 8 only, lambda also, to print the List
        listDevs.forEach((Developer)->System.out.println(Developer.age));
    }

    private static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("mkyong",3 , 33));
        result.add(new Developer("alvin",4 , 20));
        result.add(new Developer("jason",5 , 10));
        result.add(new Developer("iris", 1, 55));

        return result;

    }

}