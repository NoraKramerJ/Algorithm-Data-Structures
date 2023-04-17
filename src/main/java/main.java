import java.util.*;
import java.util.stream.Collectors;

public class main {

        public static List<Integer> findDuplicates(int [] nums){
            HashMap<Integer,Integer> myHashMap=new HashMap<>();

            List<Integer> list = new ArrayList<>();
            for(int num:nums){
                if(myHashMap.keySet().contains(num)){

                    list.add(num);
                }
                else
                    myHashMap.put(num, 0);

            }
            return list;

        }


    public static List<Integer> removeDuplicates(List<Integer> myList) {

        return myList.stream().distinct().collect(Collectors.toList());



    }

    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
        List<Integer> newList = removeDuplicates(myList);
        System.out.println(newList);

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8, 9]

            (Order may be different as sets are unordered)
        */

    }

    public static class Animal{

            public void print(){
                System.out.println("Animal");
            }
    }

    public static class Dog extends Animal{

            public void print(){
                System.out.println("Woof");
            }
            public void bark(){
                System.out.println("Bark");
            }
    }
}


