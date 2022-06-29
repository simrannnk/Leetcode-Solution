class Solution {
    
    public static ArrayList<String> KPC(String digit,int idx)
    {
        
        if(idx==digit.length())
        {
            ArrayList<String> base =new ArrayList<>();
            base.add("");
            return base;
        }
        
        String[] letters={"[","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        char ch=digit.charAt(idx);
        
        ArrayList<String> recAns=KPC(digit,idx+1);
        ArrayList<String> myAns=new ArrayList<>();
        
        String code=letters[ch-'0'];
        for(int i=0;i<code.length();i++)
        {
            char c=code.charAt(i);
            for(String s:recAns)
            {
                myAns.add(c+s);
            }
        }
        return myAns;
    }
    
    public List<String> letterCombinations(String digit) {
        
        ArrayList<String> ans=new ArrayList<>();
    
        if(digit.length()==0)
        {
            return ans;
        }
       ans=KPC(digit,0);
       
        return ans;    
    }
}