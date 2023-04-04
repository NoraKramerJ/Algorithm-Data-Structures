import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class main {

        public static List<Integer> findDuplicates(int [] nums){
            HashMap<Integer,Integer> myHashMap=new HashMap<>();

            List<Integer> list = new ArrayList<>();
            for(int num:nums){
                if(myHashMap.keySet().contains(num)){

                    list.add(num);
                }
                else
                    myHashMap.put(num, 0);

            }
            return list;

        }


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4,9,0,0};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);

        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */

    }

}


