import java.util.Scanner;

public class _12_SlidingWindow {
    // find the max sum of subarray with given size k
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(slidingWindow(arr, size, k));
        sc.close();
    }

    private static int slidingWindow(int[] arr, int n, int k) {
        if(k > n) {
            System.out.println("sub array length must be greater than array length");
            System.out.print("status : ");
            return -1;
        }
        int curr=0, max=0;
        for(int i=0;i<k;i++) {
            max += arr[i];
        }
        curr = max;
        int i=1, j=k;
        while(j < n) {
            curr = curr + arr[j] - arr[i-1];
            if(curr > max) {
                max = curr;
            }
            i++;j++;
        }
        return max;
    }
}
