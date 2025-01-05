
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode baseList = list1.val <= list2.val ? list1 : list2;
        ListNode merginList = baseList == list1 ? list2 : list1;
     
        




        



        // find pivot, insert until original list's next element is less than next of new list, find pivot again

        // find pivot
        // while l2 val <= l1 next from splice location, insert elements
        // find new pivot
        // repeat
        // end when l1 or l2 runs out of elements
        //recursive solution

        


        return null;
    }
}