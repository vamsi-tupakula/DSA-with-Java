import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.isEmpty());
        System.out.println(queue.contains(30));
        System.out.println(queue);
    }    
}