class Solution {
    public int xorOperation(int n, int start) {
        int r = 0;
        for(int i = 1;i<=n;i++)
        {
            r=r^start;
            start+=2;
        }
        return r;
        
        
    }
}