package bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static void selectionSort(int [] array) {

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;

                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
        public static void bubbleSort ( int[] array){
            for (int i = array.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] < array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
     public static void main(String[] args) {

    int [] array={4,2,6,5,1,3};
   // bubbleSort(array);
        // System.out.println(Arrays.toString(array));
         selectionSort(array);
         System.out.println(Arrays.toString(array));
     }
/*

 void count();
 public static void print(){
     System.out.println("hello");
 }
   public default int countNumber(){
       return 5;
   }
   public static class Count implements main{

       @Override
       public void count() {

       }
   }*/
    }


