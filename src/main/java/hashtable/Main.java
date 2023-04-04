package hashtable;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        //  myHashTable.printTable();
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));


    }

    public static boolean itemInCommon(int[] array1, int[] array2) {

        HashMap<Integer, Boolean> myHashMap = new HashMap<>();

        for (int i : array1) {
            myHashMap.put(i, true);
        }

        for (int j : array2) {
            if (myHashMap.get(j) != null) return true;
        }
        return false;
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap myHashMap = new HashMap<>();
        for (int num : nums) {
            if (myHashMap.keySet().contains(num)) {//1,1,2
                list.add(num);//1
            } else {
                myHashMap.put(num, 0);//1,2
            }

        }
        return list;
    }

    public static Character firstNonRepeatingChar(String word) { //"leetcode"
        Map<Character, Integer> myhashMap = new HashMap<>();
        char[] wordArray = word.toLowerCase().toCharArray();
        List<Character> repeatedChar = new ArrayList<>();


        for (char letter : wordArray) {
            if (myhashMap.containsKey(letter)) {//
                repeatedChar.add(letter);//repeated ones
            } else {
                myhashMap.put(letter, 1);// nonRepeated ones

            }
        }

        // iterate through the input string again to find the first non-repeating character
        for (char letter : wordArray) {
            if (!repeatedChar.contains(letter) && myhashMap.get(letter) == 1) {
                return letter;
            }

        }
        return null;

    }
    // if no non-repeating characters were found, return null

}
