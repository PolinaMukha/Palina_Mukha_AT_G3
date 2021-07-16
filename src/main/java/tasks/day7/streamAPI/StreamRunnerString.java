package main.java.tasks.day7.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamRunnerString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        System.out.println(list.stream().filter(x -> x.equals("мама")).count());
        System.out.println(list.stream().filter("мама"::equals).count());
        System.out.println(list.stream().findFirst().orElse("мама"));
        System.out.println(list.stream().filter("мама"::equals).findFirst().get());
        System.out.println(list.stream().skip(4).findFirst().get());

        System.out.println(list.stream().distinct().filter(s -> s.contains("м")).collect(Collectors.toList()));

        System.out.println(list.stream().anyMatch("мама"::equals));
        System.out.println(list.stream().allMatch(s -> s.contains("м")));
        System.out.println(list.stream().map(s -> s + "м").collect(Collectors.toList()));
        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.split("а"))).filter(s -> !s.equals("")).collect(Collectors.toList()));
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        System.out.println(list.stream().distinct().sorted((x, y) -> - x.compareTo(y)).collect(Collectors.toList()));

        String newString = list.stream().flatMap(s -> Arrays.stream(s.split(""))).peek(System.out::println).max(String::compareTo).get();
        System.out.println(newString);

        System.out.println(list.stream().map(String::length).reduce((x, y) -> x + y).get());
        System.out.println(list.stream().map(String::length).collect(Collectors.summingInt(x -> x % 2 == 1 ? x : 0)));
        System.out.println((Integer) list.stream().map(String::length).mapToInt(x -> x % 2 == 1 ? x : 0).sum()); //the same AS previous one


        System.out.println(list.stream().collect(Collectors.joining(":", "<p>", "</p>")));
    }
}
