class Solution {
    
      public  int height(TreeNode root)
    {
        if(root==null)
        {
            return -1;
        }

        return Math.max(height(root.left),height(root.right))+1;
    }
    
    public static class dPair{
        int h=0;
        int d=-1;
        
        dPair(){
            
        }
        dPair(int h,int d)
        {
            this.h=h;
            this.d=d;
        }
    }
    
    public int[] diameterOfBinaryTree_(TreeNode root) {
           if(root==null)
        {
           int[] base=new int[]{0,-1};
               return base;
        }
        
        int[] left=diameterOfBinaryTree_(root.left);
        int[] right=diameterOfBinaryTree_(root.right);
        
        int[] ans=new int[2];
        
//         ans[0]=dia
//         ans[1]=height
        
        ans[0]=Math.max(Math.max(left[0],right[0]),left[1]+right[1]+2);
        
        ans[1]=Math.max(left[1],right[1])+1;  
        
        return ans;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans= diameterOfBinaryTree_(root);
        return ans[0];
    
        
    }
}