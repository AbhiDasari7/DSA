class Solution {
    public int balancedStringSplit(String s) {
        char ch[] = s.toCharArray();
        int k = 0;
        int l =0, r=0;
        for(int i =0;i<ch.length;i++)
        {
            if(ch[i]=='L')
            l++;
            else
            r++;
            if(l==r)
            {
                l = r=0;
                k++;
            }
        }
        return k;
        
        
    }
}