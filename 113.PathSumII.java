class Solution {
    
    public void pathSum(TreeNode root,int targetSum,List<List<Integer>> ans,List<Integer> smallAns)
    {
        if(root==null)
        {
            return;
        }
        
        if(root.left==null && root.right==null)
        {
            if(targetSum-root.val==0)
            {
                List<Integer> base=new ArrayList<>(smallAns);
                base.add(root.val);
                ans.add(base);
                return;
            }
            
            else{
                return;
            }
        }
        
        smallAns.add(root.val);
        
        pathSum(root.left,targetSum-root.val,ans,smallAns);
        pathSum(root.right,targetSum-root.val,ans,smallAns);
        smallAns.remove(smallAns.size()-1);
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> smallAns=new ArrayList<>();
        pathSum(root,targetSum,ans,smallAns);
        return ans;
    }
}