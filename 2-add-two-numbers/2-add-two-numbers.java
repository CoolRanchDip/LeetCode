/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode returnNode = null;
        ListNode prevReturnNode = null;
        ListNode curReturnNode = null;
        boolean carry = false;
        int sum = 0;
        while (l1 != null || l2 != null) {
            sum = 0;
            if (l1 != null) {
                sum += l1.val;
            }
            if (l2 != null) {
                sum += l2.val;
            }
            if (carry == true) {
                sum += 1;
                carry = false;
            }
            if (sum >= 10) {
                carry = true;
                sum -= 10;
            }
            ListNode newSumNode = new ListNode(sum);
            if (returnNode == null) {
                returnNode = newSumNode;
                prevReturnNode = returnNode;
            }
            else {
                prevReturnNode.next = newSumNode;
                prevReturnNode = prevReturnNode.next;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry == true) {
            prevReturnNode.next = new ListNode(1);
        }
        return returnNode;
    }
}