package ProblemSet01;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NestedNumbers2 {
    public static void main(String[] args) {
        IntStream.range(1,5)
                .mapToObj(String::valueOf)
                .map(x-> IntStream.rangeClosed(1,9)
                        .mapToObj(String::valueOf)
                        .map(y -> IntStream.rangeClosed(1,3)
                                .mapToObj(String::valueOf)
                                .map(z->y)
                                .collect(Collectors.joining("")))
                        .collect(Collectors.joining("")))
                .forEach(System.out::println);
    }
}
