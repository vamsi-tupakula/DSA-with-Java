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
        // pattern 1
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // pattern 2
        for(int i=0;i<m;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // pattern 3
        for(int i=0;i<m;i++) {
            for(int j=0;j<m-i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // pattern 4
        for(int i=0;i<m;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
        System.out.println();
        // pattern 5
        for(int i=0;i<2*m-1;i++) {
            int cols = i < m ? i : 2*m-i-2;
            for(int j=0;j<=cols;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // pattern 6
        for(int i=0;i<m;i++) {
            for(int j=1;j<=m;j++) {
                if(j >= m-i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // pattern 7
        for(int i=0;i<m;i++) {
            for(int j=0;j<m;j++) {
                if(j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // pattern 8
        for(int i=0;i<m;i++) {
            for(int j=1;j<=2*m-1;j++) {
                if(j < m-i || j > m+i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // pattern 9
        for(int i=0;i<m;i++) {
            for(int j=1;j<=2*m-1;j++) {
                if(j < i || j > 2*m-1-i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
