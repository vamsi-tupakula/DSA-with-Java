import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _16_VowelOrNot {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character : ");
        char ch = sc.next().trim().charAt(0);
        if(list.contains(ch)) {
            System.out.println(ch + " is an vowel...");
        } else {
            System.out.println(ch + " is a consonant...");
        }
        sc.close();
    }
}