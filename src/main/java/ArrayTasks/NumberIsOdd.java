package ArrayTasks;

import java.util.ArrayList;
import java.util.List;

public class NumberIsOdd {

    public static void main(String[] args) {


        int[] numbers={3,5,6,8,9,1,7};
        List<Integer> even=new ArrayList<>();
        List<Integer> doub=new ArrayList<>();
        for(int num:numbers) {
            if (num % 2 == 0) {
                doub.add(num);
            } else {
                even.add(num);
            }
        }
        System.out.println(even+""+doub);
    }
}
