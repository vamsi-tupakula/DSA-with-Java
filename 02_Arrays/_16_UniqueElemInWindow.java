import java.util.HashMap;
import java.util.Scanner;

public class _16_UniqueElemInWindow {
    // Print distinct elements in every window of size k
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        while(i<n) {
            arr[i] = sc.nextInt();
            i++;
        }
        int k = sc.nextInt();
        uniqueElems(arr,n,k);
        sc.close();
    }

    private static void uniqueElems(int[] arr, int n, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<k;i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(hm.size());
        int i=1,j=k;
        while(j < n) {
            hm.put(arr[i-1], hm.get(arr[i-1])-1);
            if(hm.get(arr[i-1]) == 0) {
                hm.remove(arr[i-1]);
            }
            hm.put(arr[j], hm.getOrDefault(arr[j], 0) + 1);
            System.out.println(hm.size());
            i++;j++;
        }
    }
}
