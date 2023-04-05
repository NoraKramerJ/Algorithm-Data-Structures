package hashtable;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        //  myHashTable.printTable();
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("hello"));
        System.out.println(firstUniqChar("aabbcc"));


    }

    public static int firstUniqChar(String s) {
        Map<Character,Integer> myMap=new HashMap<>();
        List<Character> repeatedChar=new ArrayList<>();
        char[] word=s.toLowerCase().toCharArray();
        for(char letter:word){
            if(myMap.containsKey(letter)){
                repeatedChar.add(letter);
            } else{
               myMap.put(letter,0);
            }
        }
        for(int i=0;i< word.length;i++ ){
            if(!repeatedChar.contains(word[i]) && myMap.containsKey(word[i])){
                return i;
            }
        }
        return -1;
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

        char[] wordArray=word.toCharArray();// [L,L,A,A,U,G,H,H,L]
        Map<Character,Integer> myMap=new HashMap<>();
        List<Character> repeatedChar=new ArrayList<>();//1,2,1,2,2

        for(char letter: wordArray){//
            if(myMap.containsKey(letter)){//
                repeatedChar.add(letter);// repeated letters L,A,H
            } else{
                myMap.put(letter,1);// L,A,U,G,H

            }
        }
// iterate through the input string again to find the first non-repeating character
 for( char letter:wordArray){// [L,L,A,A,U,G,H,H,L]


     if(!repeatedChar.contains(letter) && myMap.containsKey(letter)) { //[L,A,H] COMPARING [L,L,A,A,U,G,H,H,L]
         return letter;
     }
     }
     return null;
 }

    }
    // if no non-repeating characters were found, return null


