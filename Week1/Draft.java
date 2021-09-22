package Week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Draft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print(number + " =");
        while(number%2==0){
            System.out.print(" 2 *");
            number/=2;
        }
        System.out.println(" " +number);

    }
}
