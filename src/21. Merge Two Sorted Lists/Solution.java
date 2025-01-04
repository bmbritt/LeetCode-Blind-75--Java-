
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

        // 1 null 2 not
        // 2 null 1 not
        // both null

        //[1,3,5,7,9]
        //[2,4,6,8,9]

        //l1 remainder [3,5,7,9]
        //l2 remainder [4,6,8,9]

        while (list1 != null && list2 != null) {

            if (list2.val >= list1.val && list2.val <= list1.next.val) {
                ListNode list1_remainder = list1.next;
                ListNode list2_remainder = list2.next;

                list2.next = list1_remainder;
                list1.next = list2;
                list2 = list2_remainder;
                list1 = list1.next;
            } else {

                 





            }





        }



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