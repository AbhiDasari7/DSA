class Solution {
    public boolean checkGoodInteger(int n) {
        int s =0,ss=0;
        while(n>0)
        {
            int k = n%10;
            s = s+k;
            ss = ss+(k*k);
            n=n/10;
        }
        return ss-s>=50;
    }
}