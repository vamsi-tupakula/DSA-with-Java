import java.util.*;

public class _05_Conditionals {
    public static void main(String[] args) {
        /**
         * Conditional statements help us to perform actions only when some condition
         * satisfies.
         */

        // program to check whether a person is adult or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Yes, the person is an adult");
        } else if (age <= 0) {
            System.out.println("Invalid!!! age entered");
        } else {
            System.out.println("No, the person is not an adult");
        }
        sc.close();
    }
}