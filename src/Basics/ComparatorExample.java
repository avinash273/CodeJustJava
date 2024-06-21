package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Player {
    private int ranking;
    private String name;
    private int age;

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }
}

public class ComparatorExample {

    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 80);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Ateven", 1);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        for (Player p : footballTeam) {
            System.out.println("Before Sorting: " + p.getAge());
        }
        footballTeam.sort((o1, o2) -> o1.getAge() - o2.getAge());
        footballTeam.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        for (Player p : footballTeam) {
            System.out.println("After Sorting: " + p.getName());
        }
    }
}
