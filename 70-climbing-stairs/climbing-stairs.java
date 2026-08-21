class Solution {
    public int climbStairs(int n) {
        if(n==1||n==2)
        return n;
        int f = 1 , s = 2, ans = 0;
        for(int i =3;i<=n;i++)
        {
            ans = f+s;
            f = s;
            s = ans;
        }
        return ans;

        
         
        
    }
}