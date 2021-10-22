package Week1;

import java.util.Arrays;
import java.util.Scanner;

public class SplitDigits2 {
    public static void main(String[] args) {
        splitDigits();

    }
    private static void splitDigits(){
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().trim().split("");
        if(numbers.length>5){
            System.out.println("Number is too long!");
        }
        else if(numbers.length<5){
            System.out.println("Number is too short!");
        }
        else{
            Arrays.stream(numbers)
                    .forEach(System.out::println);
        }
    }
}
