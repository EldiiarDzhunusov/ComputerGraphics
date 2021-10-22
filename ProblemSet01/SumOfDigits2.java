package ProblemSet01;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDigits2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] word = in.nextLine().trim().split("");
        try{
            if(word[0].equals("-")){
                word[0] = "0";
                if(word.length>11){
                    int a  = 10/0;
                }
            }else{
                if(word.length>10){
                    int a = 10/0;
                }
            }
            System.out.println(Arrays.stream(word)
                    .mapToInt(i -> Integer.parseInt(i))
                    .sum());

        }catch (Exception e){
            System.out.println("error");
        }

    }
}
