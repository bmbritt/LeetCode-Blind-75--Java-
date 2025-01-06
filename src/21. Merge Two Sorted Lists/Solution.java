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
        if (list1 == null || list2 == null) {
            return (list1 == null) ? list2 : list1;
        } else {
            ListNode BaseList = (list1.val <= list2.val) ? list1 : list2;
            ListNode MergeList = (BaseList == list1) ? list2 : list1;
            ListNode BaseElement = BaseList;

            while (MergeList != null) {
                if (BaseElement.next == null) {
                    BaseElement.next = MergeList;
                    break;
                }
                if (MergeList.val > BaseElement.next.val) {
                    BaseElement = BaseElement.next;
                    continue;
                } else {
                    ListNode MergeListRemainder = MergeList.next;
                    MergeList.next = BaseElement.next;
                    BaseElement.next = MergeList;
                    
                    MergeList = MergeListRemainder;
                    BaseElement = BaseElement.next;
                }
            }
            return BaseList;
        }
    }
}