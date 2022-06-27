// Add Two Numbers
class Solution {
    
      public static ListNode reverse(ListNode head){

        if(head==null || head.next==null){
            return head;
        }

        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode forw=curr.next;

            curr.next=prev;
            prev=curr;
            curr=forw;
        }

        return prev;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
      

        ListNode dummy=new ListNode(-1);
        ListNode c1=l1,c2=l2,prev=dummy;

        int carry=0;
        while(c1!=null || c2!=null || carry!=0){
            int ans=carry+(c1!=null ? c1.val : 0)+(c2!=null ? c2.val:0);
            int sum=ans%10;
            carry=ans/10;
        
        prev.next=new ListNode(sum);
        prev=prev.next;
            
            if(c1!=null){
                c1=c1.next;
            }
            
            if(c2!=null){
                c2=c2.next;
            }
    }

    ListNode head=dummy.next;


    l1=reverse(l1);
    l2=reverse(l2);

    return head;

}
}