import java.util.Scanner;

public class _08_EvenOddSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(naiveApp(arr, size));
        System.out.println(efficientApp(arr, size));

        sc.close();
    }

    private static int efficientApp(int[] arr, int size) {
        int res = 1;
        int curr = 1;
        for(int j=1;j<size;j++) {
            if((arr[j]%2 == 0 && arr[j-1]%2 != 0) || (arr[j]%2 != 0 && arr[j-1]%2 == 0)) {
                curr++;
                res = Math.max(curr, res);
            } else {
                curr = 1;
            }
        }
        return res;
    }

    private static int naiveApp(int[] arr, int n) {
        int res = 1;
        for(int i=0;i<n-1;i++) {
            int curr = 1;
            for(int j=i+1;j<n;j++) {
                if((arr[j]%2 == 0 && arr[j-1]%2 != 0) || (arr[j]%2 != 0 && arr[j-1]%2 == 0)) {
                    curr++;
                } else {
                    break;
                }
            }
            res = Math.max(curr, res);
        }
        return res;
    }
}
