import java.util.Scanner;

public class _07_PrimeOrNot {
    public static void main(String[] args) {
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