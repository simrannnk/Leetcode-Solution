// Merge two sorted LL
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode c1=l1;
        ListNode c2=l2;
        ListNode dummy = new ListNode(-1);
        ListNode prev=dummy;
        while(c1!=null && c2!=null){
            if(c1.val<=c2.val){
                prev.next=c1;
                prev=c1;
                c1=c1.next;
            }
            
            else
            {
                prev.next=c2;
                prev=c2;
                c2=c2.next;
            }
        }
        if(c1==null){
            prev.next=c2;
        }
        
        else{
            prev.next=c1;
        }
        return dummy.next;       
    }
}
