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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;int c=0;
        Stack<Integer> st = new Stack<>();
        while(temp!=null){
            c++;
            st.push(temp.val);
            temp=temp.next;
        }
        c=c/2;temp=head;
        while(c>0){
            if(st.pop()!=temp.val)
            return false;
            c--;temp=temp.next;
        }
        return true;
        
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna