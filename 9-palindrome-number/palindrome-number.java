class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int n = x;
        int r=0;
        while(x>0)
        {
            int rem = x%10;
            r = r*10+rem;
            x /=10;
        }
        if(r==n)
        return true;
        else
        return false;
    }
}