package ProblemSet01;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorials2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter an integer number: ");
        int number = scanner.nextInt();
        if(number<0){
            System.out.println(" Incorrect input!");
            return;
        }
        System.out.print("X\tX!\n");
            IntStream.rangeClosed(0,number)
                    .forEach(n -> System.out.printf("%d\t%d\n",n,factorialOfN(n)));

    }

    private static long factorialOfN(int n) {
        return IntStream
                .rangeClosed(1,n)
                 .reduce(1,(x,y) -> x*y);
    }
}
