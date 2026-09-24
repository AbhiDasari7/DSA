class Solution {
    public int reverseDegree(String s) {
        char a[] = s.toCharArray();
        int k = 0;
        for(int i =0;i<a.length;i++)
        {
            int r = Math.abs(27-(a[i]-96));
            k = k+(r*(i+1));
        }
        return k;
        
    }
}