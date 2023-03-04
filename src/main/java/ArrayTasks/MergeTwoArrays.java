package ArrayTasks;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {


        int [] arr1={1,2,3,4};
        int [] arr2={3,4,5,6};
        System.out.println(Arrays.toString(mergeTwoArrays(arr1,arr2)));


    }


public static int[] mergeTwoArrays(int[] arr1, int[] arr2) {

    int i = 0;
    int[] mergedArrays = new int[arr1.length + arr2.length];
    for (int each : arr1) {
        mergedArrays[i++] = each;
    }
    for (int each : arr2) {
        mergedArrays[i++] = each;
    }
    return mergedArrays;
}}




/*
    Write a return method that can concat two arrays
     */