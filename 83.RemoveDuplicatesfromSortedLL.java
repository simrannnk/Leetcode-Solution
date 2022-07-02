class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode prev=head;
        ListNode curr=prev.next;
        
        while(curr!=null)
        {
            while(curr!=null && prev.val==curr.val)
            {
                ListNode forw=curr.next;
                
                curr.next=null;
                curr=forw;
            }
            
            prev.next=curr;
            prev=curr;
            
            if(curr!=null)
            {
                curr=curr.next;
            }
        }
        
        return head;
        
    }
}

// or ------------------------------------------------------------------------

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode curr=head;
        
        while(curr.next!=null )
        {
            ListNode forw=curr.next;
         
            if(forw.val==curr.val)
            {
                curr.next=forw.next;
            }
            
            else{
                curr=curr.next;
            }
             
        }
        
        return head;
    }
}