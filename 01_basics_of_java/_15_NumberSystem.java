public class _15_NumberSystem {
    public static void main(String[] args) {
        int decimal = 10;
        toBinary(decimal);
    }
    private static void toBinary(int decimal){
        int[] ans = new int[40];
        int index = 0;
        while(decimal > 0) {
            ans[index++] = decimal%2;
            decimal /= 2;
        }
        for(int i = index-1;i >= 0; i--) {
            System.out.print(ans[i]);
        }
        System.out.println(); // new line
    }
}