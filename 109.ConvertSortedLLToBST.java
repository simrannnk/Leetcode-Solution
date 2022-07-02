 public TreeNode sortedListToBST(ListNode head) {
          if(head==null)
          {
              return null;
          }
          
          if(head.next==null)
          {
              return new TreeNode(head.val);
          }
          ListNode slow=head;
          ListNode fast=head;
          ListNode prev=head;
          
          while(fast!=null && fast.next!=null)
          {
              prev=slow;
              slow=slow.next;
              fast=fast.next.next;
          }
          ListNode mid=slow;
          TreeNode root=new TreeNode(mid.val);
          ListNode nhead=slow.next;
          prev.next=null;
          
         root.left= sortedListToBST(head);
          root.right=sortedListToBST(nhead);
          
          
          return root;
      }
}