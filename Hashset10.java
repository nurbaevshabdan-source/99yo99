//Hashset; Practise 10

import java.util.HashSet;

public class Hashset10 {
    public static void main(String[] args){
        String text = "Apple apple APPLE banana Banana BANANA rediska REDiska REDISKA";
        text = text.replaceAll("[^a-zA-Z0-9 ]", "");
        String[] words = text.split(" ");
        HashSet<String> set = new HashSet<>();
        for(String w : words){
            set.add(w);
        }
        for(String w : set){
            if(w.equals(w.toLowerCase())){System.out.println(w);}
        }
    }
}
