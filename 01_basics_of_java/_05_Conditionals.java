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

        // program to check whether entered character is vowel or not
        System.out.println("----***----");
        System.out.print("Enter any character :: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));
        switch (ch) {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
            System.out.println("Consonant (not an vowel)");
                break;
        }
        sc.close();
    }
}