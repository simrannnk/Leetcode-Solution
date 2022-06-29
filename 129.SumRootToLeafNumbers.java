class Solution {
    

    public void sumNumbers(TreeNode root,int number,int[] ans)
    {
        if(root==null)
        {
            return;
        }
        
        if(root.left==null && root.right==null)
        {
            number=number*10+root.val;
            ans[0]+=number;
            return;
        }
        
        number=number*10+root.val;
        sumNumbers(root.left,number,ans);
        sumNumbers(root.right,number,ans);
    }
    
    public int sumNumbers(TreeNode root) {
        int[] ans=new int[1];
        sumNumbers(root,0,ans);
        return ans[0];
        
    }
}