class Solution {
    
    public int length(ListNode head)
    {
        ListNode curr=head;
        int len=0;
        while(curr!=null)
        {
            curr=curr.next;
            len++;
        }
        
        return len;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        
    if(head.next==null || k==1)
    {
        return head;
    }
        ListNode th=null;
        ListNode tt=null;
        
        ListNode ph=null;
        ListNode pt=null;
        
        ListNode curr=head;
        int len=length(head);
        while(curr!=null && len>=k)
        {
            int itr=k;
            while(itr-->0)
            {
                ListNode forw=curr.next;
                curr.next=th;
                th=curr;
                
                if(tt==null)
                {
                    tt=curr;
                }
                curr=forw;
            }
            
            if(pt==null)
            {
                ph=th;
                pt=tt;
            }
            else{
                pt.next=th;
                pt=tt;
            }
            
            th=null;
            tt=null;
            len=len-k;
        }
        
      if(curr!=null)
      {
          pt.next=curr;
      }
        return ph;
        
    }
}