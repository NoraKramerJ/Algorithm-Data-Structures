import java.util.*;
import java.util.stream.Collectors;

public class main {

    public static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> myHashMap = new HashMap<>();

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (myHashMap.keySet().contains(num)) {

                list.add(num);
            } else
                myHashMap.put(num, 0);

        }
        return list;

    }


    public static List<Integer> removeDuplicates(List<Integer> myList) {

        return myList.stream().distinct().collect(Collectors.toList());


    }

    public static int[] reverseArray(int [] numbers){
            int [] reverese=new int[numbers.length];
            for(int i=numbers.length-1, j=0; i>=0;i--,j++){
                reverese[j]= numbers[i];


        }
        return reverese;
    }

    public static int lengthOfLongestSubstring(String s) { //bbbbb
            int start = 0, end = 0, maxLength = 0;
            Set<Character> charSet = new HashSet<>();
            while (end < s.length()) {
                if (!charSet.contains(s.charAt(end))) {
                    charSet.add(s.charAt(end++));//b,1
                    maxLength = Math.max(maxLength, end - start);//1
                } else {
                    charSet.remove(s.charAt(start++));//
                }
            }
            return maxLength;//1
        }

        public static boolean hasUniqueChars(String string){

            Set<Character> mySet=new HashSet<>();
           char [] str= string.toCharArray();
           for(char ch: str){
               if(mySet.contains(ch)){
                   return false;
               } mySet.add(ch);
           }
           return true;
    }



   /* public static List<int[]> findPairs(int[] arr1, int[] arr2, int target){

      Set<Integer> myset=new HashSet<>();

    }*/
      /*
        Expected output:
        [5, 2]
        [3, 4]
        [1, 6]
    */

    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
        List<Integer> newList = removeDuplicates(myList);
        System.out.println(newList);
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(Arrays.toString(reverseArray(new int[] {
            3,4,5})));

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


