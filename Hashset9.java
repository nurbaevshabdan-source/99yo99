//Hashset; practise 9

import java.util.HashSet;

public class Hashset9 {
    public static void main(String[] args){
        String sentence = "My very photogenic mother died in a freak accident when I was three, and, save for a pocket of warmth in the darkest past, nothing of her subsists within the hollows and dells of memory, over which, if you can still stand my style , the sun of my infancy had set: surely, you all know those redolent remnants of day suspended, with the midges, about some hedge in bloom or suddenly entered and traversed by the rambler, at the bottom of a hill, in the summer dusk; a furry warmth, golden midges.";
        sentence = sentence.replaceAll("[^a-zA-Z0-9 ]", "");
        String[] yo = sentence.split(" ");
        HashSet<String> set = new HashSet<>();

        for(String w : yo){
            set.add(w);
        }
        System.out.println(set);
    }
}
