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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode m=new ListNode(),f=m,s=m,p=head;
        m.next=head;
        if(head==null){
            return head;
        }
        if(head.next==null){
    
        }
        while(n--!=0){
            f=f.next;
        }
        while(f.next!=null){
            f=f.next;
            s=s.next;
        }
        s.next=(s.next).next;
        return m.next;
    }
}