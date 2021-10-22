package Week1;

import java.util.Arrays;
import java.util.Scanner;

public class SplitSentence2 {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the single line text please: ");
        String sentence = console.nextLine();

        splitSentence2Words(sentence);
    }
    private static void splitSentence2Words(String clause) {
        String[] arr = clause.trim().split(" ");
        Arrays.stream(arr)
                .map(x -> x.replaceAll("[^a-zA-Z ]",""))
                .forEach(System.out::println);

    }
}
