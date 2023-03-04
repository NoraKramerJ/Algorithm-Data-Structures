package ArrayTasks;

import java.util.HashMap;
import java.util.Map;

public class LargestRectangularArea {

    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
    public static int largestRectangleArea(int[] heights) {
      int max=0;
        Map<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < heights.length ; i++) {
            int min=Integer.MAX_VALUE;
            for (int j = i; j < heights.length; j++) {
                min=Math.min(min,heights[j]);
                max=Math.max(max,min*(j-i+1));
            }
        }
        return max;
    }}



 /*
    Largest Rectangular Area in a Histogram
    Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of
    a number of contiguous bars. For simplicity, assume that all bars have same width and the width is 1 unit.

    For example, consider the following histogram with 7 bars of heights {6, 2, 5, 4, 5, 1, 6}.
     The largest possible rectangle possible is 12

     */
