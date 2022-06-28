//Longest Palindromic Substring
class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int maxLen=0;
        int[][] dp=new int[n][n];
        int sp=0;
        int ep=0;
        for(int gap=0;gap<n;gap++)
        {
            for(int i=0,j=gap;j<n;i++,j++)
            {
                if(gap==0)
                {
                    dp[i][j]=1;               
                }
                
                else if(gap==1)
                {
                    dp[i][j]=(s.charAt(i)==s.charAt(j))?2:0;
                }
                else if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]>0)
                {
                    dp[i][j]=dp[i+1][j-1]+2;
                }
                
                if(dp[i][j]>maxLen)
                {
                    maxLen=dp[i][j];        
                   sp=i;
                    ep=j;
                }
            }
        }
        return s.substring(sp,ep+1);
        
    }
}