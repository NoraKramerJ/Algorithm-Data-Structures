package TestMainMethods;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

       String convertedNumber=String.valueOf(x);
       StringBuilder revereseString=new StringBuilder();
       revereseString.append(convertedNumber);
       revereseString.reverse();
       return(revereseString.toString().equals(convertedNumber));

}


    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(1,3,4,6,2,7);

        System.out.println( isPalindrome(121));

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

}