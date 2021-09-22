package Week1;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShowTwos2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 2 != 0) {
            System.out.println(n+" = "+n);
        } else {
            System.out.println(showTwos(n));
        }
    }

    private static String showTwos(int n) {
        boolean isNegative = n < 0;
        if (isNegative) {
            n *= -1;
        }
        int finalNumber = n;
        int maxPowerOfTwo = IntStream.rangeClosed(1, n)
                .filter(ShowTwos2::isPowerOfTwo)
                .filter(x -> finalNumber % x == 0)
                .max()
                .getAsInt();
        String multiples = IntStream.rangeClosed(1, (int) (Math.log(maxPowerOfTwo) / Math.log(2)))
                .map(x -> 2)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" * "));
        if (!(n / maxPowerOfTwo == 1) | isNegative) {
            if (isNegative) {
                n *= -1;
            }
            multiples += String.format(" * %d", n / maxPowerOfTwo);
        }
        return n+" = "+multiples+"\n";
    }

    private static boolean isPowerOfTwo(int number) {
        double x = Math.log(number) / Math.log(2);
        boolean ans = (int)(Math.ceil(x)) == (int)(Math.floor(x));
        return ans;
    }
}