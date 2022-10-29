import java.util.Scanner;

public class _15_Nbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printNbonacci(n ,m);
        sc.close();
    }

    private static void printNbonacci(int n, int m) {
        int[] arr = new int[m];
        int curr = 0;
        for(int i=0;i<n-1;i++) {
            arr[i] = 0;
        }
        arr[n-1] = 1;
        curr = 1;
        int i=0;
        int j=n;
        while(j < m) {
            arr[j] = curr;
            curr = curr + arr[j] - arr[i];
            i++;j++;
        }
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
