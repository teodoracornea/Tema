package tema16;

import java.util.HashSet;
//Given two strings, determine if they share a common substring. A substring may be as small as one character.
public class TwoStrings {
    public static void main(String[] args) {
        String s1 = "asd";
        String s2 = "aty";
        solution(s1,s2);

    }
    public static void solution(String s1, String s2){
        HashSet<Character> SetS1 = new HashSet<>();
        HashSet<Character> SetS2 = new HashSet<>();
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        for(int i=0; i<s1.length();i++){
            SetS1.add(ch1[i]);
        }
        for(int i=0; i<s2.length();i++){
            SetS2.add(ch2[i]);
        }

        SetS1.retainAll(SetS2);


        System.out.println( (SetS1.isEmpty()) ? "NO" : "YES" );

    }
}
