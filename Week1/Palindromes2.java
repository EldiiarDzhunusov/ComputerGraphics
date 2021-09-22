package Week1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Palindromes2 {
    public static void main(String args[]){
        // add your code here
        Scanner in = new Scanner(System.in);
        String str = in.next();
        if(isPalindrome2(str)){
            System.out.println("This number is a palindrome");
        }else
            System.out.println("This number is not a palindrome");


    }

    private static boolean isPalindrome2(String str) {
    // add your code here
        return IntStream.range(0,str.length()/2)
                .allMatch(i -> str.charAt(i) == str.charAt(str.length()-i-1));
}
}
