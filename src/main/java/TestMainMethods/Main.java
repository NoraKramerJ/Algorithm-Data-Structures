package TestMainMethods;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static Boolean itemInCommon(int[] array1, int[] array2) {

        Map<Integer, Boolean> myHashMap = new HashMap<>();

        for (int i : array1) {
            myHashMap.put(i, true);
        }

        for (int j : array2) {
            if (myHashMap.containsKey(j)) {
                return true;
            }

        }
        return false;
    }
    public static boolean isPalindrome(int x) {

       String convertedNumber=String.valueOf(x);// converting int to string-immutable///121
       StringBuilder revereseString=new StringBuilder();// creating a mutable object
       revereseString.append(convertedNumber);// add the number at the end //121 object
       revereseString.reverse();//121
       return(revereseString.toString().equals(convertedNumber));//
/*
   public boolean isPalindrome(int x) {

        if(x==0) return true;
        if(x<0|| x%10==0) return false;

        int reversed = 0;

        while(x > reversed){
            int pop = x % 10;
            x/=10;

            reversed = (reversed*10)+pop;

        }
        if(x== reversed || x== reversed/10){
            return true;
        }else{
            return false;
        }

    }
}*/
}
 /*   public String longestCommonPrefix(String[] strs) {
       //container//characters
        Map<Character, Character>map=new LinkedHashMap<>();

        String prefix="";




        for(String s: strs){
            char []  x=s.toCharArray();//[f,l,o,w,e,r], [f,l,o,w],[f,l,i,g,h,t]

    }
}*/
/*
* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.*/
    public static int romanToInt(String s) { //LVIII
        Map<Character, Integer> map = new HashMap<>();
       map.put('I', 1);//here we placed the roman symbol to it's value
       map.put('V', 5);
       map.put('X', 10);
       map.put('L', 50);
       map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;//int ans
        int prev = 0;// num
        for(int i=s.length()-1;i>=0;i--){
            int curr=map.get(s.charAt(i));
            if(curr>=prev){
                result+=curr;
            }else{
                result-=curr;
            }
            prev=curr;
        }
        return result;
    }


    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(1,3,4,6,2,7);

      //  System.out.println( isPalindrome(121));
        String [] words={"abcdef", "abhjjdlkls","abcjsjjdj"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        String s="hello";
        List<Integer>lists=Arrays.asList(3,4,7,0,1);
        lists.stream().filter(p->p %2==0).forEach(System.out::println);
        Stream<Integer> randomInts = Stream.generate(() -> (int) (Math.random() * 100));
Arrays.stream(new String []{"Ram","Sarah","fatih"}).filter(r ->r.startsWith("f")).map(String::toLowerCase).sorted().forEach(System.out::println);


        }
       /* int[] array1 = {1, 3, 5};
        int[] array2 = {1, 3, 5};
        System.out.println(Arrays.equals(array1,array2));*/
       /*tring[] array3= new String[2];
        System.out.println(Arrays.toString(array3));
        int [] array=new int[array1.length];
        for(int i=array1.length-1;i>=0;i--){
            array[array1.length-1-i]=array1[i];
        }
        System.out.println(Arrays.toString(array));
     boolean [] s=new boolean[2];
        System.out.println(Arrays.toString(s));

        System.out.println(itemInCommon(array1, array2));*/
        /*try{

            System.out.println( 6/0);
       } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("hello");
        }
*/

        /*
            EXPECTED OUTPUT:
            ----------------
            true

        */


    }


