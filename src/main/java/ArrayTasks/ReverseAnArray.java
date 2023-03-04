package ArrayTasks;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int [] array={7,8,9,10};
        System.out.println(Arrays.toString(reverse(array)));

    }

    public static int[] reverse( int [] array){
int [] arr=new int[array.length];
        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
         arr[j]=array[i];

        }
        return arr;
     /*
    write a function that can reverse an array
     */

}}
