package hashtable;

import java.util.*;

public class SumOfTwoNumbers {


    public static void main(String[] args) {



        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 3, 4, 5}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));
    }

    public static int[] twoSum(int[] nums, int target){

        Map<Integer,Integer>myMap=new HashMap<>();//{2, 3, 3, 4, 5}, target 6
        for(int i=0;i<nums.length;i++){
             int num=nums[i]; //4
            int complement=target-num;//complement=6-2=4,6-3=3,6-3=3, 6-4=2
       if(myMap.containsKey(complement)){//
    return new int[]{myMap.get(complement), i};//(1,2),(0,3)
}
            myMap.put(num, i);//(2,0),(3,1)
        }

        return new int[]{};
    }


    }

/*
* twoSum()

Problem: Given an array of integers nums and a target integer target, find the indices of two numbers in the array that add up to the target.

Input:

An array of integers nums .

A target integer target.

Output:

An array of two integers representing the indices of the two numbers in the input array nums that add up to the target. If no two numbers in the input array add up to the target, return an empty array [].

Return type:

int[]



Example:



Input: int[] nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
Explanation: The numbers at indices 0 and 1 in the array add up to the target 9.

Input: int[] nums = [3, 2, 4], target = 6
Output: [1, 2]
Explanation: The numbers at indices 1 and 2 in the array add up to the target 6.

Input: int[] nums = [3, 3], target = 6
Output: [0, 1]
Explanation: The numbers at indices 0 and 1 in the array add up to the target 6.

Input: int[] nums = [1, 2, 3, 4, 5], target = 10
Output: []
Explanation: There are no two numbers in the array add up to the target 10.

Input: int[] nums = [], target = 0
Output: []
Explanation: There are no numbers in the input array, so the function returns an empty array [].
*/