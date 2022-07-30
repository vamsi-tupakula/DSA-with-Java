class _04_Variables {
    public static void main(String[] args) {
        /**
         * Variables are the user-defined memory locations used to store data.
         */
        int a = 10;
        short s = 123;
        long lg = 12345l; // l indicates long
        /**
         * Default type of any decimal valued number is always double, so while defining float variables we need to add 'f'
         */
        float f = 2.345f;
        double d = 2.345;
        /**
         * In java while defining char we use single quote and for string we use double quotes
         */
        char ch = 'A';
        String name = "Captain Jack Sparrow";

        // printing variables
        System.out.println(a);
        System.out.println(s);
        System.out.println(lg);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(name);
    }
}