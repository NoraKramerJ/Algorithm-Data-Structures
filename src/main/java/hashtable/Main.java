package hashtable;

import java.util.*;

public class Main {





    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5}; //2,4=6
        int target1 = 9;

        int[] result1 = subarraySum(nums1, target1);
        System.out.println(Arrays.toString(result1));

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
    public static int[] subarraySum(int[] nums, int target) { // {-1, 2, 3, -4, 5} target= 0
        // Create a HashMap to store cumulative sum and index
        int n = nums.length;
        int[] result = new int[2];
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum == target) {
                result[0] = 0;
                result[1] = i;
                return result;
            }
            if (map.containsKey(sum - target)) {
                result[0] = map.get(sum - target) + 1;
                result[1] = i;
                return result;
            }
            map.put(sum, i);
        }
        return new int[0];
    }
    /*
    *   int n = nums.length;
    int[] result = new int[2];
    int sum = 0;
    int start = 0;
    for (int i = 0; i < n; i++) {
        sum += nums[i];
        while (sum > target) {
            sum -= nums[start];
            start++;
        }
        if (sum == target) {
            result[0] = start;
            result[1] = i;
            return result;
        }
    }
    return new int[0];
}
Explanation:

Initialize start to 0 to represent the start of the subarray, and sum to 0 to represent the running sum of the subarray.
Traverse the array from left to right using a for loop.
Compute the running sum of the subarray by adding nums[i] to sum.
If sum is greater than target, then remove elements from the beginning of the subarray until sum is less than or equal to target. Update start to the next index after the removed element.
If sum is equal to target, then the subarray starts from index start and ends at index i. Return the indices as [start, i].
If no subarray is found, continue traversing the array.
If the end of the array is reached and no subarray is found, return an empty array.
This algorithm also has O(n) time complexity because it only traverses the array once and adjusts the subarray window based on the running sum.





*/
       /* Map<Integer, Integer> sumIndex = new HashMap<>(); //
        // Initialize the HashMap with 0 sum and index -1
        sumIndex.put(0, -1); // for negative numbers ,
        // Initialize the current sum to 0
        int currentSum = 0; //total
        // Iterate through the input array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the cumulative sum
            currentSum += nums[i]; //total=
            // Check if the required subarray sum exists
            if (sumIndex.containsKey(currentSum - target)) {
                // Return the start and end indices of the subarray
                return new int[]{sumIndex.get(currentSum - target) + 1, i};// {1,3}
            }
            // Store the current sum and its index in the HashMap
            sumIndex.put(currentSum, i); //
        }

        // Return an empty array if no subarray is found
        return new int[]{};*/
    }
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


