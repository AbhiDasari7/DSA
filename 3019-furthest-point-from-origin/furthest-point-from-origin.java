class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int u = 0;
        int l = 0,r=0;
        for(int i = 0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='_')
            u++;
            else if(moves.charAt(i)=='L')
            l++;
            else
            r++;
        }
        int c = l>r?l:r;
        int d = c==l?r:l;
        return c+u-d;
        
    }
}