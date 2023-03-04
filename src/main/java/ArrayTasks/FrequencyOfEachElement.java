package ArrayTasks;

import java.util.*;

public class FrequencyOfEachElement {

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Apple", "Mango", "Apple", "Mango"};

       Arrays.stream(fruits).distinct().forEach(e-> System.out.println(Arrays.stream(fruits).filter(p->p.equals(e)).count()));

  /*
    Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
     */

    }}