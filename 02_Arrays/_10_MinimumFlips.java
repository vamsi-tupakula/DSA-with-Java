import java.util.Scanner;

public class _10_MinimumFlips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        minimumFlips(arr, size);

        sc.close();
    }

    private static void minimumFlips(int[] arr, int n) {
        for(int i=1;i<n;i++) {
            if(arr[i] != arr[i-1]) {
                if(arr[i] != arr[0]) {
                    System.out.print("from " + i + " to ");
                } else {
                    System.out.print(i-1);
                    System.out.println();
                }
            }
        }

        if(arr[n-1] != arr[0]) {
            System.out.println(n-1);
            System.out.println();
        }
    }
}
