//Merge two sorted linked lists and return it as a new sorted list. The new list
// should be made by splicing together the nodes of the first two lists. 
//
// Example: 
//
// 
//Input: 1->2->4, 1->3->4
//Output: 1->1->2->3->4->4
// 
// Related Topics 链表


package leetcode.editor.cn;

import java.util.List;

//Java：合并两个有序链表
public class P21MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution solution = new P21MergeTwoSortedLists().new Solution();
        // TO TEST
        ListNode linked1 = new ListNode(1);
        linked1.next = new ListNode(2);
        linked1.next.next = new ListNode(4);
        linked1.next.next.next = new ListNode(5);
        ListNode linked2 = new ListNode(1);
        linked2.next = new ListNode(3);
        linked2.next.next = new ListNode(4);
        linked2.next.next.next = new ListNode(7);
        ListNode linked3 = solution.mergeTwoLists(linked1, linked2);
        while (linked3.next != null) {
            System.out.printf(linked3.val + "\n");
            linked3 = linked3.next;
        }
        System.out.printf(linked3.val + "\n");

    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode mergeTwoLists(ListNode linked1, ListNode linked2) {
            if (linked1==null) {
                return linked2;
            }
            if (linked2 == null) {
                return linked1;
            }
            ListNode currList = new ListNode();
            ListNode listNode =currList;
            while (linked2 != null && linked1 != null) {
                ListNode currNode = new ListNode();
                if (linked1.val < linked2.val) {
                    currNode.val = linked1.val;
                    linked1 = linked1.next;
                } else if (linked1.val >= linked2.val) {
                    currNode.val = linked2.val;
                    linked2 = linked2.next;
                }
                currList.next = currNode;
                currList = currList.next;
            }
            //然后把那个不为空的链表挂到新的链表中 ???????? 为啥都死循环到空了，还需要补充？？？
            currList.next = linked1 == null ? linked2 : linked1;
            return listNode.next;


//            //下面4行是空判断
//            if (linked1 == null)
//                return linked2;
//            if (linked2 == null)
//                return linked1;
//            ListNode dummy = new ListNode(0);
//            ListNode curr = dummy;
//            while (linked1 != null && linked2 != null) {
//                //比较一下，哪个小就把哪个放到新的链表中
//                if (linked1.val <= linked2.val) {
//                    curr.next = linked1;
//                    linked1 = linked1.next;
//                } else {
//                    curr.next = linked2;
//                    linked2 = linked2.next;
//                }
//                curr = curr.next;
//            }
//            //然后把那个不为空的链表挂到新的链表中
//            curr.next = linked1 == null ? linked2 : linked1;
//            return dummy.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

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
// ListNode is a class for storing a single node of a linked list storing
// integer values.  It has two public data fields for the data and the link to
// the next node in the list and has three constructors:
//   public ListNode()
//     creates node with data 0, null link
//   public ListNode(int data)
//     creates node with given data, null link
//   public ListNode(int data, ListNode next)
//     creates node with given data and given link
//
//class ListNode {
//    public int data;       // data stored in this node
//    public ListNode next;  // link to next node in the list
//
//    // post: constructs a node with data 0 and null link
//    public ListNode() {
//        this(0, null);
//    }
//
//    // post: constructs a node with given data and null link
//    public ListNode(int data) {
//        this(data, null);
//    }
//
//    // post: constructs a node with given data and given link
//    public ListNode(int data, ListNode next) {
//        this.data = data;
//        this.next = next;
//    }
//}