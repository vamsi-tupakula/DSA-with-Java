import java.util.*;

public class _02_MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size : ");
        int size = sc.nextInt();
        System.out.print("Enter your array elements : ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=1;i<size;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max element : " + max);

        sc.close();
    }    
}