import java.util.Scanner;

public class _14_SubarrayWithNonFixedSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        int sum = sc.nextInt();

        System.out.println(subarray_anylength(arr, size, sum));
        sc.close();
    }

    private static boolean subarray_anylength(int[] arr, int n, int sum) {
        int curr=0,i=0,j=0;
        while(i < n && j<n) {
            curr = curr + arr[i];
            if(sum > curr) {
                curr += arr[i];
                i++;
            } else if(sum == curr) {
                return true;
            } else {
                while(j < i) {
                    curr = curr - arr[j];
                    if(sum == curr) {
                        return true;
                    } else if(sum > curr) {
                        break;
                    }
                    j++;
                }
            }
        }
        return false;
    }
}
