package lesson_5;

public class Main {

    public static void main(String[] args) {


        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
         }
    }
}
