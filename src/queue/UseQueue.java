package queue;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("Ali");
        queue.add("Hamad");
        queue.add("John");

        System.out.println(queue.element());
    }
}
