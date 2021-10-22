package Week1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SecondSmallest2 {
    public static void main(String[] args) {
        System.out.print(" Enter N: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] arr = new double[n];
        IntStream.range(0,n).forEach(i -> arr[i] = in.nextDouble());

        double minNumber = Arrays.stream(arr)
                .min()
                .getAsDouble();
        long sizeWithoutMin = Arrays.stream(arr)
                .filter(x -> x>minNumber)
                .count();
        if(sizeWithoutMin==arr.length-1){
            System.out.println(
                    Arrays.stream(arr)
                            .filter(x -> x>minNumber)
                            .min().getAsDouble()
            );
        }else{
            System.out.println(minNumber);
        }

    }
}
