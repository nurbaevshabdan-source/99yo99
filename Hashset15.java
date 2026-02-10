//Hashset; Practise 15

import java.util.ArrayDeque;

public class Hashset15 {
    public static void main(String[] args){
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("Apple");//<<last
        stack.push("Banana");//<<second
        stack.push("Cherry");//<<first
        System.out.println(stack.peekFirst());
        System.out.println(stack.peekLast());

        ArrayDeque<String> emptyStack = new ArrayDeque<>();
        System.out.println(emptyStack.peekFirst());
        System.out.println(emptyStack.peekLast());
        //both of results are null
    }
}
