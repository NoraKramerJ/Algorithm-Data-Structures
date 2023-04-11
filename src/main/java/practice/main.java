package practice;

import java.util.HashMap;
import java.util.Map;

public class main {


    public static void main(String[] args) {


        Map<Employee, String>map=new HashMap<>();
       Employee employee=new Employee();
       Employee employee2=new Employee();
       map.put(employee,"r");
       map.put(employee2,"f");

        System.out.println(map.size());
    }
}
