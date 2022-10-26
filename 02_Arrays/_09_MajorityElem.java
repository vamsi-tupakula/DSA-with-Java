import java.util.HashMap;
import java.util.Scanner;

public class _09_MajorityElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(naiveApp(arr, size));
        // System.out.println(efficientApp(arr, size));

        sc.close();
    }

    private static int naiveApp(int[] arr, int size) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<size;i++) {
            if(hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        for(int key : hm.keySet()) {
            if(hm.get(key) > (size/2)) {
                return key;
            }
        }
        return -1;
        // do a linear search to get the index of key;
    }
}
