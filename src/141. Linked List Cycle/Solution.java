/*
 * This solution uses Floyd's tortoise and hair
 * algorithm to detect cycles with a slow and fast
 * step in O(N) time and O(1) memory.
*/

//Class definition for singly-linked list node
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
       }
}