package Week1;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Primes2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(IntStream.rangeClosed(2,n)
                .filter(x -> isPrime(x))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));

    }

    // The method that determines whether a number is a prime or not a prime.
    public static boolean isPrime(int num) {
        // write your code here
        if(num==2){
            return true;
        }
        return IntStream.range(2,num)
                .filter(x -> num%x==0)
                .count() == 0;
    }
}