class Solution {
    public int firstMatchingIndex(String s) {
        int k = s.length();
        for(int i =0,j=s.length()-1;i<s.length();i++,j--)
        {
            if(s.charAt(i)==s.charAt(j))
            return i;
        }
        return -1;
        
    }
}