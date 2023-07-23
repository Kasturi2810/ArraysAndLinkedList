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
    public ListNode reverseKGroup(ListNode head, int k) {
        int cnt = 0;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode temp = dummy;
        while(temp.next != null){
            temp = temp.next;
            cnt++;
        }
        temp = dummy;
        while(temp.next != null){
            if(cnt <k)
                break;
            int nodes = k-1;
            ListNode tempNext = temp.next;
            ListNode first = temp.next;
            ListNode second = first.next;

            while(nodes-- >0){
                 ListNode next = second.next;
                 second.next = first;
                 first = second;
                 second = next;
            }
            cnt = cnt - k;
            temp.next = first;
            tempNext.next = second;
            temp = tempNext;

        }
        return dummy.next;
        
    }
}
