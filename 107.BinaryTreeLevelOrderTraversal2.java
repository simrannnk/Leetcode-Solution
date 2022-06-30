class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<TreeNode> que=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
        {
            List<List<Integer>> base=new ArrayList<>();
             return base;
            
        }
        que.addLast(root);
        while(que.size()!=0)
        {
            List<Integer> smallAns=new ArrayList<>();
            int size=que.size();
            while(size-->0)
            {
                TreeNode rNode=que.removeFirst();
                smallAns.add(rNode.val);
                
                
                if(rNode.left!=null)
                {
                    que.addLast(rNode.left);
                }
                if(rNode.right!=null)
                {
                    que.addLast(rNode.right);
                }
                
            }
            
            ans.add(smallAns);
        }
        Collections.reverse(ans);
        return ans;
    }
}