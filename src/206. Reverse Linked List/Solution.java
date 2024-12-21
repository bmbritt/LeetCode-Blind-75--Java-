
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode currentNode = head;
        while (currentNode != null) {
            ListNode listRemainder = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = listRemainder;
        }
        return currentNode;
    }
}