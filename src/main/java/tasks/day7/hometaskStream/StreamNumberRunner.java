package main.java.tasks.day7.hometaskStream;
import java.util.stream.IntStream;

public class StreamNumberRunner {
    public static void main(String[] args) {
        Double numbers = IntStream.range(1, 20).asDoubleStream().map(x -> x % 2 == 0 ? (x * 2.54) : 0).reduce((x, y) -> x + y).getAsDouble();
        System.out.println(numbers);
    }
}
