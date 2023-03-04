package StringTasks;

public class ReverseString {

    /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:

     */
    public static void main(String[] args) {

String str="Hello";
        System.out.println(reverseString(str));

    }

    public static String reverseString(String str) {

   String reverse="";

for(int i=str.length()-1; i>=0; i--){
    reverse+=str.toCharArray()[i];

}
return reverse;
    }
}
