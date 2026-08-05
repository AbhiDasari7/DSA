class Solution {
    public int maxPower(String s) {
        int m = 0,c=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            c++;
            else
            c=0;
            if(c>m)
            m=c;

        }
        return m+1;
        
    }
}