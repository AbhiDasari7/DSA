class Solution {
    public int findClosest(int x, int y, int z) {
        int a = z-x>=0?z-x : x-z;
        int b = z-y>=0?z-y: y-z;
        int c= a!=b?(a<b?1:2):0;
        return c;
        
    }
}