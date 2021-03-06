package Stack;

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Plate1");
        stack.push("Plate2");
        stack.push("Plate3");
        stack.push("Plate4");
        stack.push("Plate5");
        stack.push("Plate6");

        if (stack.peek().equals("Plate6")){
            System.out.println(stack.pop());
        }
        System.out.println(stack.peek());

    }
}
