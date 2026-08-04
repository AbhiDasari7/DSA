class Solution {
    public boolean isPowerOfThree(int n) {
        long b = 1162261467;
        if(n<=0)
        return false;
         else if(b%n==0)
        return true;
        else
        return false;
    }
}