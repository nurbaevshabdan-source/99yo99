//Hashset; Practise 8

import java.util.HashSet;

public class Hashset8 {
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        setB.add(3);
        setB.add(4);
        setB.add(5);
        System.out.println("Hashsets now : First >>> " + setA + " Second >>> " + setB);

        if(setA.containsAll(setB)){System.out.println("setA contains all elements of setB");} else {System.out.println("setA does NOT contain all elements of setB");}
    }
}