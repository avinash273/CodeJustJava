package Basics;

import java.util.ArrayList;
import java.util.List;

public class genericsExample {
    static Character[] charArray = {'a', 'e', 'i', 'o', 'u'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

    public static <T> List<T> arraysToList(T[] array, List<T> list){
        for (T object : array){
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arraysToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arraysToList(boolArray, new ArrayList<>());
        List<Integer> intList = arraysToList(intArray, new ArrayList<>());
        System.out.println(intList.get(0));
    }
}
