class Solution {
    public int digitFrequencyScore(int n) {
            int c =0;
            int r=0;
            while(n>0)
            {
               r=n%10;
                c=c+r;
                n=n/10;
            }
            return c;
    }
}