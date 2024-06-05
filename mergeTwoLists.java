import java.util.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
// pabda
}
public class mergeTwoLists{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(l1!=null && l2!= null){
            if(l1.val<=l2.val){
                curr.next = l1;
                l1 = l1.next;
            }else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;

        }
        curr.next = l1!=null ? l1:l2;
        return dummy.next;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(7);

        Solution sol = new Solution();
        ListNode mergedLists = sol.mergeTwoLists(l1, l2);

        while(mergedLists!=null){
            System.out.print(mergedLists.val + " ");
            mergedLists = mergedLists.next;
        }
    }
}