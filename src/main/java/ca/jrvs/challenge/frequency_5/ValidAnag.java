package ca.jrvs.challenge.frequency_5;

import java.util.Arrays;

public class ValidAnag {

    //Given two strings s and t , write a function to determine if t is an anagram of s.
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
