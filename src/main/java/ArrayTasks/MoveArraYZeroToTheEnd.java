package ArrayTasks;

import java.util.Arrays;

public class MoveArraYZeroToTheEnd {


    public static void main(String[] args) {

int [] arr={1,4,3,6,8,0,0,0,0};
        System.out.println(Arrays.toString(moveZerosToTheEnd(arr)));

    }

    public static int[] moveZerosToTheEnd(int[] arr) {

        int i = 0;
        int[] arrZero = new int[arr.length];
        for (int each : arr) {
            if (each != 0)
                arrZero[i++] = each;


        }
        return arrZero;
    }}

 /*
    write a program that can move all the zeros to the end of an array
    Ex:
        array = {1,0,2,0,3,0,4,0};
        output:
            [1, 2, 3, 4, 0, 0, 0, 0]
         solution:
            1. you have an array with 8 elements
            2. you need to move all the zeros to the end of the array
            3. you need to keep the order of the other elements
                solution 1:
                    1. create a new array with the same size as the original array
                    2. iterate the original array, and add the non-zero elements to the new array
                    3. iterate the new array, and add the zeros to the new array

     */

