package tema16;

import java.util.HashSet;
//Given two strings, determine if they share a common substring. A substring may be as small as one character.
public class TwoStrings {
    public static void main(String[] args) {
        String s1 = "asd";
        String s2 = "etd";
        solution(s1,s2);

    }
    public static void solution(String s1, String s2){
        HashSet<Character> SetS1 = new HashSet<>();
        HashSet<Character> SetS2 = new HashSet<>();

        for(int i=0; i<s1.length();i++){
            SetS1.add(s1.charAt(i));
        }
        for(int i=0; i<s2.length();i++){
            SetS2.add(s2.charAt(i));
        }

        SetS1.retainAll(SetS2);


        System.out.println( (SetS1.isEmpty()) ? "NO" : "YES" );

    }
}
