package Week1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AdjacentArrayElements2 {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            String[] arr1 = in.nextLine().trim().split(" ");
            Integer[] arr = new Integer[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                arr[i] = Integer.parseInt(arr1[i]);
            }
            if(arr.length!=10){
                //Need to raise an error
                int a = 10/0;
            }

            System.out.println(IntStream.range(0, arr.length-1)
                    .filter(i ->
                            (arr[i] == arr[i+1]) && (
                                    i+2 >= arr.length || arr[i] != arr[i+2])
                    )
                    .count());
        }catch(Exception e){
            System.out.println("Error");
        }

    }


}
