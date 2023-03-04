package StringTasks;

public class UniqueChar {


    /*
   Write a return method that can find the unique characters from the String
           Ex: unique("AAABBBCCCDEF") ==> "DEF";

    */
    public static void main(String[] args) {


        String str="AAABBBCCCDEF";
        System.out.println(uniqueChar(str));
    }

        public static String uniqueChar(String str){
       char [] word=str.toCharArray();
        String unique="";

        for(char each:word){
            int repeatChar=0;
            for (char each2:word) {
                if(each==each2){
                    repeatChar++;
                }
            }
            if(repeatChar==1){
                unique+=each;
            }
        }
        return unique;
        }
}
