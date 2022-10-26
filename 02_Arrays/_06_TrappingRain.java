import java.util.Scanner;

public class _06_TrappingRain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(trappingRainWater(arr, size));

        sc.close();
    }

    private static int trappingRainWater(int[] arr, int n) {
        int[] lMax = new int[n];
        int[] rMax = new int[n];
        lMax[0] = arr[0];
        for(int i=1;i<n;i++) {
            lMax[i] = Math.max(arr[i], lMax[i-1]);
        }
        rMax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--) {
            rMax[i] = Math.max(arr[i], rMax[i+1]);
        }
        int res = 0;
        for(int i=1;i<n-1;i++) {
            res += (Math.min(lMax[i], rMax[i])-arr[i]);
        }

        return res;
    }
}