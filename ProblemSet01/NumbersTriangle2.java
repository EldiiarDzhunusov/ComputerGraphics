package Week1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbersTriangle2 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,7)
                .mapToObj(String::valueOf)
                .map(x -> IntStream.range(0,Integer.parseInt(x))
                        .mapToObj(String::valueOf)
                        .map(y -> x)
                        .collect(Collectors.joining("")))
                .forEach(System.out::println);

    }
}
