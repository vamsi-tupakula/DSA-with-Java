import java.util.Scanner;

public class _17_Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows : ");
        int m = sc.nextInt();
        System.out.print("Columns : ");
        int n = sc.nextInt();
        patterns(m,n);
        sc.close();
    }

    private static void patterns(int m, int n) {
        // rectangular pattern
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // triangule pattern
        for(int i=0;i<m;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // reverse triangle
        for(int i=0;i<m;i++) {
            for(int j=0;j<m-i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // number triangle
        for(int i=0;i<m;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
        System.out.println();
        // triangle + reverse triangle
        for(int i=0;i<2*m-1;i++) {
            int cols = i < m ? i : 2*m-i-2;
            for(int j=0;j<=cols;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
