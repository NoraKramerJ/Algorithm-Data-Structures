package hashtable;

import java.util.*;

public class ListOfAnagram {

    public static List<List<String>> groupAnagrams(String[] strings) {

       Map<String, List<String>> myMap = new HashMap<>();

       for(String word : strings){
           char[] chars=word.toCharArray();
           Arrays.sort(chars);
           String sorted= new String(chars);
           if(myMap.containsKey(sorted)){

               myMap.get(sorted).add(word);
           }
           else{
               List<String> group= new ArrayList<>();
               group.add(word);
               myMap.put(sorted,group);
           }

       }return new ArrayList<>(myMap.values());

    }

    public static void main(String[] args) {


        String s="Java";
        String s1="Java";
     s1=s1.replace('a','o');

       System.out.println(s1);
    }
}
/*
HT: Group Anagrams (⚡Interview Question)
You have been given an array of strings, where each string may contain only lowercase English letters. You need to write a method groupAnagrams(String[] strings)
 that groups the anagrams in the array together using a hash table (HashMap). The method should return a list of lists, where each inner array contains a group of anagrams.

For example, if the input array is ["eat", "tea", "tan", "ate", "nat", "bat"], the method should return [["eat","tea","ate"],["tan","nat"],["bat"]] because the first three strings are anagrams of each other, the next two strings are anagrams of each other, and the last string has no anagrams in the input array.

You need to implement the groupAnagrams(String[] strings) method and return a list of lists, where each inner list contains a group of anagrams according to the above requirements.

Return type: List<List<String>>
 */