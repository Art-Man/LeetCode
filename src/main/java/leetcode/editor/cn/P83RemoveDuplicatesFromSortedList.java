//Given a sorted linked list, delete all duplicates such that each element appea
//r only once. 
//
// Example 1: 
//
// 
//Input: 1->1->2
//Output: 1->2
// 
//
// Example 2: 
//
// 
//Input: 1->1->2->3->3
//Output: 1->2->3
// 
// Related Topics 链表


package leetcode.editor.cn;

import java.util.List;

//Java：删除排序链表中的重复元素
public class P83RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        Solution solution = new P83RemoveDuplicatesFromSortedList().new Solution();
        // TO TEST
//        ListNode linked1 = new ListNode(1);
//        linked1.next = new ListNode(2);
//        linked1.next.next = new ListNode(2);
//        linked1.next.next.next = new ListNode(3);
//        ListNode listNode = solution.deleteDuplicates(linked1);
//        while (listNode.next != null) {
//            System.out.printf(listNode.val + "\n");
//            listNode = listNode.next;
//        }
//        System.out.printf(listNode.val + "\n");
       ListNode linked1 = new ListNode(1);
        linked1.next = new ListNode(1);
        linked1.next.next = new ListNode(2);
      ListNode  listNode = solution.deleteDuplicates(linked1);
        while (listNode.next != null) {
            System.out.printf(listNode.val + "\n");
            listNode = listNode.next;
        }
        System.out.printf(listNode.val + "\n");

    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head==null || head.next==null) {
                return head;
            }
            ListNode nextNode = new ListNode(head.val);
//            ListNode listNode = new ListNode(head.val);
            ListNode listNode = nextNode;
//            listNode.next = nextNode;
            while (head.next != null) {
                head = head.next;
                if (nextNode.val!=head.val) {
                    ListNode next = new ListNode(head.val);
                    nextNode.next = next;
                    nextNode = nextNode.next;
                }
            }
            return listNode;
        }
    }


//leetcode submit region end(Prohibit modification and deletion)

}