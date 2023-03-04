package ArrayTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int [] array={1,1,1,3,4,5,5};
        System.out.println(Arrays.toString(removeDuplicates(array)));


    }
    public static int[]  removeDuplicates(int [] arr){

        ArrayList<Integer>list=new ArrayList<>();
        for(int each:arr){
            if(!list.contains(each)){
                list.add(each);
            }
        }
        arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
        }



    }



/*
    Write a function that can remove the duplicates from an array of integers
     */


