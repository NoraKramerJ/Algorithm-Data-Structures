package ArrayTasks;

import java.util.Arrays;

public class SortInAscendingOrder {

    public static void main(String[] args) {

int [] array={5,4,11,12};
     //   System.out.println(Arrays.toString(sortedArrayAscending(array)));
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

    }

    public static int [] sortedArrayAscending(int [] array) {

        int[] result = Arrays.copyOfRange(array, 0, array.length);
        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] < result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }

        }

        return result;
    }}



 /*
    Write a method that can sort an int array in Ascending order without using the sort method

    solution:
    1. find the minimum number from the array
    2. store it in a variable called min
    3. compare the next number with min, if the next number is smaller than min, then assign it to min
    4. repeat step 3 until the last index of the array
    5. store the min number in another array
    6. repeat steps 1-5 until the last index of the array

     */
