class _04_Searching {
    public static void main(String[] args) {
        int[] arr = {1, 3, 12, 10, 24};
        int key = 12;
        if(linearSeearch(arr,key) == -1) {
            System.out.println(key + " does not exists..");
        } else { 
            System.out.println("key found at index " + linearSeearch(arr,key));
        }

        int[] arr_sorted = {1,2,3,4,5};
        int new_key = -1;
        if(binarySeearch(arr_sorted,new_key) == -1) {
            System.out.println(new_key + " does not exists..");
            return;
        }
        System.out.println("key found at index " + binarySeearch(arr_sorted,new_key));
    }
    private static int binarySeearch(int[] arr, int key) {
        int s = 0;
        int e = arr.length - 1;
        while(s <= e) {
            int mid = (s+e)/2;
            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
    private static int linearSeearch(int[] arr,int key) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}