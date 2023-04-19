package StringTasks;

import java.util.*;

public class String_RemoveDuplicates {
    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {

        String removeDuplicate="AAABBBCCC";
        System.out.println(removeDuplicate);
        System.out.println(removeDup(removeDuplicate));
    }
    public static String removeDup(String str) {

        String result="";
        for( int i=0; i<str.length();i++){
            if(!result.contains(""+str.charAt(i))){
                result+=""+str.charAt(i);
            }
        }
        return result;
    }
    }

