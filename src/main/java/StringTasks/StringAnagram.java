package StringTasks;

import java.util.Arrays;
import java.util.TreeSet;

public class StringAnagram {

    /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:

     */

    public static void main(String[] args) {

String s="abc";
String r="cab";
        System.out.println(Anagram(s,r));
    }

    public static boolean Anagram(String a, String b){

       char [] ch1=a.toCharArray();
       char [] ch2=b.toCharArray();
       Arrays.sort(ch1);
       Arrays.sort(ch2);

       String a1="";
       String b1="";
        for(char each:ch1) {
            a1 += each;

        }
        for(char each:ch2){
            b1 +=each;

}
     return a1.equals(b1);

     /*   a=new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        b=new TreeSet<String>(Arrays.asList(b.split(""))).toString();
        return a.equals(b);*/

    }

}
