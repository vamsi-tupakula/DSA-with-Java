import java.util.Scanner;

public class _17_PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        while(i<n) {
            arr[i] = sc.nextInt();
            i++;
        }
        i=1;
        // prefix sum array
        int[] prefix_sum = new int[n];
        prefix_sum[0] = arr[0];
        while(i<n) {
            prefix_sum[i] = prefix_sum[i-1] + arr[i];
            i++;
        }
        System.out.println(getSum(prefix_sum, 2, 5));
        sc.close();
    }

    private static int getSum(int[] prefix_sum, int l, int r) {
        if(l == 0) return prefix_sum[r];
        return prefix_sum[r] - prefix_sum[l-1];
    }
}
