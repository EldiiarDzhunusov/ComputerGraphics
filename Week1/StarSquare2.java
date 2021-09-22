package Week1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StarSquare2 {
    public static void main(String[] args) {
        IntStream.range(1,5)
                .mapToObj(String::valueOf)
                .map(x -> IntStream.
                        rangeClosed(1,5)
                        .mapToObj(String::valueOf)
                        .map(star->"*")
                        .collect(Collectors.joining("")))
                .forEach(System.out::println);

    }
}
