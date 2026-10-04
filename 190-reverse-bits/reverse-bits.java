class Solution {
    public int reverseBits(int n) {
        int a[] = new int[32];
        int  i = 0;
        while(n>0)
        {
            int m = n%2;
            a[i] = m==0?0:1;
            n = n/2;
            i++;
        }
        String k = "";
        for(int j =0;j<a.length;j++)
        k = k+a[j];
        int r = Integer.parseInt(k,2);
        return r;
        
        
        
        
        
    }
}