class Solution {
     public static int combinationWithInfi(int[] arr, int tar, int idx,List<Integer> smallAns, List<List<Integer>> ans) {
        if (tar == 0) {
            List<Integer> base=new ArrayList<>(smallAns);
            ans.add(base);
            
            return 1;
        }

        int count = 0;

        for (int i = idx; i < arr.length; i++) {
            if (tar - arr[i] >= 0){
                smallAns.add(arr[i]);
                count += combinationWithInfi(arr, tar - arr[i], i,smallAns, ans);
            smallAns.remove(smallAns.size()-1);
            }
        }
        return count;
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> smallAns=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
            combinationWithInfi(candidates,target,0,smallAns,res);
        return res;
   
    }
}