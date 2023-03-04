package ArrayTasks;

import java.util.Arrays;

public class ArraySecondLargestNumber {

    public static void main(String[] args) {

        int[] array={5,4,7,9,12,11};
        System.out.println(secondLargestNumber(array));

    }
    public static int secondLargestNumber(int [] array) {

       return Arrays.stream(array).filter(p->p !=Arrays.stream(array).max().getAsInt()).max().getAsInt();
       /* int max1 = Integer.MIN_VALUE;
        int max2 = 0;
        for (int num : array) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num>max2) {
                max2 = num;
            }
        }
        return max2;*/
    }}
