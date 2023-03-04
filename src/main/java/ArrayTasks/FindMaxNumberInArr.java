package ArrayTasks;

public class FindMaxNumberInArr {
    public static void main(String[] args) {

int [] arr=new int[]{3,6,9,65,50,2};
        System.out.println(maxNumberInArray(arr));


    }
    public static int maxNumberInArray(int[] array) {

        int max=Integer.MIN_VALUE;
        for(int i=0; i<array.length;i++){
            if(array[i]>max){
                max=array[i];

            }
        }
        return max;
    }

}
  /*
        Write a function that can find the maximum number from an int Array
     */