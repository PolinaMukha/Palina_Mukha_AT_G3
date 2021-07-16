package main.java.tasks.day7.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMAN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMAN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)
        );

        int counter = 0;
        for (Person person : people) {
            if ((person.age >= 18 && person.age <= 55 && person.sex == Person.Sex.WOMAN) || (person.age <= 60 && person.sex == Person.Sex.WOMAN)) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println(people.stream().filter(person -> person.age >= 18 && person.age <= 55 && person.sex == Person.Sex.WOMAN || person.age <= 60 && person.sex == Person.Sex.WOMAN).count());

        people.stream().sorted((x, y) -> {
            if (x.sex != y.sex) {
                return x.sex.compareTo(y.sex);
            }
            return x.age - y.age;
        }).peek(System.out::println).collect(Collectors.toList());

        System.out.println(people.stream().min(Comparator.comparingInt(p -> p.age)).get());

        System.out.println(people.stream().collect(Collectors.toMap(p -> p.hashCode(), p -> p)));

        people.stream().collect(Collectors.groupingBy(p -> p.sex)).keySet().forEach(System.out::println);
    }
}
