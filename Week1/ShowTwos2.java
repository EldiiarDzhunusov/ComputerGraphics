package Week1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ShowTwos2 {
    public static void main(String[] args) {
        //Not working
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n+" = " + showTwos(n));
    }

    public static String showTwos(int number){
        Integer[] arr = new Integer[]{number};
//        Arrays.stream(arr)
//                .map(x -> IntStream.rangeClosed(1,32)
//                        .)

                return "";

    }
}
