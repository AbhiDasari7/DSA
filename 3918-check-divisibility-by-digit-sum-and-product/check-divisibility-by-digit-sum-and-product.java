class Solution {
    public boolean checkDivisibility(int n) {
        int d = 0,p=1;
        int x=n;
        while(n>0)
        {
            int k = n%10;
            d=d+k;
            p=p*k;
            n=n/10;
        }
    
        return x%(d+p)==0;
        
    }
}