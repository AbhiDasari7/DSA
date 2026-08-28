class Solution {
    public int fib(int n) {
        int s = 0 , f = 1;
        if(n==0)
        return 0;
        if(n==1||n==2)
        return 1; 
        int r =0;
        for(int i = 2;i<=n;i++)
        {
            r = s+f;
            s = f;
            f = r;
        }
        return r;
        
    }
}