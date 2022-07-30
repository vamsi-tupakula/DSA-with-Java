import java.util.Arrays;

public class _01_ArraysDemo {
    public static void main(String[] args) {
        /*
         * Array is a collection of similar data items stored at continuous memory
         * locations and elements can be accessed randomly using indices of an array
         */

        //  declaring array
        int[] arr = new int[5];

        // iniliatizing array
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 20;
        arr[4] = 25;

        // accessing elements in an array
        // 1st way ::
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
        // 2nd way ::
        for(int num : arr) {
            System.out.println(num);
        }
        // 3rd way ::
        System.out.println(Arrays.toString(arr));


        // 2D arrays
        // int[][] arr_2d_1 = new int[4][4];
        int[][] arr_2d_2 = {
            {1,2,3},
            {4,5,6,7},
            {8,9}
        };
        // if we try print the length of the 2D array then it will print the number of rows
        for(int i=0;i<arr_2d_2.length;i++) {
            for(int j=0;j<arr_2d_2[i].length;j++){
                System.out.print(arr_2d_2[i][j] + " ");
            }
            System.out.println();
        }
    }
}