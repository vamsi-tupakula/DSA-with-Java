package oops_in_java;

public class _02_ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            divide(a, b);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program completed...");
        }
    }
    static void divide(int a,int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Dividing with zero....");
        }
        System.out.println(a/b);
    }
}