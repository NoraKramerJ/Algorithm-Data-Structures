package ArrayTasks;

public class FirstDuplicatedElementInArray {

    public static void main(String[] args) {
        int [] arr=new int[]{3,6,6,9,9,3,6,50,2};
        System.out.println(firstDuplicatedElement(arr));
    }
    public static int firstDuplicatedElement(int[] array) {
       int duplicatedElement=0;
       for(int each: array) {
           int frequency = 0;
           for (int s : array) {
               if (each == s)
                   frequency++;
               }

               if (frequency > 1) {
                   duplicatedElement = each;
                   break;
               }

       }
        return duplicatedElement;
    }}