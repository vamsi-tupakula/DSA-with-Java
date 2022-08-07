public class _11_SubsetsOfString {
    public static void main(String[] args) {
        String str = "abc";
        subsets(str, 0, "");
    }
    public static void subsets(String s, int i, String ans) {
        if(i == s.length()) {
            if(ans == "") {
                System.out.println("\"\"");
                return;
            }
            System.out.println(ans);
            return;
        }
        subsets(s, i+1, ans);
        subsets(s, i+1, ans + s.charAt(i));
    }
}