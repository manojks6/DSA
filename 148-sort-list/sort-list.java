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
    public ListNode sortList(ListNode head) {
        if(head==null){
            return null;
        }
        ArrayList<Integer> a=new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        Collections.sort(a);
        ListNode l=new ListNode(),m=l;
        for(int i:a){
            l.next=new ListNode(i);
            l=l.next;
        }
        l.next=null;
        return m.next;
    }
}