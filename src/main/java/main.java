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

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4,9};
        int num=nums[0];
        System.out.println(num);
        List<Integer> duplicates = findDuplicates(nums);
      //  System.out.println(duplicates);

        double a=(int)1.2;
        System.out.println(a);
        Animal animal=new Dog();
        animal.print();
      //  Dog dog= (Dog) new Animal();
       // dog.bark();

        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */

    }
    public static class Animal{

            public void print(){
                System.out.println("Animal");
            }
    }

    public static class Dog extends Animal{

            public void print(){
                System.out.println("Woof");
            }
            public void bark(){
                System.out.println("Bark");
            }
    }
}


