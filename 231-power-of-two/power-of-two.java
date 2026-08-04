class Solution {
    public boolean isPowerOfTwo(int n) {
        int r = n&(n-1);
        if(n<=0)
        return false;
         else if(r==0)
        return true;
        else 
        return false;
        
    }
}