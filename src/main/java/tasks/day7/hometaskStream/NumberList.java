package main.java.tasks.day7.hometaskStream;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class NumberList {
    public static void main(String[] args) {
        int size = 10;
        int min = 1;
        int max = 20;

        List<Integer> list = new Random().ints(size, min, max).boxed().sorted().collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list.stream().map(x -> x % 3 == 0 && x % 5 == 0 ? x : 0).filter(x -> x >= 0).collect(Collectors.toList()));
    }
}
