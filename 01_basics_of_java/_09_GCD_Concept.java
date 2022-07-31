class _09_GCD_Concept {
    public static void main(String[] args) {
        /**
         * Greatest common divisor of two numbers a and b must be less than or equal to the minimum of a and b.
         * there are three ways to solve gcd problem
         * First is the normal way
         * second is using euclid's algorithm => gcd(a,b) = gcd(a-b,b) if b is smaller among a and b
         * third is using optimized euclid's algorithm :
         * gcd(a,b) = gcd(b, a%b) {return a when b is zero}
         */
        // first method :
        System.out.print("Normal method : ");
        System.out.println(normal(4, 2));

        // second method :
        System.out.print("Euclid's Algo : ");
        System.out.println(euclidAlgo(8, 12));

        // third method :
        System.out.print("Optimized Euclid : ");
        System.out.println(optimizedEuclid(12, 30));

        // how to find LCM of two numbers
        /**
         * LCM of two numbers a and b must be greater than or equal to maximum of a and b
         * formula for lcm using gcd is LCM = (a*b)/gcd
         */
    }
    public static int normal(int a,int b) {
        int res = Math.min(a, b);
        while(res > 0) {
            if(a % res == 0 && b % res == 0) break;
            res--;
        }
        return res;
    }
    public static int euclidAlgo(int a,int b) {
        while(a != b) {
            if(a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    public static int optimizedEuclid(int a,int b) {
        if(b == 0) {
            return a;
        } else {
            return optimizedEuclid(b, a % b);
        }
    }
}