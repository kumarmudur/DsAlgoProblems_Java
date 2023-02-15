package leetcode.easy.recursion;

import leetcode.medium.linkedList.ListNode;

public class SwapPairs {

    // time: O(N) | space: O(N)
    public ListNode swapPairs(ListNode head) {
        if ((head == null) || (head.next == null)) return head;

        ListNode secondNode = head.next;

        // Swapping
        head.next = swapPairs(secondNode.next);
        secondNode.next = head;

        return secondNode;
    }
}
