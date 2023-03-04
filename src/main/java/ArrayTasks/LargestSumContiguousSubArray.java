package ArrayTasks;

public class LargestSumContiguousSubArray {

    public static void main(String[] args) {

        int[] nums = {1, -1, 3, -1, -2, 5,8,-6,-1,10,-5,9};
        System.out.println(sumOfArray(nums));
    }
    public static int sumOfArray( int [] arr){

        int max=Integer.MIN_VALUE; int temp=0;
        for(int each:arr){
            temp=temp+each;
            max=Integer.max(max,temp);


        }
        return max;
    }
}


/*
    Largest Sum Contiguous Subarray
    Write a program to find the sum of contiguous subarray within a one-dimensional array of numbers that has the largest sum.

        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.

     */