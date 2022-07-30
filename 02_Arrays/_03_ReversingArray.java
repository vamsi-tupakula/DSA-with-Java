import java.util.*;

public class _03_ReversingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size : ");
        int size = sc.nextInt();
        System.out.print("Enter your array elements : ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0,j=size-1;
        while(j>=i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }    
}