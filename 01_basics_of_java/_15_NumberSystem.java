public class _15_NumberSystem {
    public static void main(String[] args) {
        int decimal = 10;
        toBinary(decimal);
        String str = "101101";
        System.out.println(toDecimal(str));
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
    private static int toDecimal(String str) {
        int ans = 0;
        int bit_value = 1;
        for(int i = str.length() - 1;i >= 0;i--) {
            int bit = Character.getNumericValue(str.charAt(i));
            ans += bit*bit_value;
            bit_value *= 2;
        }
        return ans;
    }
}