import java.util.Scanner;

public class _07_PrimeOrNot {
    public static void main(String[] args) {
        /**
         * Note 1 : Time complexity : O(n)
         * If a number is a prime it must be divisible by 1 and itself only.
         * Note 2 : Time complexity : O(sqrt(n))
         * Every prime number can be expressed in the form of 6n+1 or 6n-1 except 2 and 3
         * Note 3 : Time complexity : O(1)
         * If a number is not a prime then it must be divisible by aleast one number between 1 and sqrt(num)
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :: ");
        int num = sc.nextInt();
        sc.close();
        if(num == 2 || num == 3) {
            System.out.println("num is prime");
            return;
        }
        if(num%2 == 0 || num%3 == 0) {
            System.out.println("num is not a prime");
            return;
        }
        for(int i=5;i<=Math.sqrt(num);i++) {
            if(num%i == 0) {
                System.out.println("num is not a prime");
                return;
            }
        }
        System.out.println("num is prime");
    }    
}