package Basics;

import java.util.*;

public class CollectionsExamples {
    public static void main(String[] args) {

        //ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i+10);
        }
        System.out.println(list.indexOf(15));
        System.out.println(list.get(5));
        System.out.println(list.contains(5));

        //Sorting in collections
        Collections.sort(list);
        System.out.println("heree" + list);
        //HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i / 5);
        }
        System.out.println(set);

        //TreeSet is Sorted
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 20; i++) {
            treeSet.add(i / 5);
        }
        System.out.println(treeSet);

        for (int i : treeSet) {
            System.out.println(i);
        }

        //HashMap is not-syncronized
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, i+10);
        }
        for(int key : map.keySet()) {
            System.out.println(map.get(key) + " " + key);
        }

        //HashTable is Syncronized
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
    }
}
