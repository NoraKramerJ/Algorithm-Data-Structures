package ArrayTasks;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int [] array={1,1,1,3,4,5,6,5};
        System.out.println(Arrays.toString(removeDuplicates(array)));
        String str = "apple banana orange";
        String[] arr = str.split("a");
        System.out.println(Arrays.toString(arr));


    }
    public static int[]  removeDuplicates(int [] arr) {
ArrayList<Integer> nonDuplicate=new ArrayList<>();
for(int i:arr){
    if(!nonDuplicate.contains(i)){
        nonDuplicate.add(i);

    }
}
int[] array=new int[nonDuplicate.size()];

for(int i=0;i<nonDuplicate.size();i++){
array[i]=nonDuplicate.get(i);

}
return array;
    }}



/*
    Write a function that can remove the duplicates from an array of integers
     */


