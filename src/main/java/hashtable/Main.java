package hashtable;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5}; //2,4=6
        int target1 = 9;

        int[] result1 = subarraySum(nums1, target1);
        System.out.println(Arrays.toString(result1));
       // System.out.println(Arrays.toString(new int[]{subArraySum(nums1, 3)}));

        int[] nums2 = {-1, 2, 3, -4, 5};//0,3
        int target2 = 0;

        int[] result2 = subarraySum(nums2, target2);

        System.out.println(Arrays.toString(result2));

        int[] nums3 = {2, 3, 4, 5, 6};
        int target3 = 3;
        int[] result3 = subarraySum(nums3, target3);
        System.out.println(Arrays.toString(result3));

        int[] nums4 = {};
        int target4 = 0;
        int[] result4 = subarraySum(nums4, target4);
        System.out.println(Arrays.toString(result4));

       /*
            EXPECTED OUTPUT:
            ----------------
            [1, 3]
            [0, 3]
            [1, 1]
            []

        */


      /*  HashTable myHashTable = new HashTable();
        //  myHashTable.printTable();
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("hello"));
        System.out.println(firstUniqChar("aabbcc"));*/


    }

    public static int[] subarraySum(int[] nums, int target) { // {1,2, 3, 4,  5} target= 9
        // Create a HashMap to store cumulative sum and index
   Map<Integer,Integer> myMap= new HashMap<>();
   int total=0;
   int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) { //1

            total +=nums[i]; //3,6,10
            if(total- target==0){
                result[0]=0;
                result[1]=i;
                return result;
            }

            if(myMap.containsKey(total- target)){//1

                result[0]= myMap.get(total-target)+1;
                result[1]=i;//3
                return result;

            }

            myMap.put(total,i); //(1,0),(3,1),(6,2),
        }
        return new int[]{};

    /*    int[] result = new int[2];
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];// adding the total 10
            if (sum == target) { //is
                result[0] = 0;//
                result[1] = i;//
                return result;
            }
            if (map.containsKey(sum - target)) {//1
                result[0] = map.get(sum - target) + 1; //1
                result[1] = i;//
                return result;
            }
            map.put(sum, i);//(1,0),(3,1),(6,2),
        }
        return new int[0];*/
    }
    public static int subArraySum(int [] nums, int target){ //{2, 3, 4, 5}  target 9


        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize the map with sum=0 and count=1
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];//2,5,9,14
            if (map.containsKey(sum - target)) {//5
                {
                count += map.get(sum - target); // Add the count of subarrays that have sum = k count=2
                    //=9-9=1,14-9=5,1

            }
            map.put(sum, map.getOrDefault(sum, 0) + 1); // , Update the count of subarrays with the current sum
          //(0,1),(2,1),(5,1),(9,1)
//When i = 2, sum = 9, sum - target = 0, and map contains an entry (0, 1), (2, 1), and (5, 1). An entry exists in map with key 0,
// so we update count by adding the value of the entry in map with key 0, which is 1. Now, count = 2. We add an entry (9, 1) to map.
//When i = 3, sum = 14, sum - target = 5, and map contains an entry (0, 1), (2, 1), (5, 1), and (9, 1).
// An entry exists in map with key 5, so we update count by adding the value of the entry in map with key 5, which is 1. Now, count = 3.
// We add an entry (14, 1) to map.
//Finally, we return count, which is 3, as the answer to the problem.
//I hope this explanation helps you understand how this algorithm works!
        }
        }
        return count;
    }}

    /*int n = nums.length;
    int count = 0;
    int sum = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1); // Initialize the map with sum=0 and count=1
    for (int i = 0; i < n; i++) {
        sum += nums[i];
        if (map.containsKey(sum - k)) {
            count += map.get(sum - k); // Add the count of subarrays that have sum = k
        }
        map.put(sum, map.getOrDefault(sum, 0) + 1); // Update the count of subarrays with the current sum
    }
    return count;
}*/



        /*
        Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 */


         /*
 Given an array of integers nums and a target integer target, write a method called subarraySum that finds the indices of a contiguous subarray
  in nums that add up to the target sum using a hash table (HashMap).
Your function should take two arguments:
nums: an array of integers representing the input array
target: an integer representing the target sum
Your function should return a list of two integers representing the starting and ending indices
 of the subarray that adds up to the target sum. If there is no such subarray, your function should return an empty list.

For example:

int[] nums = [1, 2, 3, 4, 5]
int target = 9
int[] result1 = subarraySum(nums1, target1);

// This should print [1, 3]
System.out.println("[" + result1[0] + ", " + result1[1] + "]");


Note that there may be multiple subarrays that add up to the target sum,
*  but your method only needs to return the indices of any one such subarray. Also, the input array may contain both positive and negative integers.*/

    /*  ;*/

/*
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
 }*/


