package Basics;

import java.util.*;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> stream = list.stream();
        stream.forEach(n -> System.out.print(n));

        list.stream().filter(x -> x % 2 == 0).forEach(System.out::print);

        list.forEach(n -> {
            if(n % 2 == 0){
                System.out.print(n);
            }
        });

        list.stream();
    }
}
