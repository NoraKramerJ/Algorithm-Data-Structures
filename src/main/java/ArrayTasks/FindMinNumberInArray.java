package ArrayTasks;

public class FindMinNumberInArray {

    public static void main(String[] args) {

        int [] arr=new int[]{3,6,9,50,2};
        System.out.println(minNumberInArray(arr));
    }
    public static int minNumberInArray(int[] arr){
     int min=Integer.MAX_VALUE;
     for(int i=0; i<arr.length;i++){
         if(arr[i]<min){
             min=arr[i];
         }
     }
     return min;
    }
}
  /*
    Write a function that can find the minimum number from an int Array
     */
