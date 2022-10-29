import java.util.Scanner;

public class _13_SumWithSizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int sum = sc.nextInt();

        System.out.println(sumWithSizeK(arr, size, k, sum));
        sc.close();
    }

    private static boolean sumWithSizeK(int[] arr, int n, int k, int sum) {
        if(k > n) {
            System.out.println("sub array length must be greater than array length");
            System.out.print("status : ");
            return false;
        }
        int curr = 0;
        for(int i=0;i<k;i++) {
            curr += arr[i];
        }
        int i=1,j=k;
        while(j < n) {
            curr = curr + arr[j] - arr[i-1];
            if(curr == sum) return true;
            i++;j++;
        }
        return false;
    }
}
