package StringTasks;

public class StringRemoveDuplicates {

      /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */
      public static void main(String[] args) {
          String str="aaabbbccc";
          System.out.println(removedDuplicates(str));

      }

      public static String removedDuplicates(String str) {

        String result="";
          for (int i = 0; i < str.length() ; i++) {
              if(!result.contains(""+str.charAt(i))){
                  result+=""+str.charAt(i);

              }
          }
          return result;
      }
          }
