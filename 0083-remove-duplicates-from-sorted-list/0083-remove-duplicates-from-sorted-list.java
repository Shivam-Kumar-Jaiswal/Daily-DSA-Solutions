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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return head;

        ListNode temp1=head;
        ListNode temp2;

        if(head.next!=null)
            temp2=head.next;
        else
            return head;
    
        while(temp2!=null){
            while(temp2!=null&&temp1.val==temp2.val){
                temp2=temp2.next;
            }
            temp1.next=temp2;
            temp1=temp2;
            if(temp2!=null)
                temp2=temp2.next;
        }
    return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna