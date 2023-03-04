package ArrayTasks;

import java.util.Arrays;

public class SumOfElementClosestToZero {

    public static void main(String[] args) {

        int[] array={7,-9,14,-2};
        System.out.println(closestToZero(array));
    }


    public static int  closestToZero(int [] array){
        //solution
        Arrays.sort(array);
        int leftPointer=0;
        int rightPointer=array.length-1;
        int res=Integer.MAX_VALUE;
        while(leftPointer<rightPointer){
            int difference=array[rightPointer]+array[leftPointer];
            if(Math.abs(res)>Math.abs(difference))res=difference;
            //  res=Math.min(res, difference);
            if (difference>0) rightPointer--;
            else if (difference<0)leftPointer++;
            else return 0;
        }
        return res;


    }}
   /*
       Given an integer array of N elements. You need to find the maximum sum of two elements such that sum is closest to zero.
       Example 1:
       solution:
         1. sort the array
            2. create two pointers, one at the beginning of the array and the other at the end of the array
            3. create a variable called res and assign it to the maximum value of an integer
            4. create a while loop that will run as long as the left pointer is less than the right pointer
            5. create a variable called difference and assign it to the sum of the elements at the right pointer and the left pointer
            6. compare the difference with the res, if the difference is smaller than res, then assign it to res
            7. if the difference is greater than 0, then decrement the right pointer
            8. if the difference is less than 0, then increment the left pointer
            9. if the difference is equal to 0, then return 0
            10. return res

Input:
N = 3
arr[] = {-8 -66 -60}
Output: -68
Explanation: Sum of two elements closest to
zero is -68 using numbers -60 and -8.
Example 2:
Input:
N = 6
arr[] = {-21 -67 -37 -18 4 -65}



Output: -14
Explanation: Sum of two elements closest to
zero is -14 using numbers -18 and 4.
     */