//Reverse LinkedList - II

class Solution {
    
    public ListNode getNodeAt(int idx,ListNode head)
    {
        ListNode curr=head;
        while(idx-->0)
        {
            curr=curr.next;
        }
        return curr;
    }
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head.next==null)
           {
               return head;
           }
        
        int i=left-1;
        int j=right-1;
        
        while(i<j){
            ListNode first=getNodeAt(i,head);
            ListNode last=getNodeAt(j,head);
            
            int temp=first.val;
            first.val=last.val;
            last.val=temp;
            i++;
            j--;
        }
        
        return head;
    }
}

------------------------------------------------------------------

class Solution {
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head.next==null && left==right)
        {
            return head;
        }
        ListNode th=null;
        ListNode tt=null;
        ListNode prev=null;
        
        ListNode curr=head;
        int i=1;
        while(curr!=null)
        {
            while(i>=left && i<=right)
            {
                ListNode forw=curr.next;
                curr.next=th;
                th=curr;
                
                if(tt==null)
                {
                    tt=curr;
                }
                
                curr=forw;
                i++;
            }
            
            if(i>right)
            {
                if(prev==null)
                {
                    tt.next=curr;
                    return th;
                }
                
                else{
                    prev.next=th;
                    tt.next=curr;
                    return head;
                }
            }
            
            prev=curr;
            curr=curr.next;
            i++;
        }
        return null;
    }
}