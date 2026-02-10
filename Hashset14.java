//Hashset; Practise 14

import java.util.ArrayDeque;

public class Hashset14 {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        boolean a = stack.offerFirst("A");
        boolean b = stack.offerLast("B");
        boolean c = stack.offerFirst("C");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(stack);
    }
}
