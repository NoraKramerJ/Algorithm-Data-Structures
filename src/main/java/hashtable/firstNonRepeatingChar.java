package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class firstNonRepeatingChar {

    public static Character firstNonRepeatingChar(String word) {

        Map<Character, Integer> myMap = new HashMap<>();
        char[] wordArray = word.toLowerCase().toCharArray();

        for (char i : wordArray) {
            if (myMap.containsKey(i)) {//leetcode
                myMap.put(i, myMap.get(i) + 1);//(e,3),
            } else {
                myMap.put(i, 1);// (l,1),(e,2),(t,1),
            }
        }
        for (char i : wordArray) {
            if (myMap.get(i) == 1) {
                return i;
            }
        }
        return null;
    }
public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));

        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */

        }

        }


