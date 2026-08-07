class Solution {
    public int alternateDigitSum(int n) {
        int c =0;
        int r =0;
        while(n>0)
        {
            if(c%2==0)
            {
                r = r+n%10;
                n=n/10;
                c++;
            }
            else
            {
                r = r-n%10;
                n= n/10;
                c++;
            }

        }
        if(c%2!=0)
        return r;
        return -r;
        
    }
}