package ArrayTasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfEachElementWithWord {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4};
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "more than ten"};
        Map<Integer,String>map= new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            int frequency=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                        frequency++;
                }
            }
            if(frequency>10){
                map.put(arr[i],words[11]);
            } else{
                map.put(arr[i],words[frequency]);
            }
        }
map.forEach((k,v)-> System.out.println(k+" is "+v));
/*
     int[]arr = {1,2,3,4,3,2,1,3,2,2,2,4};

write a program that should count each number and prints a sentence to say how many times a number is repeated example:
        1 is two,
        3 is three,
        4 is two.
        2 is five


     */

        // simple counting the frequency Arrays.stream(arr).distinct().forEach(e-> System.out.println(e+" = "+Arrays.stream(arr).filter(p->p==e).count()));
    }}