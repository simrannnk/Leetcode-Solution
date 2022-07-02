class Solution {
    public TreeNode constructBST(int[] nums,int si,int ei)
    {
        if(si>ei)
        {
            return null;
        }
        
        int mid=(si+ei)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=constructBST(nums,si,mid-1);
        root.right=constructBST(nums,mid+1,ei);
        
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return constructBST(nums,0,nums.length-1);
        
        
    }
}