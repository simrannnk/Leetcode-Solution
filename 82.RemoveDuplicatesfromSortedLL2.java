class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null)
        {
            return head;
        }
        
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        ListNode curr=head.next;
        
        prev.next=head;
        
        while(curr!=null)
        {
            boolean loopRuns=false;
            while(curr!=null && prev.next.val==curr.val)
            {
                ListNode forw=curr.next;
                curr.next=null;
                
                curr=forw;
                loopRuns=true;
            }
            
            if(loopRuns)
            {
                prev.next=curr;
            }
            
            else{
                prev=prev.next;
                // prev.next=curr;

            }
            
            if(curr!=null)
            {
                curr=curr.next;
            }
        }
        
        return dummy.next;
    }
}