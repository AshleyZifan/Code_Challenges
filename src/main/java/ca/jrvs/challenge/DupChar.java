package ca.jrvs.challenge;

import java.util.*;

public class DupChar {

    //Frequency:5
    //Find duplicate characters in a String
    public List<Character> findDup(String str) {
        Map<Character, Integer> baseMap = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        for (Character ch : charArray) {
            if (baseMap.containsKey(ch)) {
                baseMap.put(ch, baseMap.get(ch) + 1);
            } else {
                baseMap.put(ch, 1);
            }
        }
        Set<Character> keys = baseMap.keySet();
        List<Character> result = new ArrayList<Character>();
        for (Character ch : keys) {
            if (baseMap.get(ch) > 1 && !Character.isWhitespace(ch)) {
                result.add(ch);
                System.out.println(ch + "  is " + baseMap.get(ch) + " times");
            }
        }
        return result;
    }
}
