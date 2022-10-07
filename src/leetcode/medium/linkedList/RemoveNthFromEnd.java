package leetcode.medium.linkedList;

public class RemoveNthFromEnd {

    // time: O(N)
    static ListNode removeNthFrom(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;

        for (int i = 1; i <= n; ++i) fast = fast.next;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return start.next;
    }

    public static void main(String[] args) {

    }
}
