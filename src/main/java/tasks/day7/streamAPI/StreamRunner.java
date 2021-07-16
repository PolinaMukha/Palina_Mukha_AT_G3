package main.java.tasks.day7.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamRunner {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        System.out.println(list.stream().filter(x -> x.equals("мама")).count());
        System.out.println(list.stream().filter("мама"::equals).count());
        System.out.println(list.stream().findFirst().orElse("мама"));
        System.out.println(list.stream().filter("мама"::equals).findFirst().get());
        System.out.println(list.stream().skip(4).findFirst().get());

/*        String[] mas = (String[]) list.stream().skip(2).limit(2).toArray();
        System.out.println(mas);*/

        System.out.println(list.stream().distinct().filter(s -> s.contains("м")).collect(Collectors.toList()));
    }
}
