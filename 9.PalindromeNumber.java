class Solution {
    public int reverse(int num)
    {
        int revNum=0;
        while(num!=0)
        {
            int digit=num%10;
            revNum=revNum*10+digit;
            num=num/10;
        }
        
        return revNum;
    }
    
    public boolean isPalindrome(int x) {
        
       int num=reverse(x);   
        if(x<0)
        {
            return false;
        }
        if(num==x)
        {
            return true;
        }
        
        return false;        
    }
}