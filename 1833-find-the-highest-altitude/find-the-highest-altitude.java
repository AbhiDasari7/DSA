class Solution {
    public int largestAltitude(int[] gain) {
        int m =0;
        int s = 0;
        for(int i = 0;i<gain.length;i++)
        {
            s = s+gain[i];
            m = Math.max(m,s);
        }
        return m;

        
        
    }
}