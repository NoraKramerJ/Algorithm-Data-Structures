package ArrayTasks;

import java.util.*;

import static java.util.Arrays.*;

public class SortArrayDescendingOrder {

    public static void main(String[] args) {

        int[] array = {5, 8, 10, 60, 2};
        //  System.out.println(Arrays.toString(sortDescending(array)));
int [] descendingArray=Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer:: intValue).toArray();
        System.out.println(Arrays.toString(descendingArray));
    }


    public static int [] sortDescending(int [] array) {

        int[] arr = copyOfRange(array, 0, array.length);
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                     Integer temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }


        }
        return arr;
    }
}
//int [] descendingArray= Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
//        System.out.println(Arrays.toString(descendingArray));

  /*
        Write a return method that can sort an int array in descending order without using the sort method

        solution:

     */