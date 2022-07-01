class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode curr=head;
        
        if(head==null || head.next==null)
        {
            return head;
        }
        
        while(curr!=null)
        {
        
            ListNode forw=curr.next;
            
            if(forw==null)
            {
                break;
            }
            
            int temp=curr.val;
            curr.val=forw.val;
            forw.val=temp;
            
            curr=forw.next;
        }
        
        return head;
    }
}