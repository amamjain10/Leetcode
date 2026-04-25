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
                if(head.next== null){
            return null;
        }
        int count=0;
        ListNode curnode= head;
        while(curnode!=null){
            count++;
            curnode=curnode.next;
        }
        int size =count;
        ListNode prevnode=head;
        int i=1;
        int a=size-n;
        if(a==0){
            return head.next;
        }
        while(i<a){
            prevnode=prevnode.next;
            i++;
        }
        prevnode.next=prevnode.next.next;
        return head;
    }
    }

        
    