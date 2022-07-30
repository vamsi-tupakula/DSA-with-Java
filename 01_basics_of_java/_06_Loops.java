public class _06_Loops {
    public static void main(String[] args) {
        //for loop
        for(int i=0;i<5;i++){
            System.out.println(i);
        }

        // while loop
        int j = 1;
        while(j <= 4){
            System.out.println("4 x " + j + " = " + (4*j));
            j++;
        }

        // do while
        int k = 1;
        do {
            System.out.println("Hello, world " + k + " time");
            k++;
        } while(k <=5);
    }    
}