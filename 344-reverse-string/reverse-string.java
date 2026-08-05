class Solution {
    public void reverseString(char[] s) {
        char n[] = new char[s.length];
        for(int i=0,j=s.length-1;i<s.length;i++,j--)
        {
            n[i] = s[j];
        }
        for(int i=0;i<n.length;i++)
        s[i]=n[i];
    
        
    }
}