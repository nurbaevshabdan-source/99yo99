//Hashset; Practise 12

import java.util.ArrayDeque;

public class Hashset12 {
    public static void main(String[] args) {

        ArrayDeque<String> stack = new ArrayDeque<>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}