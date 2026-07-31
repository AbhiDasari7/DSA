class Solution {
    public int mirrorDistance(int n) {
        int k =n;
        int r =0;
        while(n>0)
        {
            int rem = n%10;
            r=r*10+rem;
            n=n/10;
        }
        if(k-r>0)
        return k-r;
        else
        return r-k;
        
    }
}