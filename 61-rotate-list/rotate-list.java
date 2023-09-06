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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
       int n=1;
       ListNode cur=head;
       while(cur.next!=null){
           cur=cur.next;
           n++;
       }
        cur.next=head;
        k=k%n;
        k=n-k;
        while(k!=0){
            cur=cur.next;
            k--;
        }
        head=cur.next;
        cur.next=null;
       
        return head;
    }
}
