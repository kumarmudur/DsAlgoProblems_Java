package leetcode.easy.linkedList;

import leetcode.medium.linkedList.ListNode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();

        ListNode currentNode = head;
        while (currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        int left = 0;
        int right = vals.size() - 1;

        while (left < right) {
            if (!vals.get(left).equals(vals.get(right))) return false;
            left++;
            right--;
        }
        return true;
    }
}
