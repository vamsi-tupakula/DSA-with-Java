import java.util.Scanner;

public class _11_MaxCircularSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(circularSum(arr, size));

        sc.close();
    }

    private static int circularSum(int[] arr, int n) {
        int normalSum = kadanesAlgo(arr, n);
        if(normalSum < 0) return normalSum;
        int arr_sum = 0;
        for(int i=0;i<n;i++) {
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        int cir_sum = arr_sum + kadanesAlgo(arr, n);
        return Math.max(cir_sum, normalSum);
    }

    private static int kadanesAlgo(int[] arr, int n) {
        int curr = 0, sum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            curr += arr[i];
            if(curr > sum) {
                sum = curr;
            }
            if(curr < 0) curr = 0;
        }
        return sum;
    }
}
