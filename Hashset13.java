//Hashset; Practise 13

import java.util.ArrayDeque;

public class Hashset13 {
    public static void main(String[] args){
        ArrayDeque<String> stack = new ArrayDeque<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        stack.addFirst("Potato");
        stack.addLast("Tomato");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
