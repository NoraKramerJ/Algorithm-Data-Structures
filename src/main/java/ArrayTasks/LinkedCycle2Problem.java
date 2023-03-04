package ArrayTasks;

import java.util.HashSet;
import java.util.Set;

public class LinkedCycle2Problem {


    public static void main(String[] args) {


        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n2;

        System.out.println(detectCycle(n1).val);

    }

public static ListNode detectCycle(ListNode head){
    Set<ListNode> visited=new HashSet<>();
    ListNode cur=head;
    while(cur!=null){
        if(visited.contains(cur))return cur;
        visited.add(cur);
        cur=cur.next;
    }
        return null;

}



}
