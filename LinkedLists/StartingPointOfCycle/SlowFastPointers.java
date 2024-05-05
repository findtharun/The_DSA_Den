package LinkedLists.StartingPointOfCycle;

public class SlowFastPointers {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                while(fast!=temp){
                    fast = slow.next;
                    temp = temp.next;
                }
                 return temp;
            }
        }
        return null;
        }
}
