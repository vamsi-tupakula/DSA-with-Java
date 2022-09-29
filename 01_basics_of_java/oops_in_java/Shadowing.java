package oops_in_java;

/*
 * Shadowing in java is a practice of overlapping scopes with the same name where the variable in low-level scope overrides the variable in high-level scope.
 * variable in high-level scope is shadowing the variable in low-level scope
 */

class OuterShadowing {
    String name = "Outer Name";

    class InnerShadowing {
        String name = "Inner Name";

        public void print() {
            System.out.println(name);
            System.out.println(OuterShadowing.this.name);
        }
    }
}

public class Shadowing {
    public static void main(String[] args) {
        OuterShadowing obj = new OuterShadowing();
        OuterShadowing.InnerShadowing inner = obj.new InnerShadowing();

        inner.print();
    }
}
