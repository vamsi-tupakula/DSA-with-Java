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

        System.out.println("Majority Element : " + naiveApp(arr, size));
        System.out.println("Majority Index : " + efficientApp(arr, size));

        sc.close();
    }

    private static int efficientApp(int[] arr, int size) {
        int res=0, count=1;
        for(int i=1;i<size;i++) {
            if(arr[res] == arr[i]) count++;
            else count--;
            
            if(count == 0) {
                count = 1;
                res = i;
            }
        }
        count = 0;
        for(int i=0;i<size;i++) {
            if(arr[res] == arr[i]) count++;
        }
        if(count <= size/2) {
            return -1;
        }
        return res;
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
