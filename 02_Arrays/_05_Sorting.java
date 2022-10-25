import java.util.Arrays;
import java.util.Scanner;

public class _05_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            int smallest = i;
            for(int j=i+1;j<=n-1;j++) {
                if(arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i=1;i<n;i++) {
            int curr = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > curr) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }
}
