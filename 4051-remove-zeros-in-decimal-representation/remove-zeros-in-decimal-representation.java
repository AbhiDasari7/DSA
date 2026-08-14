class Solution {
    public long removeZeros(long n) {
        long r = 0;
        while(n>0)
        {
            if(n%10!=0)
            r=r*10+(n%10);
            n = n/10;

        }
        long a =0;
        while(r>0)
        {
            a = a*10+(r%10);
            r=r/10;
        }
        return a;
        
    }
}