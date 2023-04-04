package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {


    public static void main( String[] args){
        HashTable myHashTable=new HashTable();
        myHashTable.printTable();


    }

public static boolean itemInCommon(int[] array1, int[] array2){

    HashMap<Integer,Boolean> myHashMap=new HashMap<>();

    for (int i : array1) {
        myHashMap.put(i,true );
    }

    for (int j : array2) {
        if(myHashMap.get(j)!=null) return true;
    }
    return false;
}
    public static List<Integer> findDuplicates(int [] nums){
 List<Integer>list=new ArrayList<>();
        HashMap myHashMap=new HashMap<>();
        for(int num: nums) {
            if (myHashMap.keySet().contains(num)) {
                list.add(num);
            } else {
                myHashMap.put(num, 0);
            }

        }
        return list;
    }}
