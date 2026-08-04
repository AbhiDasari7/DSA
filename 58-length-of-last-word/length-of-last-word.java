class Solution {
    public int lengthOfLastWord(String s) {
        String a[] = s.split(" ");
        int n = a.length;
        int r = a[n-1].length();
        return r;
        
    }
}