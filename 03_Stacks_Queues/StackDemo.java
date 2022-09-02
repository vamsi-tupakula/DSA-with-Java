import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(15);
        stack.push(18);
        stack.push(22);
        stack.push(27);

        int n = stack.size();
        System.out.println(stack.search(15));
        System.out.println(stack.empty());
        for(int i=0;i<n;i++) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.empty());
    }
}