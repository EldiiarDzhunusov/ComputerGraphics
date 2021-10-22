package ProblemSet01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MagicSquare2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        IntStream.range(0,arr.length)
                .forEach(x-> IntStream.
                        range(0,arr[0].length)
                        .forEach(y-> arr[x][y] = in.nextInt())
                );
        if(n!=m){
            System.out.println(false);
        }
        else{
            System.out.println(isMagicSquare(arr));

        }

    }
    private static boolean isMagicSquare(int[][] arr) {
        int realSum = IntStream.of(arr[0])
                .sum();
        //diagonal
        final int[] diagonalSums = {0, 0};
        IntStream.range(0, arr.length)
                .forEach(i -> {
                    diagonalSums[0] += arr[i][i];
                    diagonalSums[1] += arr[arr.length - 1 - i][arr.length - 1 - i];
                });
        if (diagonalSums[0] != realSum || diagonalSums[1] != realSum) {
            return false;
        }

        //column
        final int[] columnSums = new int[arr.length];
        IntStream.range(0, arr.length)
                .forEach(row -> {
                    IntStream.range(0, arr.length).
                            forEach(column -> {
                                columnSums[column] += arr[row][column];
                            });
                });

        boolean isSum = IntStream.of(columnSums).
                filter(columnSum -> columnSum == realSum)
                .count() == arr.length;

        //Row
        isSum = Arrays.stream(arr)
                .filter(row -> Arrays.stream(row).sum() == realSum)
                .count()==arr.length;

        return isSum;
    }
}
