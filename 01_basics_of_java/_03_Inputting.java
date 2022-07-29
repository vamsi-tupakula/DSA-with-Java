// importing util package to use scanner class
import java.util.*;

public class _03_Inputting {
    public static void main(String[] args) {
        // Taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number :: ");
        int a = sc.nextInt();
        System.out.println(a);

        sc.close();
    }
}