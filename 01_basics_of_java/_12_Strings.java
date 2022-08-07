public class _12_Strings {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(str);

        // length of the string
        System.out.println(str.length());

        // returns the character at given index
        System.out.println(str.charAt(0));

        // gives the substring of the array
        System.out.println(str.substring(0, 3));

        // string comparison
        // using == method
        String a = new String("java");
        String b = new String("java");
        System.out.println(a == b);

        String c = "python";
        String d = "python";
        System.out.println(c == d);

        // using .equals() method
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));

        // concatenation
        System.out.println("a" + "b"); // ab
        System.out.println('a' + 'b'); // 195
        System.out.println('a' + "b"); // ab
    }
}