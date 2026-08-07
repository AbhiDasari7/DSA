class Solution {
    public boolean validDigit(int n, int x) {
        String a = Integer.toString(n);
        String b = Integer.toString(x);
        if(a.contains(b)&&!(a.charAt(0)==(b.charAt(0))))
        return true;
        return false;
        
    }
}