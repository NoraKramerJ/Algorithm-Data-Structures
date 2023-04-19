package ArrayTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArraySecondLargestNumber {

    public static void main(String[] args) {

        int[] array={5,4,7,9,12,11};
        System.out.println(secondLargestNumber(array));


        Map<Integer,String> map=new HashMap<>();
        map.put(3,"Hello");
        map.put(2,"WORLD");
        map.put(1,"I am here");

        for(Map.Entry m: map.entrySet()){
            System.out.println(m);
        }
     //   Iterator<Map.Entry> itr = map.entrySet().iterator();
     //   while(itr.hasNext()){
         //   System.out.println(itr.next());
        }

    //}

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
