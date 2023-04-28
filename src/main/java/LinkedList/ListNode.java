package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



    class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Base case 1: if list1 is empty, return list2
        if (list1 == null) {
            return list2;
        }
        // Base case 2: if list2 is empty, return list1
        if (list2 == null) {
            return list1;
        }
        // Compare the values of the first nodes of list1 and list2
        if (list1.val < list2.val) { //2, 7
            // If the first node of list1 is smaller, merge the rest of list1 with list2
            // and make the first node of list1 the head of the merged list
            list1.next = mergeTwoLists(list1.next, list2); //merge the rest of list1 with list2
            return list1;//make the first node of list1 the head of the merged list
        } else {
            // Otherwise, merge the rest of list2 with list1
            // and make the first node of list2 the head of the merged list
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;//
        }
    }
    public static void main(String[] args) {

    }
}