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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ListNode ans = new ListNode();
        ListNode cur = ans;
        ListNode t1 = head;
        while (t1 != null) {
            if (!set.contains(t1.val)) {
                cur.next = new ListNode(t1.val);
                cur = cur.next;
            }
            t1 = t1.next;
        }
        return ans.next;
    }
}