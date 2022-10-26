import java.util.Scanner;

/*
 * What is Kadanes algorithm?
 * Kadane's Algorithm is an iterative dynamic programming algorithm which is used to calculate the maximum sum subarray
 * it calculates the maximum sum subarray at a particular position by using the maximum sum subarray at its previous position
 */

public class _07_KadanesAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(kadanesAlgo(arr, size));

        sc.close();
    }

    private static int kadanesAlgo(int[] arr, int n) {
        int curr = 0, sum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            curr += arr[i];
            if(curr > sum) {
                sum = curr;
            } else if(curr < 0) {
                curr = 0;
            }
        }
        return sum;
    }
}