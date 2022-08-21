import java.util.Locale;

public class _14_FormatString {
    public static void main(String[] args) {
        String str = "java";
        boolean bool = true;
        int n = 10;
        float f = 22.5f;
        
        String format_string = String.format("%s -> %d -> %b -> %f", str, n, bool, f);
        System.out.println(format_string);

        float new_float = 35.2343795f;
        System.out.format("%.3f", new_float);
        System.out.println();
        System.out.format("%5d", 46);
        System.out.println();
        System.out.format("%05d", 46);
        System.out.println();

        int num = 8563957;
        System.out.format("%,d", num);
        System.out.println();
        System.out.format(Locale.GERMAN, "%,d", num);
        System.out.println();
    }
}