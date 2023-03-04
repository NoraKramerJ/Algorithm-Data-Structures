package StringTasks;

public class RemoveExtraSpaces {

       /*
    Remove All Extra Space from String
        Input: "  Hello world      I      love      Java    "
        Output: Hello world I love Java

     */
       public static void main(String[] args) {

           String str="HELLO    WORLD";
           System.out.println(removeExtraSpaces(str));
       }

       public static String removeExtraSpaces(String str) {

           String[] words = str.split(" ");
           String result = "";
           for (String each : words) {
               if(!each.isEmpty()){
               result += each + " ";
           }}
           return result.trim();
       }}
