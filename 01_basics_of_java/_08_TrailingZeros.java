import java.util.Scanner;

public class _08_TrailingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        System.out.println(trailingZeros(num));
        sc.close();
    }
    public static int trailingZeros(int n) {
        int res = 0;
        for(int i=5;i<=n;i=i*5) {
            res += n/i;
        }
        return res;
    }
}